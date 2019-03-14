/**
 * @file_name ProductPriceServiceImpl.java
 * @project_name MS-ProductPub-Service
 * @user hc360
 * @date 2019年2月25日
 */
package com.hc360.product.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hc360.product.dao.ProductPriceItemMapper;
import com.hc360.product.dao.ProductSkuMapper;
import com.hc360.product.po.OnBusinChance;
import com.hc360.product.po.ProductPriceItem;
import com.hc360.product.po.ProductSku;
import com.hc360.product.service.OnBusinChanceService;
import com.hc360.product.service.ProductPriceService;
import com.hc360.product.util.PriceType;
import com.hc360.product.vo.BusinPriceVO;
import com.hc360.product.vo.IntervalPriceVO;
import com.hc360.product.vo.SpecPriceVO;

/**
 * @author hc360
 * @version 1.0
 * @date 2019年2月25日 下午4:25:55
 */
@Service
public class ProductPriceServiceImpl implements ProductPriceService {

    @Autowired
    private OnBusinChanceService onBusinChanceService;

    @Autowired
    private ProductPriceItemMapper productPriceItemMapper;

    @Autowired
    private ProductSkuMapper productSkuMapper;

    /* (non-Javadoc)
     * @see com.hc360.product.service.ProductPriceService#getEditPrice(long, long)
     */
    @Override
    public BusinPriceVO getEditPrice(long providerid, long bcid) {
        BusinPriceVO businPriceVO = null;
        OnBusinChance onBusinChance = onBusinChanceService.getOnBusinChanceFromBakOrOn(providerid, bcid);
        if (null == onBusinChance) {
            return businPriceVO;
        }
        businPriceVO = new BusinPriceVO();
        /*
		 * 报价类型:
		 *  数据库存储： 0-电话议价/区间报价，1-规格报价，2-混批报价 
		 *  页面展示: 0-区间报价，1-规格报价，2-混批报价 ，4-电话议价（根据pricetype和pricerange得出）
		 *  
		 * 规格报价：产品SKU价格
		 * 混批报价：区间报价 + 产品SKU
		 */
        String priceType = onBusinChance.getPricetype();
        if (PriceType.INTERVAL_QUOTE.type.equals(priceType)
                && (null != onBusinChance.getPricerange() && onBusinChance.getPricerange().doubleValue() <= 0)) {
            priceType = PriceType.CALL_QUOTE.type;
        } else {

            // 获取价格列表
            List<ProductPriceItem> productPriceItemList = productPriceItemMapper.selectByBcid(bcid);
            List<IntervalPriceVO> intervalPriceVOList = null;
            if (null != productPriceItemList && !productPriceItemList.isEmpty()) {
                if (StringUtils.isBlank(priceType)) {
                    priceType = productPriceItemList.get(0).getType();
                }
                intervalPriceVOList = new ArrayList<IntervalPriceVO>();
                IntervalPriceVO intervalPriceVO = null;
                for (ProductPriceItem productPriceItem : productPriceItemList) {
                    intervalPriceVO = new IntervalPriceVO();
                    intervalPriceVO.setId(null != productPriceItem.getId() ? productPriceItem.getId().longValue() : 0);
                    intervalPriceVO.setPriceType(productPriceItem.getType());
                    intervalPriceVO.setBuyNum(null != productPriceItem.getImoq() ? productPriceItem.getImoq().intValue() : 0);
                    intervalPriceVO.setBuyPrice(null != productPriceItem.getUnitPrice() ? productPriceItem.getUnitPrice().toString() : "");
                    intervalPriceVOList.add(intervalPriceVO);
                }
                businPriceVO.setIntervalPrice(intervalPriceVOList);
            }

            // 规格报价 或  混批报价时获取产品SKU
            if (PriceType.SPEC_QUOTE.type.equals(priceType)
                    || PriceType.BLEND_QUOTE.type.equals(priceType)) {

                // 获取产品SKU
                List<ProductSku> productSkuList = productSkuMapper.selectByBcid(bcid);
                List<SpecPriceVO> specPriceVOList = null;
                if (null != productSkuList && !productSkuList.isEmpty()) {
                    specPriceVOList = new ArrayList<SpecPriceVO>();
                    SpecPriceVO specPriceVO = null;
                    for (ProductSku productSku : productSkuList) {
                        specPriceVO = new SpecPriceVO();
                        specPriceVO.setId(null != productSku.getId() ? productSku.getId().longValue() : 0);
                        specPriceVO.setCoding(productSku.getCoding());
                        specPriceVO.setKeyindex(productSku.getKeyIndex());
                        specPriceVO.setSkuValue(productSku.getSkuValue());
                        specPriceVO.setNum(null != productSku.getNum() ? productSku.getNum().intValue() : 0);
                        specPriceVOList.add(specPriceVO);
                    }

                    // 规格报价时将SKU关联价格
                    if (PriceType.SPEC_QUOTE.type.equals(priceType)
                            && (null != productPriceItemList && !productPriceItemList.isEmpty())) {
                        for (SpecPriceVO spriceVO : specPriceVOList) {
                            for (ProductPriceItem productPriceItem : productPriceItemList) {
                                if (null != productPriceItem.getSkuId()
                                        && productPriceItem.getSkuId().equals(spriceVO.getId())) {
                                    spriceVO.setUnitPrice(null != productPriceItem.getUnitPrice() ? productPriceItem.getUnitPrice().toString() : "");
                                }
                            }
                        }
                    }
                    businPriceVO.setSpecPrice(specPriceVOList);
                }
            }
        }
        businPriceVO.setIsSupportTrade(onBusinChance.getIsSupportTrade());
        businPriceVO.setPriceType(priceType);
        businPriceVO.setTotalNum(onBusinChance.getNum());
        businPriceVO.setUnit(onBusinChance.getUnit());
        return businPriceVO;
    }

    @Override
    public void saveOrUpdateProductPrice(Long bcid, String priceType,BigDecimal pricerange,
                                         List<ProductPriceItem> productPriceItemList, List<ProductSku> productSkuList) {

        if (null == bcid || StringUtils.isBlank(priceType)
                || (null == productPriceItemList && null == productSkuList)) {
            return;
        }
        Date curDate = new Date();
        if (PriceType.INTERVAL_QUOTE.type.equals(priceType) && (null != pricerange && pricerange.doubleValue() == 0)) { // 电话议价
            // 删除价格列表与产品SKU
            productPriceItemMapper.deleteByBcid(bcid);
            productSkuMapper.deleteByBcid(bcid);
        } else if(PriceType.INTERVAL_QUOTE.type.equals(priceType)) { // 区间报价

            /**
             * 区间报价处理：
             *  1、如果之前是规格报价，则删除产品SKU及价格
             *  2、如果之前存在产品SKU，则删除产品SKU
             *  3、如果之前有区间报价，把之前的数据在本次提交的数据中没有的删除，再保存本次提交的数据
             */
            List<ProductPriceItem> oldSkuPriceList =  productPriceItemMapper.selectSkuPriceByBcid(bcid);
            if (null != oldSkuPriceList && !oldSkuPriceList.isEmpty()) {
                productSkuMapper.deleteByBcid(bcid);
                productPriceItemMapper.deleteByBcid(bcid);
            }
            List<ProductSku> oldProductSkuList = productSkuMapper.selectByBcid(bcid);
            if (null != oldProductSkuList && !oldProductSkuList.isEmpty()) {
                productSkuMapper.deleteByBcid(bcid);
            }

            if (null != productPriceItemList && !productPriceItemList.isEmpty()) {

                List<ProductPriceItem> oldProductPriceItemList = productPriceItemMapper.selectByBcid(bcid);
                if (null != oldProductPriceItemList && !oldProductPriceItemList.isEmpty()) {
                    boolean isNotExist = true;
                    for (ProductPriceItem oldProductPriceItem : oldProductPriceItemList) {
                        for (ProductPriceItem productPriceItem : productPriceItemList) {
                            if (oldProductPriceItem.getId().equals(productPriceItem.getId())) {
                                isNotExist = false;
                                break;
                            }
                        }
                        if (isNotExist) {
                            productPriceItemMapper.deleteByPrimaryKey(oldProductPriceItem.getId());
                        }
                    }
                }
                for (ProductPriceItem productPriceItem : productPriceItemList) {
                    if (null != productPriceItem.getId()) {
                        productPriceItem.setModifyTime(new Date());
                        productPriceItemMapper.updateByPrimaryKeySelective(productPriceItem);
                    } else {
                        productPriceItem.setPublishTime(new Date());
                        productPriceItemMapper.insert(productPriceItem);
                    }
                }
            }
        } else if(PriceType.SPEC_QUOTE.type.equals(priceType)) { // 规格报价

            /**
             * 规格报价处理：
             *  1、如果之前不是规格报价，则删除价格列表
             *  2、如果之前是规格报价，有新增规格时，则删除价格列表
             *  3、规格报价存的是产品SKU与SKU价格，必须一一对应，用SKU_ID关联
             */
            List<ProductPriceItem> oldSkuPriceList =  productPriceItemMapper.selectSkuPriceByBcid(bcid);
            if (null == oldSkuPriceList || oldSkuPriceList.isEmpty()) {
                productPriceItemMapper.deleteByBcid(bcid);
            } else {
                // 有新增的SKU时，删除价格列表
                boolean isAdd = false;
                for (ProductSku productSku : productSkuList) {
                    if (null == productSku.getId()) {
                        isAdd = true;
                    }
                }
                if (isAdd) {
                    productPriceItemMapper.deleteByBcid(bcid);
                }
            }

            if ((null != productSkuList && null != productPriceItemList)
                    && (productSkuList.size() == productPriceItemList.size())) {

                // 保存产品SKU及价格
                ProductSku newProductSku = null;
                ProductPriceItem productPriceItem = null;
                for (int i = 0; null != productSkuList && i < productSkuList.size(); i++) {
                    newProductSku = productSkuList.get(i);
                    if (null != newProductSku.getId()) {
                        newProductSku.setModifyTime(curDate);
                        productSkuMapper.updateByPrimaryKeySelective(newProductSku);
                    } else {
                        newProductSku.setPublishTime(curDate);
                        productSkuMapper.insert(newProductSku);
                    }
                    productPriceItem = productPriceItemList.get(i);
                    productPriceItem.setSkuId(newProductSku.getId());
                    productPriceItem.setPublishTime(curDate);
                    productPriceItemMapper.insert(productPriceItem);
                }

            }

        } else if(PriceType.BLEND_QUOTE.type.equals(priceType)) { // 混批报价
            /**
             * 混批报价（区间报价格+产品SKU）：
             *  1、如果之前是规格报价，则删除产品SKU及价格列表
             *  2、获取区间报价列表，把之前的数据在本次提交的数据中没有的删除，再保存本次提交的数据
             *  3、获取产品SKU列表，把之前的数据在本次提交的数据中没有的删除，再保存本次提交的数据
             */
            // 如果之前是规格报价（存在产品SKU价格），先删除产品SKU及价格
            List<ProductPriceItem> oldSkuPriceList =  productPriceItemMapper.selectSkuPriceByBcid(bcid);
            if (null != oldSkuPriceList && !oldSkuPriceList.isEmpty()) {
                productSkuMapper.deleteByBcid(bcid);
                productPriceItemMapper.deleteByBcid(bcid);
            }

            if (null != productPriceItemList && !productPriceItemList.isEmpty()) {
                List<ProductPriceItem> oldProductPriceItemList = productPriceItemMapper.selectByBcid(bcid);
                if (null != oldProductPriceItemList && !oldProductPriceItemList.isEmpty()) {
                    boolean isNotExist = true;
                    for (ProductPriceItem oldPriceItem : oldProductPriceItemList) {
                        for (ProductPriceItem productPriceItem : productPriceItemList) {
                            if (oldPriceItem.getId().equals(productPriceItem.getId())) {
                                isNotExist = false;
                                break;
                            }
                        }
                        if (isNotExist) {
                            productPriceItemMapper.deleteByPrimaryKey(oldPriceItem.getId());
                        }
                    }
                }

                for (ProductPriceItem productPriceItem : productPriceItemList) {
                    if (null != productPriceItem.getId()) {
                        productPriceItem.setModifyTime(curDate);
                        productPriceItemMapper.updateByPrimaryKeySelective(productPriceItem);
                    } else {
                        productPriceItem.setPublishTime(curDate);
                        productPriceItemMapper.insert(productPriceItem);
                    }
                }
            }

            if (null != productSkuList && !productSkuList.isEmpty()) {
                List<ProductSku> oldProductSkuList = productSkuMapper.selectByBcid(bcid);
                if (null != oldProductSkuList && !oldProductSkuList.isEmpty()) {
                    boolean isNotExist = true;
                    for (ProductSku oldProductSku : oldProductSkuList) {
                        for (ProductSku productSku : productSkuList) {
                            if (oldProductSku.getId().equals(productSku.getId())) {
                                isNotExist = false;
                                break;
                            }
                            if (isNotExist) {
                                productSkuMapper.deleteByPrimaryKey(oldProductSku.getId());
                            }
                        }
                    }
                }

                for (ProductSku productSku : productSkuList) {
                    if (null != productSku.getId()) {
                        productSku.setModifyTime(curDate);
                        productSkuMapper.updateByPrimaryKeySelective(productSku);
                    } else {
                        productSku.setPublishTime(curDate);
                        productSkuMapper.insert(productSku);
                    }
                }
            }
        }
    }

}
