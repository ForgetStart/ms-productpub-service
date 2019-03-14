package com.hc360.product.dao;

import com.hc360.product.po.BusinLongInfo;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface BusinLongInfoMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BusinLongInfo record);

    int insertSelective(BusinLongInfo record);

    BusinLongInfo selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BusinLongInfo record);

    int updateByPrimaryKey(BusinLongInfo record);

    /**
     * 获取商机无HTML标签详情
     * @param bcid
     * @return
     */
    BusinLongInfo getBusinLongInfoByBcid(@Param("bcid")Long bcid);
}