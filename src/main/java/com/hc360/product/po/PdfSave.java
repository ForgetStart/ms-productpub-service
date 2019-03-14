package com.hc360.product.po;

import java.io.Serializable;

/**
 *持久类PdfSave
 *@author Created By b2btool 
 */

public class PdfSave implements Serializable {

	/**主键id*/
	    private long id;
    	/**商机id(索引)*/
	    private long bcid;
    	/**pdf_show的主键*/
	    private long pdfshowid;
    
	    public long getPdfshowid() {
			return pdfshowid;
		}
		public void setPdfshowid(long pdfshowid) {
			this.pdfshowid = pdfshowid;
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
   

}