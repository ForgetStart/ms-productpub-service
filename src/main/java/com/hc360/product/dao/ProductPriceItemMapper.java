package com.hc360.product.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hc360.product.po.ProductPriceItem;

public interface ProductPriceItemMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(ProductPriceItem record);

    int insertSelective(ProductPriceItem record);

    ProductPriceItem selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(ProductPriceItem record);

    int updateByPrimaryKey(ProductPriceItem record);
    
    List<ProductPriceItem> selectByBcid(@Param("bcid") long bcid);

    /**
     * 根据商机ID删除价格列表
     * @param bcid
     */
    void deleteByBcid(@Param("bcid")Long bcid);

    /**
     * 根据商机ID获取SKU价格
     * @param bcid
     * @return
     */
    List<ProductPriceItem> selectSkuPriceByBcid(Long bcid);
}