package com.hc360.product.service;

import com.hc360.product.vo.BusinMultimediaVO;

import java.math.BigDecimal;
import java.util.List;

public  interface BusinMultimediaService{
	
  /**
   * 获取商机图片列表
   * @author xiangp
   * @date 2019年2月25日 下午4:24:28
   * @param providerid
   * @param bcid
   * @return
   */
  List<BusinMultimediaVO> getImages(long providerid, long bcid);

  /**
   * 免审商机图片
   * @param bcid
   */
  void uncheckPic(BigDecimal bcid);
}
