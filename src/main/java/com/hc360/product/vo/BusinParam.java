
package com.hc360.product.vo;

/**
 * ***类说明***
 * 商机查询参数对象
 * @since 4.0
 */
public class BusinParam {
	/**
	 * 查询商机标题
	 */
	private String querytitle;

	/**
	 * 查询商机类型
	 */
	private String querysorttag;

	/**
	 * 查询商机状态
	 */
	private String querystate;

	/**
	 * 查询已经展示和未展示
	 */
	private String queryoperstate;

	/**
	 * 查询是否审核通过
	 */
	private int querychecked;

	private int pageNum;

	/**
	 * 页显示总数
	 */
	private int pagesize;

	/**
	 * 开始时间
	 */
	private String querystartdate;

	/**
	 * 结束时间
	 */
	private String queryenddate;
	/**
	 * 是否过期商机信息
	 */
	private boolean isOverdue;
	
	private String sorttag = "0";
	
	private String querykeyword;
	
	private String state = "1";//当前页状态 1：已发布上网 2：审核中 3：审核未通过 4：过期信息
	
	/**商机来源 0普通商机 1 一键；2 定制速配采购；3 速购定制；4 指定供应商；5供应转采购 */
	private String source;

	/*0所有信息 ；1 表示1周内 ； 2表示1个月内 ；3表示一个月前*/
	private String timeType;
	
	/**
	 * 是否支持在线交易
	 */
	private String isSupportTrade;
	/**
	 * 最低价格
	 */
	//前端展示
	private String minPriceStr;
	//后端查询
	private Double minPrice;
	/**
	 * 最高价格
	 */
	//前端展示
	private String maxPriceStr;
	//后端查询
	private Double maxPrice;
	
	/**
	 * 蒋艺滨
	 * 公司名称
	 */
	private String company_name;
	
	/**
	 * 蒋艺滨
	 * 联系人
	 */
	private String contacter;
	
	/**
	 * 蒋艺滨
	 * 商机id
	 */
	private String bc_id;
	
	/**
	 * 排序字段和排序方式
	 */
	private String orderType;
	
	private String queryrcchkstar;//查询质量星级 格式：1-2-3-4-5
	
	private int queryrcchkstarflag;//过滤查询质量星级标志 1：未选择任何星级查询 0：已选择星级
	
	/**
	 * 付款设置
	 */
	private String sellerConfirm;
	
	private long bsid;//商铺目录id;
	private long seriesid; //炫铺分类ID
	/**商铺名称**/
	private String seriesName;
	/**选择商机**/
	private String[] ids;
	/**改变为的商铺目录id*/
	private long cbsid;
	private long firstSeries;	//一级炫铺分类
	private long secondSeries;	//二级炫铺分类
	
	/**
	 * 是否参加活动.1 代表参加活动的产品
	 */
	private String active;
	/**
	 * 促销类型为 统一低价，要过滤掉商品 最低价小于于后台设置价格的 商品
	 */
	private Double minPriceLimit;
	/**
	 * 上传pdf文档名称
	 */
	private String pafname;
	/**
	 * 上传pdf文档路径
	 */
	private String pafurl;
	/**
	 * 主营商品
	 */
	private String mainbusin;
	/**
	 * 服务汇标识
	 */
	private Integer serviceflag;

	public Integer getServiceflag() {
		return serviceflag;
	}

	public void setServiceflag(Integer serviceflag) {
		this.serviceflag = serviceflag;
	}

	public String getPafname() {
		return pafname;
	}

	public void setPafname(String pafname) {
		this.pafname = pafname;
	}

	public String getPafurl() {
		return pafurl;
	}

	public void setPafurl(String pafurl) {
		this.pafurl = pafurl;
	}

	public String getSellerConfirm() {
		return sellerConfirm;
	}

	public void setSellerConfirm(String sellerConfirm) {
		this.sellerConfirm = sellerConfirm;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getIsSupportTrade() {
		return isSupportTrade;
	}

	public void setIsSupportTrade(String isSupportTrade) {
		this.isSupportTrade = isSupportTrade;
	}

	public String getMinPriceStr() {
		return minPriceStr;
	}

	public void setMinPriceStr(String minPriceStr) {
		this.minPriceStr = minPriceStr;
	}

	public Double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}

	public String getMaxPriceStr() {
		return maxPriceStr;
	}

	public void setMaxPriceStr(String maxPriceStr) {
		this.maxPriceStr = maxPriceStr;
	}

	public Double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getQuerykeyword() {
		return querykeyword;
	}

	public void setQuerykeyword(String querykeyword) {
		this.querykeyword = querykeyword;
	}

	public boolean isOverdue() {
		return isOverdue;
	}

	public void setOverdue(boolean isOverdue) {
		this.isOverdue = isOverdue;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public String getQueryoperstate() {
		return queryoperstate;
	}

	public void setQueryoperstate(String queryoperstate) {
		this.queryoperstate = queryoperstate;
	}

	public String getQuerysorttag() {
		return querysorttag;
	}

	public void setQuerysorttag(String querysorttag) {
		this.querysorttag = querysorttag;
	}

	public String getQuerystate() {
		return querystate;
	}

	public void setQuerystate(String querystate) {
		this.querystate = querystate;
	}

	public String getQuerytitle() {
		return querytitle;
	}

	public void setQuerytitle(String querytitle) {
		this.querytitle = querytitle;
	}

	public int getQuerychecked() {
		return querychecked;
	}

	public void setQuerychecked(int querychecked) {
		this.querychecked = querychecked;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public String getQueryenddate() {
		return queryenddate;
	}

	public void setQueryenddate(String queryenddate) {
		this.queryenddate = queryenddate;
	}

	public String getQuerystartdate() {
		return querystartdate;
	}

	public void setQuerystartdate(String querystartdate) {
		this.querystartdate = querystartdate;
	}

	public String getSorttag() {
		return sorttag;
	}

	public void setSorttag(String sorttag) {
		this.sorttag = sorttag;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTimeType() {
		return timeType;
	}

	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getContacter() {
		return contacter;
	}

	public void setContacter(String contacter) {
		this.contacter = contacter;
	}

	public String getBc_id() {
		return bc_id;
	}

	public void setBc_id(String bc_id) {
		this.bc_id = bc_id;
	}

	public String getQueryrcchkstar() {
		return queryrcchkstar;
	}

	public void setQueryrcchkstar(String queryrcchkstar) {
		this.queryrcchkstar = queryrcchkstar;
	}

	public int getQueryrcchkstarflag() {
		return queryrcchkstarflag;
	}

	public void setQueryrcchkstarflag(int queryrcchkstarflag) {
		this.queryrcchkstarflag = queryrcchkstarflag;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Double getMinPriceLimit() {
		return minPriceLimit;
	}

	public void setMinPriceLimit(Double minPriceLimit) {
		this.minPriceLimit = minPriceLimit;
	}

	/** @return the bsid */
	public long getBsid() {
		return bsid;
	}

	/** @param bsid the bsid to set */
	public void setBsid( long bsid ) {
		this.bsid = bsid;
	}

	/** @return the seriesName */
	public String getSeriesName() {
		return seriesName;
	}

	/** @param seriesName the seriesName to set */
	public void setSeriesName( String seriesName ) {
		this.seriesName = seriesName;
	}

	/** @return the ids */
	public String [] getIds() {
		return ids;
	}

	/** @param ids the ids to set */
	public void setIds( String [] ids ) {
		this.ids = ids;
	}

	/** @return the cbsid */
	public long getCbsid() {
		return cbsid;
	}

	/** @param cbsid the cbsid to set */
	public void setCbsid( long cbsid ) {
		this.cbsid = cbsid;
	}

	/** @return the seriesid */
	public long getSeriesid() {
		return seriesid;
	}

	/** @param seriesid the seriesid to set */
	public void setSeriesid( long seriesid ) {
		this.seriesid = seriesid;
	}

	/** @return the firstSeries */
	public long getFirstSeries() {
		return firstSeries;
	}

	/** @param firstSeries the firstSeries to set */
	public void setFirstSeries( long firstSeries ) {
		this.firstSeries = firstSeries;
	}

	/** @return the secondSeries */
	public long getSecondSeries() {
		return secondSeries;
	}

	/** @param secondSeries the secondSeries to set */
	public void setSecondSeries( long secondSeries ) {
		this.secondSeries = secondSeries;
	}

	public String getMainbusin() {
		return mainbusin;
	}

	public void setMainbusin(String mainbusin) {
		this.mainbusin = mainbusin;
	}
	
	
}