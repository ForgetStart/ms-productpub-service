/**
 * @file_name IntervalPriceVO.java
 * @project_name MS-Product-Service
 * @user hc360
 * @date 2019年2月23日
 */
package com.hc360.product.vo;

import java.io.Serializable;

/**
 * 区间价格
 * @author xiangp
 * @version 1.0
 * @date 2019年2月23日 下午2:32:53
 */
public class IntervalPriceVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3734163057834277667L;

	private long id;
	
	// product_sku表ID
	private long skuId;
	
	// 报价类型:0 区间报价，1 规格报价，2 混批报价 
	private String priceType;
	
	// 采购数量
	private int buyNum;
	
	// 商品单价
	private String buyPrice;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	
	/**
	 * @return the skuId
	 */
	public long getSkuId() {
		return skuId;
	}

	/**
	 * @param skuId the skuId to set
	 */
	public void setSkuId(long skuId) {
		this.skuId = skuId;
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
	 * @return the buyNum
	 */
	public int getBuyNum() {
		return buyNum;
	}

	/**
	 * @param buyNum the buyNum to set
	 */
	public void setBuyNum(int buyNum) {
		this.buyNum = buyNum;
	}

	/**
	 * @return the buyPrice
	 */
	public String getBuyPrice() {
		return buyPrice;
	}

	/**
	 * @param buyPrice the buyPrice to set
	 */
	public void setBuyPrice(String buyPrice) {
		this.buyPrice = buyPrice;
	}
	
}
