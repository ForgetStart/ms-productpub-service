package com.hc360.product.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.hc360.product.vo.BusinLimitParam;
import org.apache.ibatis.annotations.Param;

import com.hc360.product.po.OnBusinChance;
import com.hc360.product.vo.BusinLimitParam;

public interface OnBusinChanceMapper {
    int deleteByPrimaryKey(BigDecimal bcId);

    int insert(OnBusinChance record);

    int insertSelective(OnBusinChance record);

    OnBusinChance selectByPrimaryKey(BigDecimal bcId);

    int updateByPrimaryKeySelective(OnBusinChance record);

    int updateByPrimaryKey(OnBusinChance record);
    
    List<OnBusinChance> getOnBusinChancePageList(@Param("providerid") Long providerid, @Param("titleKeyword") String titleKeyword);
    
    OnBusinChance selectByProviderIdAndBcid(@Param("providerid") long providerid, @Param("bcid") long bcid);

    int corPubInfoNum(Map<String,Object> param) throws Exception;

    /**
     * 查询在售供应商机总数
     * @param param
     * @return
     * @throws Exception
     */
    List<OnBusinChance> findOnLineBusinCount(Map<String,Object> param) throws Exception;


    /**
     * 查询已过期的供应商机总数
     * @param param
     * @return
     * @throws Exception
     */
    List<OnBusinChance> findPastBusinCount(Map<String,Object> param) throws Exception;

    /**
     * 获取用户可发送的商机上限
     * @param businLimitParam
     * @return
     * @throws Exception
     */
    int findBusinLimit(BusinLimitParam businLimitParam) throws Exception;


    /**
     * 根据行业id，判断是否该行业被限制发布商机的数目 返回值大于0 存在行业限制
     * @param areaId
     * @return
     */
    int isExistAreaLimit(@Param("areaId") String areaId);

    /**
     * 查询炫铺分类下的商机数
     * @param 需要的参数providerid
     * @param 需要的参数seriesid
     * @return
     * @throws Exception
     */
    int findBcNumBySeriesId(Map<String, Object> param) throws Exception;
}