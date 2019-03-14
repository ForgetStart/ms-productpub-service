package com.hc360.product.po;

import java.math.BigDecimal;

public class BusinLongInfo {
    /**
     * ID
     */
    private BigDecimal id;

    /**
     * BC_ID
     */
    private BigDecimal bcId;

    /**
     * SEARCHINTRODUCE
     */
    private String searchintroduce;

    /**
     * TYPE
     */
    private String type;

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

    public String getSearchintroduce() {
        return searchintroduce;
    }

    public void setSearchintroduce(String searchintroduce) {
        this.searchintroduce = searchintroduce == null ? null : searchintroduce.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}