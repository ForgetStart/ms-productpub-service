package com.hc360.product.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *持久类BusinTempParamNew
 *@author Created By b2btool 
 */

public class BusinTempParamNew implements Serializable {

	/**主键ID 序列*/
	    private long id;
    	/**商机ID*/
	    private long bcid;
    	/**品类名称*/
	    private long categoryid;
    	/**参数项名称 */
	    private String tmpname;
    	/**参数值名称*/
	    private String tmpvalname;
    	/**是否临时参数项 “0”是 “1”否*/
	    private String istempitem;
    	/**录入时间*/
	    private Timestamp publishtime;
    	/**录入人*/
	    private long providerid;
    	/**统计状态 0未统计 1已统计*/
	    private String states;
    
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
    * 取得categoryid
    * @return categoryid
    */
   public long getCategoryid () {
       return categoryid;
   }
   /**
    * 设置categoryid
    * @param categoryid 待设置categoryid
    */
   public void setCategoryid(long categoryid) {
       this.categoryid = categoryid;
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
   
   /**
    * 取得providerid
    * @return providerid
    */
   public long getProviderid () {
       return providerid;
   }
   /**
    * 设置providerid
    * @param providerid 待设置providerid
    */
   public void setProviderid(long providerid) {
       this.providerid = providerid;
   }
   
   /**
    * 取得states
    * @return states
    */
   public String getStates () {
       return states;
   }
   /**
    * 设置states
    * @param states 待设置states
    */
   public void setStates(String states) {
       this.states = states;
   }
   

}