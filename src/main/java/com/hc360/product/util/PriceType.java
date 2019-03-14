package com.hc360.product.util;

public enum PriceType
{
  INTERVAL_QUOTE("0", "区间报价"),  
  SPEC_QUOTE("1", "规格报价"),  
  BLEND_QUOTE("2", "混合报价"),  
  CALL_QUOTE("4", "电话议价");
  
  public String type;
  public String desc;
  
  private PriceType(String type, String desc)
  {
    this.type = type;
    this.desc = desc;
  }
}
