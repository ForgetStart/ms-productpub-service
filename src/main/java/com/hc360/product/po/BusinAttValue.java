package com.hc360.product.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商机参数
 * @author xiangp
 * @version 1.0
 * @date 2018年11月8日 上午11:13:33
 */
public class BusinAttValue implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8775245115718838681L;

	/**
     * 主键ID
     */
    private BigDecimal id;

    /**
     * 商机ID
     */
    private BigDecimal bcId;

    /**
     * 参数ID
     */
    private BigDecimal attid;

    /**
     * 产品参数值
     */
    private String attvalue;

    /**
     * 是否导购参数
     */
    private String ydirect;

    /**
     * 超市分类前三位用来做分区
     */
    private String l3supcatid;

    /**
     * YFILL
     */
    private String yfill;

    /**
     * 参数名
     */
    private String attname;

    /**
     * 参数项单位
     */
    private String unit;

    /**
     * 发布时间
     */
    private Date publishTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 是否有效 ‘0’有效 ‘1’ 无效
     */
    private String status;

    /**
     * 是否规格参数： 0：否 1：是
     */
    private String isNormsParam;

    /**
     * 图片名称
     */
    private String picfile;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getBcId() {
        return bcId;
    }

    public void setBcId(BigDecimal bcId) {
        this.bcId = bcId;
    }

    public BigDecimal getAttid() {
        return attid;
    }

    public void setAttid(BigDecimal attid) {
        this.attid = attid;
    }

    public String getAttvalue() {
        return attvalue;
    }

    public void setAttvalue(String attvalue) {
        this.attvalue = attvalue == null ? null : attvalue.trim();
    }

    public String getYdirect() {
        return ydirect;
    }

    public void setYdirect(String ydirect) {
        this.ydirect = ydirect == null ? null : ydirect.trim();
    }

    public String getL3supcatid() {
        return l3supcatid;
    }

    public void setL3supcatid(String l3supcatid) {
        this.l3supcatid = l3supcatid == null ? null : l3supcatid.trim();
    }

    public String getYfill() {
        return yfill;
    }

    public void setYfill(String yfill) {
        this.yfill = yfill == null ? null : yfill.trim();
    }

    public String getAttname() {
        return attname;
    }

    public void setAttname(String attname) {
        this.attname = attname == null ? null : attname.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIsNormsParam() {
        return isNormsParam;
    }

    public void setIsNormsParam(String isNormsParam) {
        this.isNormsParam = isNormsParam == null ? null : isNormsParam.trim();
    }

    public String getPicfile() {
        return picfile;
    }

    public void setPicfile(String picfile) {
        this.picfile = picfile == null ? null : picfile.trim();
    }
}