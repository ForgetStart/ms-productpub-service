package com.hc360.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hc360.product.po.BusinAddrConfig;

public interface BusinAddrConfigMapper {
    int deleteByPrimaryKey(Long businAddrConfigId);

    int insert(BusinAddrConfig record);

    int insertSelective(BusinAddrConfig record);

    BusinAddrConfig selectByPrimaryKey(Long businAddrConfigId);

    int updateByPrimaryKeySelective(BusinAddrConfig record);

    int updateByPrimaryKey(BusinAddrConfig record);
    
    List<BusinAddrConfig> selectByBcid(@Param("bcid") long bcid);
}