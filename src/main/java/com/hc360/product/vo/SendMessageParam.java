package com.hc360.product.vo;

public class SendMessageParam {

	private Long bcid;

	private Long providerid;

	private String username;

	private String checked;

	//'0'：非免审 '1'：免审
	private String unchecked;

	//是否为修改商机
	private boolean editflag;


	public Long getBcid() {
		return bcid;
	}

	public void setBcid(Long bcid) {
		this.bcid = bcid;
	}

	public Long getProviderid() {
		return providerid;
	}

	public void setProviderid(Long providerid) {
		this.providerid = providerid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getUnchecked() {
		return unchecked;
	}

	public void setUnchecked(String unchecked) {
		this.unchecked = unchecked;
	}

	public boolean getEditflag() {
		return editflag;
	}

	public void setEditflag(boolean editflag) {
		this.editflag = editflag;
	}
}
