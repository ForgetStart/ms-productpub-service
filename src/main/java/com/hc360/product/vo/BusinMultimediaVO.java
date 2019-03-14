/**
 * @file_name BusinMultimediaVO.java
 * @project_name MS-Product-Service
 * @user hc360
 * @date 2019年2月22日
 */
package com.hc360.product.vo;

/**
 * 商机图片VO
 * @author xiangp
 * @version 1.0
 * @date 2019年2月22日 上午9:37:36
 */
public class BusinMultimediaVO {

	// 图片Id
	private long bimId;
	// 存储名称
	private String filename;
	// 宽
	private int width;
	// 高
	private int height;
	// 是否默认图片
	private String defaultflag;
	// 原图url
	private String url;
	// 审核状态  0：未审核 1：已审核 2：已删除
	private String checked;
	
	/**
	 * @return the bimId
	 */
	public long getBimId() {
		return bimId;
	}
	/**
	 * @param bimId the bimId to set
	 */
	public void setBimId(long bimId) {
		this.bimId = bimId;
	}
	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}
	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the defaultflag
	 */
	public String getDefaultflag() {
		return defaultflag;
	}
	/**
	 * @param defaultflag the defaultflag to set
	 */
	public void setDefaultflag(String defaultflag) {
		this.defaultflag = defaultflag;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the checked
	 */
	public String getChecked() {
		return checked;
	}
	/**
	 * @param checked the checked to set
	 */
	public void setChecked(String checked) {
		this.checked = checked;
	}
	
}
