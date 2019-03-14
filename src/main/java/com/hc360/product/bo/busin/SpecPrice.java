/**
 * @file_name SpecPriceVO.java
 * @project_name MS-Product-Service
 * @user hc360
 * @date 2019年2月23日
 */
package com.hc360.product.bo.busin;

/**
 * 规格报价
 * @author xiangp
 * @version 1.0
 * @date 2019年2月23日 下午2:58:43
 */
public class SpecPrice {
	
	private Long id;
	
	// 价格Id
	private Long priceId;

	// 商家编码
	private String coding;
	
	// sku:值
	private String skuValue; 
	// 价格
	private String unitPrice;
	
	// 供应量
	private String num;
	
	// sku索引
	private String keyindex;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public Long getPriceId() {
		return priceId;
	}

	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}

	/**
	 * @return the coding
	 */
	public String getCoding() {
		return coding;
	}

	/**
	 * @param coding the coding to set
	 */
	public void setCoding(String coding) {
		this.coding = coding;
	}

	/**
	 * @return the skuValue
	 */
	public String getSkuValue() {
		return skuValue;
	}

	/**
	 * @param skuValue the skuValue to set
	 */
	public void setSkuValue(String skuValue) {
		this.skuValue = skuValue;
	}

	/**
	 * @return the unitprice
	 */
	public String getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitprice the unitprice to set
	 */
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the num
	 */
	public String getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(String num) {
		this.num = num;
	}

	/**
	 * @return the keyindex
	 */
	public String getKeyindex() {
		return keyindex;
	}

	/**
	 * @param keyindex the keyindex to set
	 */
	public void setKeyindex(String keyindex) {
		this.keyindex = keyindex;
	}
	
}
