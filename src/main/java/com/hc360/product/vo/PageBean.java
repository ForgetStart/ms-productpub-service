/**
 * @file_name PageBean.java
 * @project_name MS-Product
 * @user hc360
 * @date 2019年2月19日
 */
package com.hc360.product.vo;

import java.io.Serializable;

/**
 * @author hc360
 * @version 1.0
 * @date 2019年2月19日 下午10:09:01
 */
public class PageBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2516958880789405291L;
	
	private int page;
	private int pageSize;
	private int pages;
	private long totalCount;
	
	
	/**
	 * 
	 */
	public PageBean() {
		super();
	}
	/**
	 * @param page
	 * @param pageSize
	 * @param totalCount
	 */
	public PageBean(int page, int pageSize, int pages, long totalCount) {
		super();
		this.page = page;
		this.pageSize = pageSize;
		this.pages = pages;
		this.totalCount = totalCount;
	}
	/**
	 * @return the page
	 */
	public int getPage() {
		return page;
	}
	/**
	 * @param page the page to set
	 */
	public void setPage(int page) {
		this.page = page;
	}
	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}
	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}
	/**
	 * @return the totalCount
	 */
	public long getTotalCount() {
		return totalCount;
	}
	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	
}
