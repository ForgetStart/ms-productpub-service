package com.hc360.product.po;

import java.math.BigDecimal;
import java.util.Date;

public class BusinFareConfig {
    /**
     * BUSIN_FARE_CONFIG_ID
     */
    private Long businFareConfigId;

    /**
     * 商机id
     */
    private BigDecimal bcId;

    /**
     * '0'卖家承担 '1'买家承担（老数据运费说明）  '2'运费说明  '3'运费模板 '4'运费到付（买家承担）
     */
    private String type;

    /**
     * 运费描述
     */
    private String describe;

    /**
     * PUBLISH_TIME
     */
    private Date publishTime;

    /**
     * PUBLISH_MAN
     */
    private String publishMan;

    /**
     * UPDATE_TIME
     */
    private Date updateTime;

    /**
     * UPDATE_MAN
     */
    private String updateMan;

    /**
     * 运费模版ID
     */
    private Long freightTemplateId;

    public Long getBusinFareConfigId() {
        return businFareConfigId;
    }

    public void setBusinFareConfigId(Long businFareConfigId) {
        this.businFareConfigId = businFareConfigId;
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getPublishMan() {
        return publishMan;
    }

    public void setPublishMan(String publishMan) {
        this.publishMan = publishMan == null ? null : publishMan.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan = updateMan == null ? null : updateMan.trim();
    }

    public Long getFreightTemplateId() {
        return freightTemplateId;
    }

    public void setFreightTemplateId(Long freightTemplateId) {
        this.freightTemplateId = freightTemplateId;
    }
}