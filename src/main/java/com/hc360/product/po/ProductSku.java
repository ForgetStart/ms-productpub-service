package com.hc360.product.po;

import java.math.BigDecimal;
import java.util.Date;

public class ProductSku {
    /**
     * 主键 自增
     */
    private BigDecimal id;

    /**
     * 商机ID
     */
    private BigDecimal bcId;

    /**
     * 商家编码 
     */
    private String coding;

    /**
     * SKU值 Item:vale,pic; Item:vale,pic; Item:vale,pic
     */
    private String skuValue;

    /**
     * 供应量Sku对应的数量
     */
    private BigDecimal num;

    /**
     * 发布时间 
     */
    private Date publishTime;

    /**
     * 修改时间 
     */
    private Date modifyTime;

    /**
     * 是否有效‘0’有效 ‘1’ 无效
     */
    private String status;

    /**
     * sku索引
     */
    private String keyIndex;

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

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding == null ? null : coding.trim();
    }

    public String getSkuValue() {
        return skuValue;
    }

    public void setSkuValue(String skuValue) {
        this.skuValue = skuValue == null ? null : skuValue.trim();
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
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

    public String getKeyIndex() {
        return keyIndex;
    }

    public void setKeyIndex(String keyIndex) {
        this.keyIndex = keyIndex == null ? null : keyIndex.trim();
    }
}