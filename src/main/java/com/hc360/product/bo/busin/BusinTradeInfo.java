package com.hc360.product.bo.busin;

import java.util.List;

/**
 * 
 * 商机交易信息
 * 
 * @author liaoxn
 * @since JDK 1.8+
 *
 */
public class BusinTradeInfo {
	/**
	 * 是否支持在线交易 0-不支持 1-支持
	 */
	private String isSupportTrade;
	/**
	 * 计量单位
	 */
	private String unit;
	/**
	 * 商机报价方式 “0”为区间报价，“1”为规格报价，“2”为混合报价
	 */
	private String priceType;

	/**
	 * 供货总量
	 */
	private String num;
	/**
	 * 最小起订量
	 */
	private String minorderNum;
	/**
	 * 是否批量规格修改
	 */
	private boolean isBatchGgModifiy;

	/**
	 * 产品单价
	 */
	private String pricerange;

	// 区间报价
	private List<IntervalPrice> intervalPrice;

	// 规格报价
	private List<SpecPrice> specPrice;

	public String getIsSupportTrade() {
		return isSupportTrade;
	}

	public void setIsSupportTrade(String isSupportTrade) {
		this.isSupportTrade = isSupportTrade;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMinorderNum() {
		return minorderNum;
	}

	public void setMinorderNum(String minorderNum) {
		this.minorderNum = minorderNum;
	}

	public boolean isBatchGgModifiy() {
		return isBatchGgModifiy;
	}

	public void setBatchGgModifiy(boolean isBatchGgModifiy) {
		this.isBatchGgModifiy = isBatchGgModifiy;
	}

	public String getPricerange() {
		return pricerange;
	}

	public void setPricerange(String pricerange) {
		this.pricerange = pricerange;
	}

	public List<IntervalPrice> getIntervalPrice() {
		return intervalPrice;
	}

	public void setIntervalPrice(List<IntervalPrice> intervalPrice) {
		this.intervalPrice = intervalPrice;
	}

	public List<SpecPrice> getSpecPrice() {
		return specPrice;
	}

	public void setSpecPrice(List<SpecPrice> specPrice) {
		this.specPrice = specPrice;
	}
}
