package com.hc360.product.po;

import java.math.BigDecimal;

public class BusinAddrConfig {
    /**
     * BUSIN_ADDR_CONFIG_ID
     */
    private Long businAddrConfigId;

    /**
     * 商机ID
     */
    private BigDecimal bcId;

    /**
     * 发货地址ID
     */
    private BigDecimal sendAddressId;

    public Long getBusinAddrConfigId() {
        return businAddrConfigId;
    }

    public void setBusinAddrConfigId(Long businAddrConfigId) {
        this.businAddrConfigId = businAddrConfigId;
    }

    public BigDecimal getBcId() {
        return bcId;
    }

    public void setBcId(BigDecimal bcId) {
        this.bcId = bcId;
    }

    public BigDecimal getSendAddressId() {
        return sendAddressId;
    }

    public void setSendAddressId(BigDecimal sendAddressId) {
        this.sendAddressId = sendAddressId;
    }
}