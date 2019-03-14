package com.hc360.product.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *持久类BusinTempParam
 *@author Created By b2btool 
 */

public class BusinTempParam implements Serializable {

	/**主键自增长*/
	    private long id;
    	/**商机ID*/
	    private long bcid;
    	/**品类名称*/
	    private long categoryname;
    	/**参数项名称 */
	    private String tmpname;
    	/**参数值名称*/
	    private String tmpvalname;
    	/**是否临时参数项 “0”是 “1”否*/
	    private String istempitem;
    	/**录入时间*/
	    private Timestamp publishtime;
    
   /**
    * 取得id
    * @return id
    */
   public long getId () {
       return id;
   }
   /**
    * 设置id
    * @param id 待设置id
    */
   public void setId(long id) {
       this.id = id;
   }
   
   /**
    * 取得bcid
    * @return bcid
    */
   public long getBcid () {
       return bcid;
   }
   /**
    * 设置bcid
    * @param bcid 待设置bcid
    */
   public void setBcid(long bcid) {
       this.bcid = bcid;
   }
   
   /**
    * 取得categoryname
    * @return categoryname
    */
   public long getCategoryname () {
       return categoryname;
   }
   /**
    * 设置categoryname
    * @param categoryname 待设置categoryname
    */
   public void setCategoryname(long categoryname) {
       this.categoryname = categoryname;
   }
   
   /**
    * 取得tmpname
    * @return tmpname
    */
   public String getTmpname () {
       return tmpname;
   }
   /**
    * 设置tmpname
    * @param tmpname 待设置tmpname
    */
   public void setTmpname(String tmpname) {
       this.tmpname = tmpname;
   }
   
   /**
    * 取得tmpvalname
    * @return tmpvalname
    */
   public String getTmpvalname () {
       return tmpvalname;
   }
   /**
    * 设置tmpvalname
    * @param tmpvalname 待设置tmpvalname
    */
   public void setTmpvalname(String tmpvalname) {
       this.tmpvalname = tmpvalname;
   }
   
   /**
    * 取得istempitem
    * @return istempitem
    */
   public String getIstempitem () {
       return istempitem;
   }
   /**
    * 设置istempitem
    * @param istempitem 待设置istempitem
    */
   public void setIstempitem(String istempitem) {
       this.istempitem = istempitem;
   }
   
   /**
    * 取得publishtime
    * @return publishtime
    */
   public Timestamp getPublishtime () {
       return publishtime;
   }
   /**
    * 设置publishtime
    * @param publishtime 待设置publishtime
    */
   public void setPublishtime(Timestamp publishtime) {
       this.publishtime = publishtime;
   }
   

}