package com.hc360.product.bo.busin;

import java.math.BigDecimal;

/**
 * 
 * 商机物流信息
 * 
 * @author liaoxn
 * @since JDK 1.8+
 *
 */
public class BusinLogisticsInfo {
	/**
	 * 运费类型 0-卖家承担 1-卖家承担
	 */
	private String transFare;
	/**
	 * 运费描述
	 */
	private String transFareDescribe;
	/**
	 * 发货地址对应id
	 */
	private String sendAddressValue;
	/**
	 * 发货期限
	 */
	private String timelimit = "10";
	/**
	 * 单位重量
	 */
	private BigDecimal weightkg;

	public String getTransFare() {
		return transFare;
	}

	public void setTransFare(String transFare) {
		this.transFare = transFare;
	}

	public String getTransFareDescribe() {
		return transFareDescribe;
	}

	public void setTransFareDescribe(String transFareDescribe) {
		this.transFareDescribe = transFareDescribe;
	}

	public String getSendAddressValue() {
		return sendAddressValue;
	}

	public void setSendAddressValue(String sendAddressValue) {
		this.sendAddressValue = sendAddressValue;
	}

	public String getTimelimit() {
		return timelimit;
	}

	public void setTimelimit(String timelimit) {
		this.timelimit = timelimit;
	}

	public BigDecimal getWeightkg() {
		return weightkg;
	}

	public void setWeightkg(BigDecimal weightkg) {
		this.weightkg = weightkg;
	}

}
