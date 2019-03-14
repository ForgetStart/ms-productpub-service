package com.hc360.product.bo.busin;

/**
 * 
 * 商机其他类信息
 * 
 * @author liaoxn
 * @since JDK 1.8+
 *
 */
public class BusinOtherInfo {

	/** 商铺目录 **/
	private String bsId = "0";
	/** 商铺目录 2级别 **/
	private String secondSeries = "0";

	public String getBsId() {
		return bsId;
	}

	public void setBsId(String bsId) {
		this.bsId = bsId;
	}

	public String getSecondSeries() {
		return secondSeries;
	}

	public void setSecondSeries(String secondSeries) {
		this.secondSeries = secondSeries;
	}

}
