package com.hc360.product.service;

import com.hc360.product.po.ProductPriceItem;
import com.hc360.product.po.ProductSku;
import com.hc360.product.vo.BusinPriceVO;

import java.math.BigDecimal;
import java.util.List;

public interface ProductPriceService{
	
   BusinPriceVO getEditPrice(long providerid, long bcid);

   /**
    * 保存更新商机价格
    * @param bcid
    * @param priceType
    * @param pricerange
    * @param productPriceItemList
    * @param productSkuList
    */
   void saveOrUpdateProductPrice(Long bcid, String priceType, BigDecimal pricerange, List<ProductPriceItem> productPriceItemList, List<ProductSku> productSkuList);
}
