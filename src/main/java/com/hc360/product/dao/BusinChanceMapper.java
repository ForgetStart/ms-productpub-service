package com.hc360.product.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hc360.product.po.BusinChance;

public interface BusinChanceMapper {
    int deleteByPrimaryKey(BigDecimal bcId);

    int insert(BusinChance record);

    int insertSelective(BusinChance record);

    BusinChance selectByPrimaryKey(BigDecimal bcId);

    int updateByPrimaryKeySelective(BusinChance record);

    int updateByPrimaryKey(BusinChance record);
    
    BusinChance selectByProviderIdAndBcid(@Param("providerid") long providerid, @Param("bcid") long bcid);

    /**
     * 查询审核中的供应商机数
     * @param param
     * @return
     * @throws Exception
     */
    List<BusinChance> findAuditBusinCount(Map<String,Object> param) throws Exception;
}