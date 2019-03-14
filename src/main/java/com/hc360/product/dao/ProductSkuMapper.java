package com.hc360.product.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hc360.product.po.ProductSku;

public interface ProductSkuMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(ProductSku record);

    int insertSelective(ProductSku record);

    ProductSku selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(ProductSku record);

    int updateByPrimaryKey(ProductSku record);
    
    List<ProductSku> selectByBcid(@Param("bcid") long bcid);

    /**
     * 根据商机ID删除产品SKU
     * @param bcid
     */
    void deleteByBcid(Long bcid);
}