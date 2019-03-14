package com.hc360.product.vo;

import java.util.List;

public class BusinPdfParamVO {

	private Long bcid;

	private long pdfshowid;

	/**要删除的pdf showid**/
	private String pdfshowiddelete;

	/** pdf名称 */
	private String pdfname;

	/** pdf路径 */
	private String pdfpath;


	public Long getBcid() {
		return bcid;
	}

	public void setBcid(Long bcid) {
		this.bcid = bcid;
	}

	public long getPdfshowid() {
		return pdfshowid;
	}

	public void setPdfshowid(long pdfshowid) {
		this.pdfshowid = pdfshowid;
	}

	public String getPdfshowiddelete() {
		return pdfshowiddelete;
	}

	public void setPdfshowiddelete(String pdfshowiddelete) {
		this.pdfshowiddelete = pdfshowiddelete;
	}

	public String getPdfname() {
		return pdfname;
	}

	public void setPdfname(String pdfname) {
		this.pdfname = pdfname;
	}

	public String getPdfpath() {
		return pdfpath;
	}

	public void setPdfpath(String pdfpath) {
		this.pdfpath = pdfpath;
	}
}
