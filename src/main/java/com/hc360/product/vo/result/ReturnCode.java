package com.hc360.product.vo.result;

public enum ReturnCode {

    ERROR_PARAM(300,"参数为空"),
    ERROR_EXCEPTION(500,"系统服务繁忙,请稍后重试！"),
    OK(0,"OK"),
    ;

    private long errcode;

    private String errmsg;

    private ReturnCode(long errcode, String errmsg){
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    public long getErrcode() {
        return errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }
}
