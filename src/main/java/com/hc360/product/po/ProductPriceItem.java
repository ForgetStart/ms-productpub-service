package com.hc360.product.po;

import java.math.BigDecimal;
import java.util.Date;

public class ProductPriceItem {
    /**
     * 主键
     */
    private BigDecimal id;

    /**
     * SKU表主键 :SKU表 区间价项目默认 0 
     */
    private BigDecimal skuId;

    /**
     * 商机ID
     */
    private BigDecimal bcId;

    /**
     * 报价类型: 0 区间报价， 1 规格报价， 2 混批报价
     */
    private String type;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 间隔采购量
     */
    private BigDecimal imoq;

    /**
     * 发布时间
     */
    private Date publishTime;

    /**
     * 是否有效:‘0’有效  ‘1’ 无效
     */
    private String states;

    /**
     * 修改时间
     */
    private Date modifyTime;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getSkuId() {
        return skuId;
    }

    public void setSkuId(BigDecimal skuId) {
        this.skuId = skuId;
    }

    public BigDecimal getBcId() {
        return bcId;
    }

    public void setBcId(BigDecimal bcId) {
        this.bcId = bcId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getImoq() {
        return imoq;
    }

    public void setImoq(BigDecimal imoq) {
        this.imoq = imoq;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states == null ? null : states.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}