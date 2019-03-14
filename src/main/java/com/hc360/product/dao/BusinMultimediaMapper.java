package com.hc360.product.dao;

import com.hc360.product.po.BusinMultimedia;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface BusinMultimediaMapper {
    int deleteByPrimaryKey(BigDecimal bimId);

    int insert(BusinMultimedia record);

    int insertSelective(BusinMultimedia record);

    BusinMultimedia selectByPrimaryKey(BigDecimal bimId);

    int updateByPrimaryKeySelective(BusinMultimedia record);

    int updateByPrimaryKey(BusinMultimedia record);

	/**
	 * @author xiangp
	 * @date 2019年2月25日 下午3:58:16
	 * @param bcid
	 * @return
	 */
	List<BusinMultimedia> getImagesByBcid(@Param("bcid")long bcid);

    /**
     * 免审商机图片
     * @param bcid
     */
    void uncheckPic(@Param("bcid")BigDecimal bcid);
}