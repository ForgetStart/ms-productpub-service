package com.hc360.product.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hc360.product.po.BusinAttValue;

public interface BusinAttValueMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BusinAttValue record);

    int insertSelective(BusinAttValue record);

    BusinAttValue selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BusinAttValue record);

    int updateByPrimaryKey(BusinAttValue record);
    
    List<BusinAttValue> selectByBcid(@Param("bcid") long bcid);
}