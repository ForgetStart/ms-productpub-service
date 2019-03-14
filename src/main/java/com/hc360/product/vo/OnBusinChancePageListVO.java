/**
 * @file_name OnBusinChanceListPageVO.java
 * @project_name MS-Product
 * @user hc360
 * @date 2019年2月19日
 */
package com.hc360.product.vo;

import java.io.Serializable;
import java.util.List;

import com.hc360.product.po.OnBusinChance;

/**
 * @author hc360
 * @version 1.0
 * @date 2019年2月19日 下午10:11:16
 */
public class OnBusinChancePageListVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2904705169026638501L;

	private PageBean pageBean;
	
	private List<OnBusinChance> busins;

	/**
	 * @return the pageBean
	 */
	public PageBean getPageBean() {
		return pageBean;
	}

	/**
	 * @param pageBean the pageBean to set
	 */
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	/**
	 * @return the busins
	 */
	public List<OnBusinChance> getBusins() {
		return busins;
	}

	/**
	 * @param busins the busins to set
	 */
	public void setBusins(List<OnBusinChance> busins) {
		this.busins = busins;
	}
	
}
