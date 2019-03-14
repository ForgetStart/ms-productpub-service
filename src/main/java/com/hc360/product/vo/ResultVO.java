/**
 * @file_name ResultVO.java
 * @project_name MS-Product-Gateway
 * @user hc360
 * @date 2019年2月20日
 */
package com.hc360.product.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author hc360
 * @version 1.0
 * @date 2019年2月20日 下午6:05:02
 */
public class ResultVO<T> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -135193435732904671L;
	
	public static final String SUCCESS = "0"; 
	
	public static final String FALL = "-1"; 
	
	public static final String SERVICE_SYSTEM_MSG = "服务系统错误"; 
	public static final String API_SYSTEM_MSG = "API系统错误"; 
	
	public static final String PARAM_MSG = "参数错误"; 
	
	// 错误代码
	private String errcode;
	// 错误信息
	private String errmsg;
	// 数据
	private T data;
	/**
	 * @return the errcode
	 */
	public String getErrcode() {
		return errcode;
	}
	/**
	 * @param errcode the errcode to set
	 */
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	/**
	 * @return the errmsg
	 */
	public String getErrmsg() {
		return errmsg;
	}
	/**
	 * @param errmsg the errmsg to set
	 */
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	
}
