 package com.hc360.product.service.impl;
 
 import java.math.BigDecimal;
 import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hc360.b2b.netWorker.GetUrl;
import com.hc360.product.dao.BusinMultimediaMapper;
import com.hc360.product.po.BusinMultimedia;
import com.hc360.product.po.OnBusinChance;
import com.hc360.product.service.BusinMultimediaService;
import com.hc360.product.service.OnBusinChanceService;
import com.hc360.product.vo.BusinMultimediaVO;
 
 @Service
 public class BusinMultimediaServiceImpl implements BusinMultimediaService {
	 
   @Autowired
   private OnBusinChanceService onBusinChanceService;
   
   @Autowired
   private BusinMultimediaMapper businMultimediaMapper;
   
   public List<BusinMultimediaVO> getImages(long providerid, long bcid) {
	   
     List<BusinMultimediaVO> imageVOList = null;
     OnBusinChance onBusinChance = this.onBusinChanceService.getOnBusinChanceFromBakOrOn(providerid, bcid);
     if (null == onBusinChance) {
       return imageVOList;
     }
     List<BusinMultimedia> imgeList = this.businMultimediaMapper.getImagesByBcid(bcid);
     BusinMultimediaVO businMultimediaVO;
     if (null != imgeList && !imgeList.isEmpty()){
       imageVOList = new ArrayList<BusinMultimediaVO> ();
       businMultimediaVO = null;
       for (BusinMultimedia businMultimedia : imgeList){
         businMultimediaVO = businMultimediaPoToVo(businMultimedia);
         imageVOList.add(businMultimediaVO);
       }
     }
     return imageVOList;
   }

   @Override
   public void uncheckPic(BigDecimal bcid) {
     businMultimediaMapper.uncheckPic(bcid);
   }

   private BusinMultimediaVO businMultimediaPoToVo(BusinMultimedia businMultimedia) {
     BusinMultimediaVO businMultimediaVO = null;
     if (null != businMultimedia) {
       businMultimediaVO = new BusinMultimediaVO();
       if (null != businMultimedia.getBimId()) {
         businMultimediaVO.setBimId(businMultimedia.getBimId().longValue());
       }
       businMultimediaVO.setDefaultflag(businMultimedia.getDefaultflag());
       businMultimediaVO.setWidth(null != businMultimedia.getImageWidth() ? businMultimedia.getImageWidth().intValue() : 0);
       businMultimediaVO.setHeight(null != businMultimedia.getImageHeight() ? businMultimedia.getImageWidth().intValue() : 0);
       businMultimediaVO.setChecked(businMultimedia.getChecked());
       String filename = businMultimedia.getFilename();
       if (StringUtils.isNotBlank(filename)){
         businMultimediaVO.setFilename(filename);
         businMultimediaVO.setUrl(GetUrl.getPicUrl("0", filename));
       }
     }
     return businMultimediaVO;
   }
 }
