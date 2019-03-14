package com.hc360.product.vo;

import java.util.List;

public class BusinTempParamVO {

	private Long bcid;

	private long providerid;

	/**
	 * 页面元素,分类ID
	 */
	private Long catid;

	/**
	 * 临时参数LIST
	 */
	private List tmpAttlist;

	/**
	 * 商机参数
	 */
	private List<MMTAttItem> attlist;

	private String checked;

	private String checkman;

	/**
	 * 是否批量修改
	 */
	private boolean isBatchModifiy;


	public Long getBcid() {
		return bcid;
	}

	public void setBcid(Long bcid) {
		this.bcid = bcid;
	}

	public long getProviderid() {
		return providerid;
	}

	public void setProviderid(long providerid) {
		this.providerid = providerid;
	}

	public Long getCatid() {
		return catid;
	}

	public void setCatid(Long catid) {
		this.catid = catid;
	}

	public List getTmpAttlist() {
		return tmpAttlist;
	}

	public void setTmpAttlist(List tmpAttlist) {
		this.tmpAttlist = tmpAttlist;
	}

	public List<MMTAttItem> getAttlist() {
		return attlist;
	}

	public void setAttlist(List<MMTAttItem> attlist) {
		this.attlist = attlist;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getCheckman() {
		return checkman;
	}

	public void setCheckman(String checkman) {
		this.checkman = checkman;
	}

	public boolean isBatchModifiy() {
		return isBatchModifiy;
	}

	public void setBatchModifiy(boolean batchModifiy) {
		isBatchModifiy = batchModifiy;
	}
}
