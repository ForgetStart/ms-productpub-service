package com.hc360.product.controller;

import com.alibaba.fastjson.JSON;
import com.hc360.b2b.util.DateUtils;
import com.hc360.product.po.BusinTempParam;
import com.hc360.product.po.BusinTempParamNew;
import com.hc360.product.po.PdfSave;
import com.hc360.product.po.PdfShow;
import com.hc360.product.service.BusinPdfDataService;
import com.hc360.product.service.BusinTempParamService;
import com.hc360.product.service.SendMessageService;
import com.hc360.product.vo.*;
import com.hc360.product.vo.result.BaseResult;
import com.hc360.product.vo.result.ReturnCode;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class ProductOtherController {

    private static Logger log = LoggerFactory.getLogger("ProductOtherController");

    @Autowired
    private BusinTempParamService businTempParamService;
    @Autowired
    private BusinPdfDataService businPdfDataService;


    /**
     * 拒审或修改商机发送jms消息
     *
     * @param sendMessageParam
     * @return
     * @author hk
     * @date 2019-02-17
     */
    @RequestMapping(value = "/sendbusinmessage", method = RequestMethod.POST)
    public BaseResult<Boolean> sendRefuseEditBusinMessage(@RequestBody SendMessageParam sendMessageParam) throws Exception {
        BaseResult<Boolean> result = new BaseResult<Boolean>();
        if (sendMessageParam == null || sendMessageParam.getBcid() == null || sendMessageParam.getBcid() <= 0
                || sendMessageParam.getProviderid() == null || sendMessageParam.getProviderid() <= 0 || StringUtils.isBlank(sendMessageParam.getUsername())
                || StringUtils.isBlank(sendMessageParam.getChecked())) {

            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            JSONArray ja = new JSONArray();
            JSONObject jo = new JSONObject();
            jo.put("bcid", sendMessageParam.getBcid());
            jo.put("providerid", sendMessageParam.getProviderid());
            jo.put("username", sendMessageParam.getUsername());
            jo.put("pushtime", (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(new Date()));
            ja.add(jo);
            if ("2".equals(sendMessageParam.getChecked())) {
                SendMessageService.sendRefuseMessage(ja.toString());
            } else if (sendMessageParam.getEditflag()) {
                SendMessageService.sendEditMessage(ja.toString());
            }
            result.setErrcode(ReturnCode.OK.getErrcode());
            result.setErrmsg(ReturnCode.OK.getErrmsg());
        } catch (Exception e) {
            log.error("商机拒审或修改发送jms消息失败！商机id:" + sendMessageParam.getBcid(), e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }
        return result;
    }

    /**
     * 发送jms消息，实现算分
     * @param sendMessageParam
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/sendbusinstarmessage", method = RequestMethod.POST)
    public BaseResult<Boolean> sendBusinStarMessage(@RequestBody SendMessageParam sendMessageParam) throws Exception {
        BaseResult<Boolean> result = new BaseResult<Boolean>();
        if (sendMessageParam == null || sendMessageParam.getBcid() == null || sendMessageParam.getBcid() <= 0
                || sendMessageParam.getProviderid() == null || sendMessageParam.getProviderid() <= 0
                || StringUtils.isBlank(sendMessageParam.getUnchecked())) {

            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            //操作类型，0新发待审，1新发免审，2修改待审，3修改免审，4未过期重发，5过期重发，6转过期，7删除，8审核通过，9拒审
            int oper = 0;
            if ("1".equals(sendMessageParam.getUnchecked())) {
                if(!sendMessageParam.getEditflag()){
                    oper = 1;
                }else{
                    oper =3;
                }
            }else{
                if(!sendMessageParam.getEditflag()){
                    oper = 0;
                }else{
                    oper = 2;
                }
            }

            String message = "{\"@type\":\"com.hc360.bcs.bo.BusinInfo\",\"bcid\":\""+sendMessageParam.getBcid()
                    +"\"," +"\"oper\":\""+oper+"\"," +"\"scoreIdentity\":\"111111\",\"userid\":"+sendMessageParam.getProviderid()+"}";

            boolean sendResult = SendMessageService.sendStarMessage(message);
            result.setData(sendResult);
            result.setErrcode(ReturnCode.OK.getErrcode());
            result.setErrmsg(ReturnCode.OK.getErrmsg());
        } catch (Exception e) {
            log.error("商机拒审或修改发送jms消息失败！商机id:" + sendMessageParam.getBcid(), e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }
        return result;
    }


    /**
     * 保存临时参数信息
     *
     * @param businTempParamVO
     * @return
     * @author hk
     * @date 2019-02-17
     */
    @RequestMapping(value = "/savetempparam", method = RequestMethod.POST)
    public BaseResult<Boolean> saveTempParam(@RequestBody BusinTempParamVO businTempParamVO) throws Exception {
        BaseResult<Boolean> result = new BaseResult<Boolean>();

        try {

            BusinTempParamNew businTempParam = null;
            BusinTempParam btp = null;
            List<BusinTempParamNew> list = new ArrayList<BusinTempParamNew>();
            List<BusinTempParam> tmpAttlist = businTempParamVO.getTmpAttlist();
            for (int i = 0; i < tmpAttlist.size(); i++) {
                businTempParam = new BusinTempParamNew();
                btp = tmpAttlist.get(i);
                businTempParam.setBcid(btp.getBcid());
                businTempParam.setCategoryid(btp.getCategoryname());
                businTempParam.setIstempitem(btp.getIstempitem());
                businTempParam.setPublishtime(btp.getPublishtime());
                businTempParam.setTmpname(btp.getTmpname());
                businTempParam.setTmpvalname(btp.getTmpvalname());
                list.add(businTempParam);
            }

            //如果是自定义参数值。就添加到临时参数表， 一起保存
            List<MMTAttItem> attList = businTempParamVO.getAttlist();
            if (attList != null && attList.size() > 0) {
                for (MMTAttItem mmtAttItem : attList) {
                    if (mmtAttItem.getIsTempValue() != null && "1".equals(mmtAttItem.getIsTempValue())) {
                        businTempParam = new BusinTempParamNew();
                        businTempParam.setBcid(businTempParamVO.getBcid());
                        businTempParam.setCategoryid(businTempParamVO.getCatid());
                        businTempParam.setTmpname(mmtAttItem.getAttname());
                        businTempParam.setTmpvalname(mmtAttItem.getAttvalue());
                        //自定义参数时，只填写参数项或参数值时不保存
                        if (businTempParam.getTmpname() == null || "".equals(businTempParam.getTmpname().trim())) {
                            continue;
                        }
                        if (businTempParam.getTmpvalname() == null || "".equals(businTempParam.getTmpvalname().trim())) {
                            continue;
                        }
                        businTempParam.setIstempitem("0");
                        businTempParam.setPublishtime(DateUtils.getSysTimestamp());
                        list.add(businTempParam);
                    }
                }
            }


            if (list != null && list.size() > 0) {
                if (!businTempParamVO.isBatchModifiy()) {
                    if ("1".equals(businTempParamVO.getChecked()) && "免审".equals(businTempParamVO.getCheckman())) {

                        businTempParamService.delTempParamNew(businTempParamVO.getBcid());
                        for (int i = 0; i < list.size(); i++) {
                            businTempParam = (BusinTempParamNew) list.get(i);
                            if (businTempParam != null) {
                                businTempParam.setBcid(businTempParamVO.getBcid());
                                businTempParam.setCategoryid(businTempParamVO.getCatid());
                                businTempParam.setProviderid(businTempParamVO.getProviderid());
                                businTempParamService.saveTempParamNew(businTempParam);
                            }
                        }

                    }
                } else {
                    if ("1".equals(businTempParamVO.getChecked()) && "免审".equals(businTempParamVO.getCheckman())) {
                        for (int i = 0; i < list.size(); i++) {
                            businTempParam = (BusinTempParamNew) list.get(i);
                            if (businTempParam != null) {
                                businTempParamService.delBatchTempParamNew(businTempParamVO.getBcid(), businTempParam.getTmpname());
                                businTempParam.setBcid(businTempParamVO.getBcid());
                                businTempParam.setCategoryid(businTempParamVO.getCatid());
                                businTempParam.setProviderid(businTempParamVO.getProviderid());
                                businTempParamService.saveTempParamNew(businTempParam);
                            }
                        }

                    }
                }
            }

            result.setErrcode(ReturnCode.OK.getErrcode());
            result.setErrmsg(ReturnCode.OK.getErrmsg());
        } catch (Exception e) {
            log.error("保存临时参数消息失败！商机id:" + businTempParamVO.getBcid(), e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }
        return result;
    }


    /**
     * 保存pdf等产品资料信息
     *
     * @param businPdfParamVO
     * @return
     * @author hk
     * @date 2019-02-17
     */
    @RequestMapping(value = "/savebusinpdf", method = RequestMethod.POST)
    public BaseResult<Boolean> saveBusinPDF(@RequestBody BusinPdfParamVO businPdfParamVO) throws Exception {
        BaseResult<Boolean> result = new BaseResult<Boolean>();

        try {
            long pdfshowid = businPdfParamVO.getPdfshowid();
            long bcid = businPdfParamVO.getBcid();
            String pdfshowidsdelete = businPdfParamVO.getPdfshowiddelete();
            //当存在商机的时候，先删除之前的绑定pdf的商机信息
            if (bcid > 0) {
                businPdfDataService.delPdfPDFSave(bcid);
                if (pdfshowid > 0) {
                    PdfSave pdfsave = new PdfSave();
                    pdfsave.setBcid(businPdfParamVO.getBcid());
                    pdfsave.setPdfshowid(pdfshowid);
                    businPdfDataService.savePdfInfo(pdfsave);
                }
            }
            if (!"".equals(pdfshowidsdelete)) {
                businPdfDataService.delPdfPDFShow(pdfshowidsdelete);
            }

//			写入pdf的缓存 放在网关层即可
//			if(businPdfParamVO.getPdfname() != null && !"".equals(businPdfParamVO.getPdfname().trim()) && businPdfParamVO.getPdfpath() != null && !"".equals(businPdfParamVO.getPdfpath().trim())) {
//				PDFBusinMO mo = new PDFBusinMO(Long.parseLong(busin.getBcid()));
//				mo.setPdfname(busin.getPdfname());
//				mo.setPdfurl(busin.getPdfpath());
//				MemcachedHelper.put(Long.parseLong(busin.getBcid()), mo,true);
//
//			}
            result.setErrcode(ReturnCode.OK.getErrcode());
            result.setErrmsg(ReturnCode.OK.getErrmsg());
        } catch (Exception e) {
            log.error("保存pdf信息失败！商机id:" + businPdfParamVO.getBcid(), e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }
        return result;
    }


    /**
     * 保存上传数据到pdf_show表中
     *
     * @param pdfshow
     * @return
     * @author hk
     * @date 2019-03-05
     */
    @RequestMapping(value = "/savepdfshowinfo", method = RequestMethod.POST)
    public BaseResult<PdfShow> savePdfShowInfo(@RequestBody PdfShow pdfshow) throws Exception {
        BaseResult<PdfShow> result = new BaseResult<PdfShow>();
        result.setData(pdfshow);

        if (pdfshow == null || pdfshow.getProviderid() <= 0 || StringUtils.isBlank(pdfshow.getPdfname()) || StringUtils.isBlank(pdfshow.getPdfurl())
                || StringUtils.isBlank(pdfshow.getAdduser())) {
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            businPdfDataService.savePdfShowInfo(pdfshow);
            result.setErrcode(ReturnCode.OK.getErrcode());
            result.setErrmsg(ReturnCode.OK.getErrmsg());
        } catch (Exception e) {
            log.error("保存pdf信息到pdf_show失败！用户providerid:" + pdfshow.getProviderid(), e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }
        return result;
    }


    /**
     * 获取用户产品资料信息
     *
     * @param providerid
     * @param pdfshowid
     * @return
     * @author hk
     * @date 2019-03-01
     */
    @RequestMapping(value = "/getbusinpdfinfo")
    public BaseResult<PdfShow> getBusinPdfInfo(@RequestParam("providerid") Long providerid, @RequestParam("pdfshowid") Long pdfshowid) throws Exception {
        BaseResult<PdfShow> result = new BaseResult<PdfShow>();

        if (providerid == null || pdfshowid == null || providerid <= 0 || pdfshowid <= 0) {
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            PdfShow pdfShowInfo = businPdfDataService.getPdfShowInfo(providerid, pdfshowid);
            result.setData(pdfShowInfo);
            result.setErrcode(ReturnCode.OK.getErrcode());
            result.setErrmsg(ReturnCode.OK.getErrmsg());
        } catch (Exception e) {
            log.error("获取用户产品资料信息！商机id:" + providerid + " 对应id：" + pdfshowid, e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }
        return result;

    }


    /**
     * 根据pdfshowId和bcid查看绑定数量
     *
     * @param pdfshowid
     * @param bcid
     * @throws Exception
     * @author hk
     * @date 2019-03-05
     */
    @RequestMapping(value = "/countbusinpdfinfo")
    public BaseResult<Integer> countBusinPdfInfo(@RequestParam("pdfshowid") Long pdfshowid, @RequestParam("bcid") Long bcid) throws Exception {
        BaseResult<Integer> result = new BaseResult<Integer>();

        if (pdfshowid == null || pdfshowid <= 0) {
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }
        try {
            int count = businPdfDataService.countBindPdfShow(pdfshowid, bcid);
            result.setData(count);
            result.setErrcode(ReturnCode.OK.getErrcode());
            result.setErrmsg(ReturnCode.OK.getErrmsg());
        } catch (Exception e) {
            log.error("根据pdfshowId和bcid查看绑定数量服务异常！商机id:" + bcid + " 对应pdfshowid：" + pdfshowid, e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }
        return result;

    }

    /**
     * 根据商品ID 获取绑定pdf文档
     *
     * @param bcid
     * @throws Exception
     * @author hk
     * @date 2019-03-05
     */
    @RequestMapping(value = "/getpdfbybcid")
    public BaseResult<PdfShow> getPdfByBcid(@RequestParam("bcid") Long bcid) throws Exception {
        BaseResult<PdfShow> result = new BaseResult<PdfShow>();

        if (bcid == null || bcid <= 0) {
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }
        try {
            PdfShow pdfshow = businPdfDataService.getPdfByBcid(bcid);
            result.setData(pdfshow);
            result.setErrcode(ReturnCode.OK.getErrcode());
            result.setErrmsg(ReturnCode.OK.getErrmsg());
        } catch (Exception e) {
            log.error("根据商品ID获取绑定pdf文档服务异常！商机id:" + bcid, e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }
        return result;

    }

    /**
     * 获取用户资料列表：页面展示的pdf数据，状态为1，按照上传时间排序，倒序
     *
     * @param providerid
     * @throws Exception
     * @author hk
     * @date 2019-03-05
     */
    @RequestMapping(value = "/getpdfshowlist")
    public BaseResult<List<PdfShow>> getPdfShowList(@RequestParam("providerid") Long providerid) throws Exception {
        BaseResult<List<PdfShow>> result = new BaseResult<List<PdfShow>>();

        if (providerid == null || providerid <= 0) {
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }
        try {
            List<PdfShow> pdfShowList = businPdfDataService.getPdfShowList(providerid);
            result.setData(pdfShowList);
            result.setErrcode(ReturnCode.OK.getErrcode());
            result.setErrmsg(ReturnCode.OK.getErrmsg());
        } catch (Exception e) {
            log.error("获取用户资料列表异常！providerid:" + providerid, e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }
        return result;

    }


    /**
     * 上传pdf的时候查询数据库，判断是否重名
     * 获取用户资料相同文件数量
     *
     * @param providerid
     * @param pdfname
     * @return
     * @throws Exception
     * @author hk
     * @date 2019-03-05
     */
    @RequestMapping(value = "/countpdfsamenamelist")
    public BaseResult<Integer> countPdfSameNameList(@RequestParam("providerid") Long providerid, @RequestParam("pdfname") String pdfname) throws Exception {
        BaseResult<Integer> result = new BaseResult<Integer>();

        if (providerid == null || providerid <= 0 || StringUtils.isBlank(pdfname)) {
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }
        try {
            int count = businPdfDataService.countPdfSameNameList(providerid, pdfname);
            result.setData(count);
            result.setErrcode(ReturnCode.OK.getErrcode());
            result.setErrmsg(ReturnCode.OK.getErrmsg());
        } catch (Exception e) {
            log.error("获取用户资料相同文件数量异常！providerid:" + providerid + "文件名：" + pdfname, e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }
        return result;

    }


    /**
     * 查询用户 pdfshow表里上传的文件总数
     *
     * @param providerid
     * @throws Exception
     * @author hk
     * @date 2019-03-05
     */
    @RequestMapping(value = "/countpdfshowbyproviderid")
    public BaseResult<Integer> countPdfShowByProviderid(@RequestParam("providerid") Long providerid) throws Exception {
        BaseResult<Integer> result = new BaseResult<Integer>();

        if (providerid == null || providerid <= 0) {
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }
        try {
            int count = businPdfDataService.countPdfShowByProviderid(providerid);
            result.setData(count);
            result.setErrcode(ReturnCode.OK.getErrcode());
            result.setErrmsg(ReturnCode.OK.getErrmsg());
        } catch (Exception e) {
            log.error("查询用户上传的文件资料总数异常！providerid:" + providerid, e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }
        return result;

    }

}
