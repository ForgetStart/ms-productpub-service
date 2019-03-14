package com.hc360.product.controller;

import com.hc360.b2b.util.StringUtils;
import com.hc360.product.service.OnBusinChanceService;
import com.hc360.product.vo.BusinLimitParam;
import com.hc360.product.vo.result.BaseResult;
import com.hc360.product.vo.result.ReturnCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Auther: Administrator
 * @Date: 2019/2/28 16:14
 * @Description:
 */
@RestController
@RequestMapping("/v1/product")
public class ProductMessageController {

    private static Logger log = LoggerFactory.getLogger("ProductMessageController");

    @Resource
    private OnBusinChanceService onBusinChanceService;


    /**
     * 获得会员发布的供应信息数量
     *
     * @param providerid
     *        企业ID
     * @return　返回会员发布的供应信息数量（已上网的数量）
     * @throws Exception
     */
    @RequestMapping("/pubnum/{providerid}")
    public BaseResult<Integer> corPubInfoNum(@PathVariable("providerid") long providerid){
        BaseResult<Integer> result = new BaseResult<>();

        if(providerid == 0){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            int count = onBusinChanceService.corPubInfoNum(providerid);
            result.setData(count);
            result.setErrcode(ReturnCode.OK.getErrcode());
        }catch (Exception e){
            log.error("返回会员发布的供应信息数量异常", e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }
        return result;
    }


    /**
     * 在线产品总数（在售+审核中+已过期）
     * @param providerid
     * @return
     */
    @RequestMapping("/getbusincount/{providerid}")
    public BaseResult<Integer> getBusinCount(@PathVariable("providerid") long providerid){
        BaseResult<Integer> result = new BaseResult<>();

        if(providerid == 0){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        String today = StringUtils.formatDate(new Date(), "yyyy-MM-dd");

        try {
            int count = onBusinChanceService.getBusinCount(providerid, today);
            result.setData(count);
            result.setErrcode(ReturnCode.OK.getErrcode());
        }catch (Exception e){
            log.error("查询在线产品总数（在售+审核中+已过期）异常", e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }

        return result;
    }


    /**
     * 获取用户可发送的商机上限
     * @param businLimitParam
     * @return
     */
    @RequestMapping(value = "/findbusinlimit", method = RequestMethod.POST)
    public BaseResult<Integer> findBusinLimit(@RequestBody BusinLimitParam businLimitParam){
        BaseResult<Integer> result = new BaseResult<>();

        if(null == businLimitParam){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            int count = onBusinChanceService.findBusinLimit(businLimitParam);
            result.setData(count);
            result.setErrcode(ReturnCode.OK.getErrcode());
        }catch (Exception e){
            log.error("获取用户可发送的商机上限异常", e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }

        return result;
    }



    /**
     * 根据行业id，判断是否该行业被限制发布商机的数目 返回值大于0 存在行业限制
     * @param areaId
     * @return
     */
    @RequestMapping("/findbusinarealimit/{areaId}")
    public BaseResult<Integer> findBusinAreaLimit(@PathVariable("areaId") String areaId){
        BaseResult<Integer> result = new BaseResult<>();

        if(null == areaId || "".equals(areaId)){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            int count = onBusinChanceService.isExistAreaLimit(areaId);
            result.setData(count);
            result.setErrcode(ReturnCode.OK.getErrcode());
        }catch (Exception e){
            log.error("根据行业id，判断是否该行业被限制发布商机的数目 返回值大于0 存在行业限制异常", e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }

        return result;
    }


    /**
     * 炫铺分类商机统计
     * @param providerId
     * @param seriesid      炫铺分类id
     * @return
     */
    @RequestMapping("/findcoolshop/{providerId}/{seriesid}")
    public BaseResult<Integer> findBcNumBySeriesId(@PathVariable("providerId") Long providerId, @PathVariable("seriesid") Long seriesid){
        BaseResult<Integer> result = new BaseResult<>();

        if(null == providerId || null == seriesid){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            int count = onBusinChanceService.findBcNumBySeriesId(providerId, seriesid);
            result.setData(count);
            result.setErrcode(ReturnCode.OK.getErrcode());
        }catch (Exception e){
            log.error("炫铺分类商机统计异常", e);
            result.setErrcode(ReturnCode.ERROR_EXCEPTION.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_EXCEPTION.getErrmsg());
        }

        return result;
    }
}
