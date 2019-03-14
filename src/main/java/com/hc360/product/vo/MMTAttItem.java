
package com.hc360.product.vo;

import com.hc360.b2b.util.annotation.charfilter.charfiltertype;


/**
 *
 * @author zhangpeng
 * @date 2014-4-10 下午02:36:43
 */
public class MMTAttItem {

	/**
	 * 属性ID
	 */
	private String attid;

	/**
	 * 属性名
	 */
//	@charfiltertype(type="3")
	private String attname;

	/**
	 * 是否是必填项
	 */
	private String ydirect;

	/**
	 * 参数值LIST
	 */

//	@charfiltertype(type="3")
	private String attvalue;

	/**
	 * 是否为规格参数
	 */
	private String isNormsParam;

	/**
	 * 单位ID
	 */
	private String unitid;

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


	private String isotheroption;

	public String getUnitname() {
		return unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	public String getArryid() {
		return arryid;
	}

	public void setArryid(String arryid) {
		this.arryid = arryid;
	}

	private String unitname;

	private String arryid;



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

	public String getAttid() {
		return attid;
	}

	public void setAttid(String attid) {
		this.attid = attid;
	}

	public String getAttname() {
		return attname;
	}

	public void setAttname(String attname) {
		this.attname = attname;
	}

	public String getYdirect() {
		return ydirect;
	}

	public void setYdirect(String ydirect) {
		this.ydirect = ydirect;
	}

	public String getAttvalue() {
		return attvalue;
	}

	public void setAttvalue(String attvalue) {
		this.attvalue = attvalue;
	}

	public String getIsNormsParam() {
		return isNormsParam;
	}

	public void setIsNormsParam(String isNormsParam) {
		this.isNormsParam = isNormsParam;
	}

	public String getUnitid() {
		return unitid;
	}

	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}

	public String getAttrImg() {
		return attrImg;
	}

	public void setAttrImg(String attrImg) {
		this.attrImg = attrImg;
	}

	public Long getBcid() {
		return bcid;
	}

	public void setBcid(Long bcid) {
		this.bcid = bcid;
	}

	public void setIsotheroption(String isotheroption) {
		this.isotheroption = isotheroption;
	}

	public String getIsotheroption() {
		return isotheroption;
	}

	/**
	 * 商机ID
	 */
	private Long bcid;

	@Override
	public String toString() {
		return "MMTAttItem [attid=" + attid + ", attname=" + attname
				+ ", ydirect=" + ydirect + ", attvalue=" + attvalue
				+ ", isNormsParam=" + isNormsParam + ", unitid=" + unitid
				+ ", attrImg=" + attrImg + ", isTempAtt=" + isTempAtt
				+ ", isTempValue=" + isTempValue + ", isotheroption="
				+ isotheroption + ", unitname=" + unitname + ", arryid="
				+ arryid + ", bcid=" + bcid + "]";
	}

}
