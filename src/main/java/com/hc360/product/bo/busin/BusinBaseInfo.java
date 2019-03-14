package com.hc360.product.bo.busin;

import java.util.Date;
import java.util.List;

import com.hc360.b2b.util.annotation.charfilter.charfilterremoved;

/**
 * 
 * 商机基本信息
 * 
 * @author liaoxn
 * @since JDK 1.8+
 *
 */
public class BusinBaseInfo {
	/**
	 * 商机ID
	 */
	private Long bcid;
	
	private Long providerid;
	
	private String userName;
	
	/**
	 * 商机信息标题
	 */
	private String title;
	/**
	 * 商机关键词。最多5个词，用逗号分隔
	 */
	private String keyword;
	/**
	 * 商机参数
	 */
	private List<BusinAttItem> items;
	/**
	 * 超市分类ID
	 */
	private String supcatid;
	/**
	 * 产品简介
	 */
	@charfilterremoved
	private String introduce;
	/**
	 * 商机分类标志 0： 供应产品 1： 采购产品 2： 代理产品 3： 合作产品 4： 招标产品 5： 二手产品 6： 租赁信息
	 */
	private String sorttag;
	/**
	 * 品牌名称
	 */
	private String brandname;

	/**
	 * 商机标题个性标志 0 新品 1 优惠 2 降价
	 */
	private String individflag;

	/**
	 * 单位重量
	 */
	private String weightKg;

	/**
	 * 星级
	 */
	private String star;

	/**
	 * 服务类商机标识：1为服务类商机
	 */
	private String serviceflag;

	/**
	 * 发布类型： '1':会员自发 '2':搬家 '3':批量发布 '4':销售代发 '5':纷享销客 '6':畅捷通
	 */
	private String businSource;

	/**
	 * 分类ID
	 */
	private String seriesid;

	/**
	 * 包装说明
	 */
	private String lpackage;

	/**
	 * 交货说明
	 */
	private String deliver;

	/**
	 * 运输说明
	 */
	private String transport;

	/**
	 * 求购有效期
	 */
	private String validdate;

	/**
	 * 审核状态
	 */
	private String checked;

	/**
	 * 审核人
	 */
	private String checkman;
	
	/**
	 * 审核日期
	 */
	private Date checkdate;
	
	/**
	 * 删除日期
	 */
	private Date deldate;
	
	/**
	 * 更新日期
	 */
	private Date updatetime;

	public Long getBcid() {
		return bcid;
	}

	public void setBcid(Long bcid) {
		this.bcid = bcid;
	}

	public Long getProviderid() {
		return providerid;
	}

	public void setProviderid(Long providerid) {
		this.providerid = providerid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<BusinAttItem> getItems() {
		return items;
	}

	public void setItems(List<BusinAttItem> items) {
		this.items = items;
	}

	public String getSupcatid() {
		return supcatid;
	}

	public void setSupcatid(String supcatid) {
		this.supcatid = supcatid;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getSorttag() {
		return sorttag;
	}

	public void setSorttag(String sorttag) {
		this.sorttag = sorttag;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getIndividflag() {
		return individflag;
	}

	public void setIndividflag(String individflag) {
		this.individflag = individflag;
	}

	public String getWeightKg() {
		return weightKg;
	}

	public void setWeightKg(String weightKg) {
		this.weightKg = weightKg;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public String getServiceflag() {
		return serviceflag;
	}

	public void setServiceflag(String serviceflag) {
		this.serviceflag = serviceflag;
	}

	public String getBusinSource() {
		return businSource;
	}

	public void setBusinSource(String businSource) {
		this.businSource = businSource;
	}

	public String getSeriesid() {
		return seriesid;
	}

	public void setSeriesid(String seriesid) {
		this.seriesid = seriesid;
	}

	public String getLpackage() {
		return lpackage;
	}

	public void setLpackage(String lpackage) {
		this.lpackage = lpackage;
	}

	public String getDeliver() {
		return deliver;
	}

	public void setDeliver(String deliver) {
		this.deliver = deliver;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getValiddate() {
		return validdate;
	}

	public void setValiddate(String validdate) {
		this.validdate = validdate;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getCheckman() {
		return checkman;
	}

	public void setCheckman(String checkman) {
		this.checkman = checkman;
	}

	public Date getCheckdate() {
		return checkdate;
	}

	public void setCheckdate(Date checkdate) {
		this.checkdate = checkdate;
	}

	public Date getDeldate() {
		return deldate;
	}

	public void setDeldate(Date deldate) {
		this.deldate = deldate;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
}
