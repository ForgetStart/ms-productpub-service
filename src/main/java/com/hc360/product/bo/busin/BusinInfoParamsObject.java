package com.hc360.product.bo.busin;



/**
 * 
 * 商机信息参数对象<br>
 * 用于接收页面表单提交的商机信息保存或者修改
 * @author liaoxn
 * @since JDK 1.8+
 *
 */
public class BusinInfoParamsObject {
	/**
	 * 商机基本信息
	 */
	private BusinBaseInfo baseInfo;
	/**
	 * 商机交易信息
	 */
	private BusinTradeInfo tradeInfo;
	/**
	 * 商机图片信息
	 */
	private BusinImagesInfo imagesInfo;
	/**
	 * 商机物流信息
	 */
	private BusinLogisticsInfo logisticsInfo;
	/**
	 * 商机其他类信息
	 */
	private BusinOtherInfo otherInfo;

	public BusinBaseInfo getBaseInfo() {
		return baseInfo;
	}

	public void setBaseInfo(BusinBaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

	public BusinTradeInfo getTradeInfo() {
		return tradeInfo;
	}

	public void setTradeInfo(BusinTradeInfo tradeInfo) {
		this.tradeInfo = tradeInfo;
	}

	public BusinImagesInfo getImagesInfo() {
		return imagesInfo;
	}

	public void setImagesInfo(BusinImagesInfo imagesInfo) {
		this.imagesInfo = imagesInfo;
	}

	public BusinLogisticsInfo getLogisticsInfo() {
		return logisticsInfo;
	}

	public void setLogisticsInfo(BusinLogisticsInfo logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
	}

	public BusinOtherInfo getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(BusinOtherInfo otherInfo) {
		this.otherInfo = otherInfo;
	}

	
}
