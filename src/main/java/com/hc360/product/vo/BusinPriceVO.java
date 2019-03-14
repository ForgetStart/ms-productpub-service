/**
 * @file_name BusinPriceVO.java
 * @project_name MS-Product-Service
 * @user hc360
 * @date 2019年2月23日
 */
package com.hc360.product.vo;

import java.util.List;

/**
 * @author hc360
 * @version 1.0
 * @date 2019年2月23日 下午6:07:42
 */
public class BusinPriceVO {
	
	// 是否支持在线交易，1-支持，0或空-不支持
	private String isSupportTrade;
	
	/*
	 * 报价类型:
	 *  数据库存储： 0-电话议价/区间报价，1-规格报价，2-混批报价 
	 *  页面展示: 0-区间报价，1-规格报价，2-混批报价 ，4-电话议价（根据pricetype和pricerange得出）
	 */
	private String priceType;
	
	// 计量单位
	private String unit;
	
	// 区间报价
	private List<IntervalPriceVO> intervalPrice;
	
	// 规格报价
	private List<SpecPriceVO> specPrice;
	
	// 供应总量
	private String totalNum;

	/**
	 * @return the isSupportTrade
	 */
	public String getIsSupportTrade() {
		return isSupportTrade;
	}

	/**
	 * @param isSupportTrade the isSupportTrade to set
	 */
	public void setIsSupportTrade(String isSupportTrade) {
		this.isSupportTrade = isSupportTrade;
	}

	/**
	 * @return the priceType
	 */
	public String getPriceType() {
		return priceType;
	}

	/**
	 * @param priceType the priceType to set
	 */
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * @return the intervalPrice
	 */
	public List<IntervalPriceVO> getIntervalPrice() {
		return intervalPrice;
	}

	/**
	 * @param intervalPrice the intervalPrice to set
	 */
	public void setIntervalPrice(List<IntervalPriceVO> intervalPrice) {
		this.intervalPrice = intervalPrice;
	}

	/**
	 * @return the specPriceVOList
	 */
	public List<SpecPriceVO> getSpecPrice() {
		return specPrice;
	}

	/**
	 * @param specPriceVOList the specPriceVOList to set
	 */
	public void setSpecPrice(List<SpecPriceVO> specPriceVOList) {
		this.specPrice = specPriceVOList;
	}

	/**
	 * @return the totalNum
	 */
	public String getTotalNum() {
		return totalNum;
	}

	/**
	 * @param totalNum the totalNum to set
	 */
	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	
}
