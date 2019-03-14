/**
 * @file_name BusinVO.java
 * @project_name MS-Product-Service
 * @user hc360
 * @date 2019年2月24日
 */
package com.hc360.product.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 商机基本信息VO
 *
 * @author xiangp
 * @version 1.0
 * @date 2019年2月24日 下午6:51:13
 */
public class BusinBaseInfoVO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -7108531636491368910L;

    // 商机ID
    private long bcid;

    // 商机标题
    private String title;

    // 关键词
    private String[] keywords;

    // 参数列表
    private List<BusinAttValueVO> attValueList;

    // 发货地址Id
    private long sendAddrId;

    // 运费设置 类型 ：  '0'卖家承担 ，'1'买家承担（老数据运费说明），  '2'运费说明 ， '3'运费模板 ，'4'运费到付（买家承担）
    private String freightType;

    // 运费模板ID
    private long freighttemplateid;

    // 单位重量
    private String weightKg;

    // 发货日期
    private int timelimit;

    // 超市分类ID
    private String supcatid;

    // 终极分类层级标题 （一级>>二级>>..级>>终极）
    private String cateHeadings;
    
    // 品类ID
    private Long categoryid;
    
    /**
     * @return the bcid
     */
    public long getBcid() {
        return bcid;
    }

    /**
     * @param bcid the bcid to set
     */
    public void setBcid(long bcid) {
        this.bcid = bcid;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the keywords
     */
    public String[] getKeywords() {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    /**
     * @return the attValueList
     */
    public List<BusinAttValueVO> getAttValueList() {
        return attValueList;
    }

    /**
     * @param attValueList the attValueList to set
     */
    public void setAttValueList(List<BusinAttValueVO> attValueList) {
        this.attValueList = attValueList;
    }

    /**
     * @return the sendAddrId
     */
    public long getSendAddrId() {
        return sendAddrId;
    }

    /**
     * @param sendAddrId the sendAddrId to set
     */
    public void setSendAddrId(long sendAddrId) {
        this.sendAddrId = sendAddrId;
    }

    /**
     * @return the freightType
     */
    public String getFreightType() {
        return freightType;
    }

    /**
     * @param freightType the freightType to set
     */
    public void setFreightType(String freightType) {
        this.freightType = freightType;
    }

    /**
     * @return the freighttemplateid
     */
    public long getFreighttemplateid() {
        return freighttemplateid;
    }

    /**
     * @param freighttemplateid the freighttemplateid to set
     */
    public void setFreighttemplateid(long freighttemplateid) {
        this.freighttemplateid = freighttemplateid;
    }

    /**
     * @return the weightKg
     */
    public String getWeightKg() {
        return weightKg;
    }

    /**
     * @param weightKg the weightKg to set
     */
    public void setWeightKg(String weightKg) {
        this.weightKg = weightKg;
    }

    /**
     * @return the timelimit
     */
    public int getTimelimit() {
        return timelimit;
    }

    /**
     * @param timelimit the timelimit to set
     */
    public void setTimelimit(int timelimit) {
        this.timelimit = timelimit;
    }

    public String getSupcatid() {
        return supcatid;
    }

    public void setSupcatid(String supcatid) {
        this.supcatid = supcatid;
    }

	/**
	 * @return the cateHeadings
	 */
	public String getCateHeadings() {
		return cateHeadings;
	}

	/**
	 * @param cateHeadings the cateHeadings to set
	 */
	public void setCateHeadings(String cateHeadings) {
		this.cateHeadings = cateHeadings;
	}

	/**
	 * @return the categoryid
	 */
	public Long getCategoryid() {
		return categoryid;
	}

	/**
	 * @param categoryid the categoryid to set
	 */
	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}
    
}
