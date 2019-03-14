package com.hc360.product.service;

import com.hc360.product.po.BusinTempParamNew;

public interface BusinTempParamService {

   /**
    * 删除临时参数
    * @author hk
    * @date 2019-02-27
    * @param bcid 商机id
    * @throws Exception
    * @return
    */
   public void delTempParamNew(Long bcid) throws Exception;


   /**
    * 批量删除临时参数
    * @author hk
    * @date 2019-02-27
    * @param bcid 商机id
    * @throws Exception
    * @return
    */
   public void delBatchTempParamNew(Long bcid,String tmpname) throws Exception ;

   /**
    * 保存临时参数
    * @author hk
    * @date 2019-02-27
    * @param businTempParam
    * @throws Exception
    * @return
    */
   public void saveTempParamNew(BusinTempParamNew businTempParam)throws Exception;
}
