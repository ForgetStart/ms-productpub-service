package com.hc360.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hc360.product.po.BusinFareConfig;

public interface BusinFareConfigMapper {
    int deleteByPrimaryKey(Long businFareConfigId);

    int insert(BusinFareConfig record);

    int insertSelective(BusinFareConfig record);

    BusinFareConfig selectByPrimaryKey(Long businFareConfigId);

    int updateByPrimaryKeySelective(BusinFareConfig record);

    int updateByPrimaryKey(BusinFareConfig record);
    
    List<BusinFareConfig> selectByBcid(@Param("bcid") long bcid);
}