package com.hc360.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hc360.product.bo.busin.BusinInfoParamsObject;
import com.hc360.product.service.BusinMultimediaService;
import com.hc360.product.service.OnBusinChanceService;
import com.hc360.product.service.ProductPriceService;
import com.hc360.product.vo.BusinBaseInfoVO;
import com.hc360.product.vo.BusinMultimediaVO;
import com.hc360.product.vo.BusinPriceVO;
import com.hc360.product.vo.OnBusinChancePageListVO;

@RequestMapping("/productpub/v1")
@RestController
public class MSProductv1Controller {

    private static Logger log = LoggerFactory.getLogger("productpubv1");

    @Autowired
    private OnBusinChanceService onBusinChanceService;

    @Autowired
    private BusinMultimediaService businMultimediaService;

    @Autowired
    private ProductPriceService productPriceService;

    /**
     * 获取用户在售商机列表
     * @param providerid
     * @param titleKeyword
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/onlinebusins", method = RequestMethod.GET)
    public OnBusinChancePageListVO getOnlineBusins(@RequestParam("providerid") long providerid, @RequestParam(value = "titleKeyword", required = false) String titleKeyword,
                                                   @RequestParam("page") int page, @RequestParam("pageSize") int pageSize) {
        OnBusinChancePageListVO onBusinChancePageList = null;
        try {
             onBusinChancePageList = onBusinChanceService.getOnBusinChancePageList(providerid, titleKeyword, page, pageSize);
        } catch(Exception e){
            log.error("=====获取用户在售商机列表异常=====providerid:" + providerid + ", titleKeyword:" + titleKeyword, e);
        }
        return onBusinChancePageList;
    }

    /**
     * 获取商机图片列表
     * @param providerid
     * @param bcid
     * @return
     */
    @RequestMapping(value = "/images", method = RequestMethod.GET)
    public List<BusinMultimediaVO> getImages(@RequestParam("providerid") long providerid, @RequestParam("bcid") long bcid) {
        List<BusinMultimediaVO> images = null;
        try {
            images = businMultimediaService.getImages(providerid, bcid);
        } catch (Exception e) {
            log.error("=====获取商机图片列表=====providerid:" + providerid + ",bcid:" + bcid, e);
        }
        return images;
    }

    /**
     * 修改商机时获取商机价格
     *
     * @param bcid
     * @return
     * @author xiangp
     * @date 2019年2月23日 下午6:51:22
     */
    @RequestMapping(value = "/editprice", method = RequestMethod.GET)
    public BusinPriceVO getEditPrice(@RequestParam("providerid") Long providerid, @RequestParam("bcid") Long bcid) {
        BusinPriceVO editPrice = null;
        try {
            editPrice = productPriceService.getEditPrice(providerid, bcid);
        } catch (Exception e) {
            log.error("=====修改商机时获取商机价格=====providerid:" + providerid + ",bcid:" + bcid, e);
        }
        return editPrice;
    }

    /**
     * 修改商机时获取商机基本信息
     *
     * @param providerid
     * @param bcid
     * @return
     * @author xiangp
     * @date 2019年2月24日 下午9:37:07
     */
    @RequestMapping(value = "/editbusin", method = RequestMethod.GET)
    public BusinBaseInfoVO getEditBusin(@RequestParam("providerid") long providerid, @RequestParam("bcid") long bcid) {
        BusinBaseInfoVO editBusin = null;
        try {
            editBusin = onBusinChanceService.getEditBusin(providerid, bcid);
        } catch (Exception e) {
            log.error("=====修改商机时获取商机基本信息=====providerid:" + providerid + ",bcid:" + bcid, e);
        }
        return editBusin;
    }


    /**
     * 保存或更新商机
     *
     * @param businInfoParamsObject
     * @return
     * @author xiangp
     * @date 2019年3月2日 下午6:38:07
     */
    @RequestMapping(value = "/savebusin", method = RequestMethod.POST)
    public Long saveOrUpdateBusin(@RequestBody BusinInfoParamsObject businInfoParamsObject) {
        try {
            return onBusinChanceService.saveOrUpdateBusinChance(businInfoParamsObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0l;
    }
}
