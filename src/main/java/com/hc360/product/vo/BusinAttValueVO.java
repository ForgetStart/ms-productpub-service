/**
 * @file_name BusinAttValueVO.java
 * @project_name MS-Product-Service
 * @user hc360
 * @date 2019年2月24日
 */
package com.hc360.product.vo;

import java.io.Serializable;

/**
 * 商机参数VO
 * @author xiangp
 * @version 1.0
 * @date 2019年2月24日 下午7:01:14
 */
public class BusinAttValueVO implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5320576906696353609L;

	/**
	 * 商机参数ID
	 */
	private Long id;

	/**
	 * 商机ID
	 */
	private Long bcid;
	
	/**
	 * 属性ID
	 */
	private Long attid;
	
	/**
	 * 属性名
	 */
	private String attname;

	/**
	 * 是否是必填项
	 */
	private String ydirect;
	
	/**
	 * 参数值
	 */
	private String[] attvalue;
	
	/**
	 * 是否为规格参数  
	 */
	private String isNormsParam;

	/**
	 * 单位ID
	 */
	private Long unitid;
	
	/**
	 * 属性图片
	 */
	private String attrImg;
	
	/**
	 * 是否是自定义参数项
	 */
	private String isTempAtt;
	
	/**
	 * 是否是自定义参数值
	 */
	private String isTempValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the bcid
	 */
	public Long getBcid() {
		return bcid;
	}

	/**
	 * @param bcid the bcid to set
	 */
	public void setBcid(Long bcid) {
		this.bcid = bcid;
	}

	/**
	 * @return the attid
	 */
	public Long getAttid() {
		return attid;
	}

	/**
	 * @param attid the attid to set
	 */
	public void setAttid(Long attid) {
		this.attid = attid;
	}

	/**
	 * @return the attname
	 */
	public String getAttname() {
		return attname;
	}

	/**
	 * @param attname the attname to set
	 */
	public void setAttname(String attname) {
		this.attname = attname;
	}

	/**
	 * @return the ydirect
	 */
	public String getYdirect() {
		return ydirect;
	}

	/**
	 * @param ydirect the ydirect to set
	 */
	public void setYdirect(String ydirect) {
		this.ydirect = ydirect;
	}

	/**
	 * @return the attvalue
	 */
	public String[] getAttvalue() {
		return attvalue;
	}

	/**
	 * @param attvalue the attvalue to set
	 */
	public void setAttvalue(String[] attvalue) {
		this.attvalue = attvalue;
	}

	/**
	 * @return the isNormsParam
	 */
	public String getIsNormsParam() {
		return isNormsParam;
	}

	/**
	 * @param isNormsParam the isNormsParam to set
	 */
	public void setIsNormsParam(String isNormsParam) {
		this.isNormsParam = isNormsParam;
	}

	/**
	 * @return the unitid
	 */
	public Long getUnitid() {
		return unitid;
	}

	/**
	 * @param unitid the unitid to set
	 */
	public void setUnitid(Long unitid) {
		this.unitid = unitid;
	}

	/**
	 * @return the attrImg
	 */
	public String getAttrImg() {
		return attrImg;
	}

	/**
	 * @param attrImg the attrImg to set
	 */
	public void setAttrImg(String attrImg) {
		this.attrImg = attrImg;
	}

	/**
	 * @return the isTempAtt
	 */
	public String getIsTempAtt() {
		return isTempAtt;
	}

	/**
	 * @param isTempAtt the isTempAtt to set
	 */
	public void setIsTempAtt(String isTempAtt) {
		this.isTempAtt = isTempAtt;
	}

	/**
	 * @return the isTempValue
	 */
	public String getIsTempValue() {
		return isTempValue;
	}

	/**
	 * @param isTempValue the isTempValue to set
	 */
	public void setIsTempValue(String isTempValue) {
		this.isTempValue = isTempValue;
	}
}
