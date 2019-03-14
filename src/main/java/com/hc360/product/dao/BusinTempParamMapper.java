package com.hc360.product.dao;

import com.hc360.product.po.BusinTempParamNew;
import org.apache.ibatis.annotations.Param;

public interface BusinTempParamMapper
{


   /**
    * 删除临时参数
    * @author hk
    * @date 2019-02-27
    * @param bcid 商机id
    * @throws Exception
    * @return
    */
   public void delTempParamNew(@Param("bcid")Long bcid) throws Exception;


   /**
    * 批量删除临时参数
    * @author hk
    * @date 2019-02-27
    * @param bcid 商机id
    * @throws Exception
    * @return
    */
   public void delBatchTempParamNew(@Param("bcid")Long bcid,@Param("tmpname")String tmpname) throws Exception ;


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
