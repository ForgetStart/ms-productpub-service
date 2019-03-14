package com.hc360.product.bo.busin;

import com.hc360.b2b.util.annotation.charfilter.charfiltertype;

public class BusinAttItem {

	private String id;

	private String attId;

	private String attName;

	private String ydirect;

	private String[] attValue;

	private String isNormsParam;

	private String unitId;

	private String attrImg;

	private String isTempAtt;

	private String isTempValue;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttId() {
		return attId;
	}

	public void setAttId(String attId) {
		this.attId = attId;
	}

	public String getYdirect() {
		return ydirect;
	}

	public void setYdirect(String ydirect) {
		this.ydirect = ydirect;
	}

	public String getAttName() {
		return attName;
	}

	public void setAttName(String attName) {
		this.attName = attName;
	}

	public String[] getAttValue() {
		return attValue;
	}

	public void setAttValue(String[] attValue) {
		this.attValue = attValue;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getIsNormsParam() {
		return isNormsParam;
	}

	public void setIsNormsParam(String isNormsParam) {
		this.isNormsParam = isNormsParam;
	}

	public String getAttrImg() {
		return attrImg;
	}

	public void setAttrImg(String attrImg) {
		this.attrImg = attrImg;
	}

	public String getIsTempAtt() {
		return isTempAtt;
	}

	public void setIsTempAtt(String isTempAtt) {
		this.isTempAtt = isTempAtt;
	}

	public String getIsTempValue() {
		return isTempValue;
	}

	public void setIsTempValue(String isTempValue) {
		this.isTempValue = isTempValue;
	}

}
