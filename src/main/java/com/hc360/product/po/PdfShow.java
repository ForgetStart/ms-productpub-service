package com.hc360.product.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *持久类PdfShow
 *@author Created By b2btool 
 */

public class PdfShow implements Serializable {

	/**主键id*/
	    private long id;
    	/**pdf名称*/
	    private String pdfname;
    	/**用户id*/
	    private long providerid;
    	/**添加时间*/
	    private Timestamp adddate;
    	/**添加人*/
	    private String adduser;
    	/**删除时间*/
	    private Timestamp deletedate;
    	/**删除人*/
	    private String deleteuser;
    	/**状态0使用1删除*/
	    private String states;
    	/**pdf路径*/
	    private String pdfurl;
    
	    public String getPdfurl() {
			return pdfurl;
		}
		public void setPdfurl(String pdfurl) {
			this.pdfurl = pdfurl;
		}
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
    * 取得pdfname
    * @return pdfname
    */
   public String getPdfname () {
       return pdfname;
   }
   /**
    * 设置pdfname
    * @param pdfname 待设置pdfname
    */
   public void setPdfname(String pdfname) {
       this.pdfname = pdfname;
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
    * 取得adddate
    * @return adddate
    */
   public Timestamp getAdddate () {
       return adddate;
   }
   /**
    * 设置adddate
    * @param adddate 待设置adddate
    */
   public void setAdddate(Timestamp adddate) {
       this.adddate = adddate;
   }
   
   /**
    * 取得adduser
    * @return adduser
    */
   public String getAdduser () {
       return adduser;
   }
   /**
    * 设置adduser
    * @param adduser 待设置adduser
    */
   public void setAdduser(String adduser) {
       this.adduser = adduser;
   }
   
   /**
    * 取得deletedate
    * @return deletedate
    */
   public Timestamp getDeletedate () {
       return deletedate;
   }
   /**
    * 设置deletedate
    * @param deletedate 待设置deletedate
    */
   public void setDeletedate(Timestamp deletedate) {
       this.deletedate = deletedate;
   }
   
   /**
    * 取得deleteuser
    * @return deleteuser
    */
   public String getDeleteuser () {
       return deleteuser;
   }
   /**
    * 设置deleteuser
    * @param deleteuser 待设置deleteuser
    */
   public void setDeleteuser(String deleteuser) {
       this.deleteuser = deleteuser;
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