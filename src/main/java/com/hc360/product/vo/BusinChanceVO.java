/**
 * @file_name OnBusinChanceVO.java
 * @project_name MS-Product-Gateway
 * @user hc360
 * @date 2019年2月23日
 */
package com.hc360.product.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * 商机实体
 * @author xiangp
 * @version 1.0
 * @date 2019年2月23日 下午8:40:00
 */
public class BusinChanceVO {
	
	/**
	 * 商机来源 
	 * 1、会员自发
	 * 2、搬家
	 * 3、批量发布
	 * 4、销售代发
	 * 5、纷享销客
	 * 6、畅捷通
	 */
	private String businSource;
	
	/**
	 * 商机分类标志 0： 供应产品 1： 采购产品 2： 代理产品 3： 合作产品 4： 招标产品 5： 二手产品 6： 租赁信息
	 */
	private String sorttag;

	/**
	 * 商机标题 在这一版中===Keyword
	 */
	private String title;

	/**
	 * 商机关键字
	 */
	private String keyword;

	/**
	 * 商机关键字
	 */
	private String keyword2;

	/**
	 * 商机关键字
	 */
	private String keyword3;

	/**
	 * Validdate为有效期
	 */
	private String validdate;

	/**
	 * 产品简介
	 */
	private String introduce;

	/**
	 * 产品型号
	 */
	private String type;

	/**
	 * 包装说明
	 */
	private String lpackage;

	/**
	 * 产品单价
	 */
	private String pricerange;

	private String l3supcatid;

	// 以下为联系信息在商机表中不作处理,以下这些都存在on_cor_table表中
	/**
	 * 运输说明
	 */
	private String transport;

	/**
	 * 交货说明
	 */
	private String deliver;

	/**
	 * 商机商品编号
	 */
	private String bcid;

	/**
	 * 品牌编号
	 */
	private String brandid;

	/**
	 * 品牌名称
	 */
	private String brandname;

	/**
	 * 企业编码
	 */
	private String providerid;

	/**
	 * 企业名称
	 */
	private String username;

	/**
	 * 产品发布日期（默认为当前日期）
	 */
	private String pubdate;

	/**
	 * 供货总量
	 */
	private String num;

	/**
	 * 商机库（存量/需求量单位）
	 */
	private String unit;

	/**
	 * 
	 */
	private String checked;

	/**
	 * 商机参数
	 */
	private List<BusinAttValueVO> attlist;

	/**
	 * 商机标题个性标志 0 新品 1 优惠 2 降价
	 */
	private String individflag;

	/**
	 * 超市分类ID前3位
	 */
	private String l3supercat;

	/**
	 * 超市分类ID
	 */
	private String supcatid;

	/**
	 * 超市分类名称
	 */
	private String supcatname;

	/**
	 * 一级分类名称
	 */
	private String l3supcatname;

	/**
	 * 页面元素,分类ID
	 */
	private String catid;

	/**
	 * 信息免审标识
	 */
	private String uncheck;

	/**
	 * 用于图片上传的唯一标识
	 */
	private String sessionid;

	/**
	 * 最小起订量
	 */
	private String minordernum;

	/**
	 * 是否有全景图
	 */
	private String yview360;

	/**
	 * 全景预览图
	 */
	private String preview360path;

	/**
	 * 全景图
	 */
	private String view360path;

	/**
	 * 全景图编号
	 */
	private String viewid;

	/**
	 * 在商机表中 是否买家速配 4.0版中新加
	 */
	private String issendmail;

	/**
	 * 在商机表中 是否允许任何联系方式和我联系 4.0版中新加
	 */
	private String iscontacted;

	/**
	 * 发货期限
	 */
	private String timelimit = "10";

	
	// 0、客户发布1、客户端发布 2、人工代发3、批量导入4、产品转商机5、匿名求购6、求购抓取
	private String pubType = "0";


	private int businType;// 商机类型 1:供应 2：采购 3：招标

	/** 产品材质 */
	private String material;

	/** 产品资质 */
	private String qualific;

	/** 商机来源（普通采购 0；一键快速发布采购 1；定制速配采购 2；速购定制 3；指定私密商采购 4；供应转商机 5 */
	private String source;

	/**
	 * 是否支持在线交易 0-不支持 1-支持
	 */
	private String isSupportTrade;
	/**
	 * 运费类型 0-卖家承担 1-卖家承担
	 */
	private String transFare;

	/**
	 * 运费描述
	 */
	private String transFareDescribe;

	/**
	 * 发货地址对应id
	 */
	private String sendAddressId;

	// 商机质量星级
	private int star;
	// 商机质量得分
	private String rcscore;

	/**
	 * 商机报价方式 “0”为区间报价，“1”为规格报价，“2”为混合报价
	 */
	private String priceType;

	
	/**
	 * 图片名称
	 * 
	 */
	private String picpath;
	
	// 计量单位/公斤
	private BigDecimal weightkg;
	
	/**运费模版ID*/
    private long freighttemplateid;
    
    /** pdf路径 */
    private String pdfpath;
    
    /** pdf名称 */
    private String pdfname;
    
    /** pdfshow的ID */
    private String pdfshowid;
    
    /**要删除的pdf showid**/
    private String pdfshowiddelete;
    
    /** 商机打标 */
    private String businmark;
	
}
