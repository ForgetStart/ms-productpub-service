package com.hc360.product.po;

import java.math.BigDecimal;
import java.util.Date;

public class BusinChance {
    /**
     * 商机id
     */
    private BigDecimal bcId;

    /**
     * INDIVIDFLAG
     */
    private String individflag;

    /**
     * SORTTAG
     */
    private String sorttag;

    /**
     * TITLE
     */
    private String title;

    /**
     * TYPE
     */
    private String type;

    /**
     * BRANDID
     */
    private BigDecimal brandid;

    /**
     * KEYWORD
     */
    private String keyword;

    /**
     * KEYWORD2
     */
    private String keyword2;

    /**
     * KEYWORD3
     */
    private String keyword3;

    /**
     * LPACKAGE
     */
    private String lpackage;

    /**
     * DELIVER
     */
    private String deliver;

    /**
     * TRANSPORT
     */
    private String transport;

    /**
     * UNIT
     */
    private String unit;

    /**
     * VALIDDATE
     */
    private Long validdate;

    /**
     * PUBDATE
     */
    private Date pubdate;

    /**
     * 企业代码
     */
    private Long providerid;

    /**
     * 企业会员登陆名称
     */
    private String username;

    /**
     * 是否已通过审核 '0':未通过审核（默认值） '1':已审核通过 '2':审核未通过
     */
    private String checked;

    /**
     * CHECKDATE
     */
    private Date checkdate;

    /**
     * CHECKMAN
     */
    private String checkman;

    /**
     * ENDDATE
     */
    private Date enddate;

    /**
     * NUM
     */
    private String num;

    /**
     * 推送状态 '0'-未推 '1'-已推
     */
    private String operstate;

    /**
     * STATES
     */
    private String states;

    /**
     * ORIGNPCI_ID
     */
    private BigDecimal orignpciId;

    /**
     * ORIGN
     */
    private String orign;

    /**
     * YREPEATED
     */
    private String yrepeated;

    /**
     * 搜索加载状态 '0'-待抓 '1'-已抓
     */
    private String searchstate;

    /**
     * DELDATE
     */
    private Date deldate;

    /**
     * UPDATETIME
     */
    private Date updatetime;

    /**
     * WHOUPDATE
     */
    private String whoupdate;

    /**
     * WHOINPUT
     */
    private String whoinput;

    /**
     * WHODEL
     */
    private String whodel;

    /**
     * PICPATH
     */
    private String picpath;

    /**
     * YPIC
     */
    private String ypic;

    /**
     * REPEATTIMES
     */
    private Long repeattimes;

    /**
     * SUPCATID
     */
    private String supcatid;

    /**
     * L3SUPCATID
     */
    private String l3supcatid;

    /**
     * COMMEND
     */
    private String commend;

    /**
     * 免审标识（'0'：非免审 '1'：免审)
     */
    private String unchecked;

    /**
     * DOWNCOR_ID
     */
    private Long downcorId;

    /**
     * PRICERANGE
     */
    private BigDecimal pricerange;

    /**
     * FIRSTCHECKED
     */
    private String firstchecked;

    /**
     * MINORDERNUM
     */
    private Integer minordernum;

    /**
     * PRICECHANGE
     */
    private String pricechange;

    /**
     * PRICEDIFFERENCE
     */
    private Double pricedifference;

    /**
     * YVIEW360
     */
    private String yview360;

    /**
     * PREVIEW360PATH
     */
    private String preview360path;

    /**
     * VIEW360PATH
     */
    private String view360path;

    /**
     * ISANYMSBUY
     */
    private Short isanymsbuy;

    /**
     * ISCORONLINEREFUSE
     */
    private String iscoronlinerefuse;

    /**
     * TIMELIMIT
     */
    private Short timelimit;

    /**
     * ISSENDMAIL
     */
    private String issendmail;

    /**
     * ISCONTACTED
     */
    private String iscontacted;

    /**
     * ACTID
     */
    private Long actid;

    /**
     * ACTMODIFYDATE
     */
    private Date actmodifydate;

    /**
     * SHOWSTATE
     */
    private Short showstate;

    /**
     * PUBTYPE
     */
    private Short pubtype;

    /**
     * 信息初始入库时间
     */
    private Date createdate;

    /**
     * 商机目录id
     */
    private BigDecimal seriesid;

    /**
     * 产品材质
     */
    private String material;

    /**
     * 产品资质
     */
    private String qualific;

    /**
     * 商机类型
     */
    private String source;

    /**
     * 是否支持在线交易
     */
    private String isSupportTrade;

    /**
     * STAR
     */
    private String star;

    /**
     *  1  现货/标准品(紧急求购) 或 供应信息 27 代理加盟 或 诚招代理商 28 二手商品 或  二手信息 29 合作 或 提供合作 31 库存 或 库存甩货 34 求租 或 招租 33 招标（采购通） 19 商务服务（买卖通） 前面的为（采购通），或后面的为（买卖通） 
     */
    private String busintype;

    /**
     * PRICETYPE
     */
    private String pricetype;

    /**
     * WEIGHT_KG
     */
    private BigDecimal weightKg;

    /**
     * 商机打标标识，0-高质上线 1-为限期整改
     */
    private String businMark;

    /**
     * 是否存在适用车型 '0':否 '1':是
     */
    private String isforcar;

    /**
     * '1':会员自发 '2':搬家 '3':批量发布 '4':销售代发 '5':纷享销客 '6':畅捷通
     */
    private String businSource;

    /**
     * 是否下架
     */
    private String isundershelf;

    /**
     * 服务类信息标识, 1-服务信息
     */
    private String serviceflag;

    public BusinChance() {
    }

    /**
     *
     * @param onBusinChance
     */
    public BusinChance(OnBusinChance onBusinChance) {
        this.bcId = onBusinChance.getBcId();
        this.individflag = onBusinChance.getIndividflag();
        this.sorttag = onBusinChance.getSorttag();
        this.title = onBusinChance.getTitle();
        this.type = onBusinChance.getType();
        this.brandid = onBusinChance.getBrandid();
        this.keyword = onBusinChance.getKeyword();
        this.keyword2 = onBusinChance.getKeyword2();
        this.keyword3 = onBusinChance.getKeyword3();
        this.lpackage = onBusinChance.getLpackage();
        this.deliver = onBusinChance.getDeliver();
        this.transport = onBusinChance.getTransport();
        this.unit = onBusinChance.getUnit();
        this.validdate = onBusinChance.getValiddate();
        this.pubdate = onBusinChance.getPubdate();
        this.providerid = onBusinChance.getProviderid();
        this.username = onBusinChance.getUsername();
        this.checked = onBusinChance.getChecked();
        this.checkdate = onBusinChance.getCheckdate();
        this.checkman = onBusinChance.getCheckman();
        this.enddate = onBusinChance.getEnddate();
        this.num = onBusinChance.getNum();
        this.operstate = onBusinChance.getOperstate();
        this.states = onBusinChance.getStates();
        this.orignpciId = onBusinChance.getOrignpciId();
        this.orign = onBusinChance.getOrign();
        this.yrepeated = onBusinChance.getYrepeated();
        this.searchstate = onBusinChance.getSearchstate();
        this.deldate = onBusinChance.getDeldate();
        this.updatetime = onBusinChance.getUpdatetime();
        this.whoupdate = onBusinChance.getWhoupdate();
        this.whoinput = onBusinChance.getWhoinput();
        this.whodel = onBusinChance.getWhodel();
        this.picpath = onBusinChance.getPicpath();
        this.ypic = onBusinChance.getYpic();
        this.repeattimes = onBusinChance.getRepeattimes();
        this.supcatid = onBusinChance.getSupcatid();
        this.l3supcatid = onBusinChance.getL3supcatid();
        this.commend = onBusinChance.getCommend();
        this.unchecked = onBusinChance.getUnchecked();
        this.downcorId = onBusinChance.getDowncorId();
        this.pricerange = onBusinChance.getPricerange();
        this.firstchecked = onBusinChance.getFirstchecked();
        this.minordernum = onBusinChance.getMinordernum();
        this.pricechange = onBusinChance.getPricechange();
        this.pricedifference = onBusinChance.getPricedifference();
        this.yview360 = onBusinChance.getYview360();
        this.preview360path = onBusinChance.getPreview360path();
        this.view360path = onBusinChance.getView360path();
        this.isanymsbuy = onBusinChance.getIsanymsbuy();
        this.iscoronlinerefuse = onBusinChance.getIscoronlinerefuse();
        this.timelimit = onBusinChance.getTimelimit();
        this.issendmail = onBusinChance.getIssendmail();
        this.iscontacted = onBusinChance.getIscontacted();
        this.actid = onBusinChance.getActid();
        this.actmodifydate = onBusinChance.getActmodifydate();
        this.showstate = onBusinChance.getShowstate();
        this.pubtype = onBusinChance.getPubtype();
        this.createdate = onBusinChance.getCreatedate();
        this.seriesid = onBusinChance.getSeriesid();
        this.material = onBusinChance.getMaterial();
        this.qualific = onBusinChance.getQualific();
        this.source = onBusinChance.getSource();
        this.isSupportTrade = onBusinChance.getIsSupportTrade();
        this.star = onBusinChance.getStar();
        this.busintype = onBusinChance.getBusintype();
        this.pricetype = onBusinChance.getPricetype();
        this.weightKg = onBusinChance.getWeightKg();
        this.businMark = onBusinChance.getBusinMark();
        this.isforcar = onBusinChance.getIsforcar();
        this.businSource = onBusinChance.getBusinSource();
        this.isundershelf = onBusinChance.getIsundershelf();
        this.serviceflag = onBusinChance.getServiceflag();
    }

    /**
	 * @return the bcId
	 */
	public BigDecimal getBcId() {
		return bcId;
	}

	/**
	 * @param bcId the bcId to set
	 */
	public void setBcId(BigDecimal bcId) {
		this.bcId = bcId;
	}

	/**
	 * @return the individflag
	 */
	public String getIndividflag() {
		return individflag;
	}

	/**
	 * @param individflag the individflag to set
	 */
	public void setIndividflag(String individflag) {
		this.individflag = individflag;
	}

	/**
	 * @return the sorttag
	 */
	public String getSorttag() {
		return sorttag;
	}

	/**
	 * @param sorttag the sorttag to set
	 */
	public void setSorttag(String sorttag) {
		this.sorttag = sorttag;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the brandid
	 */
	public BigDecimal getBrandid() {
		return brandid;
	}

	/**
	 * @param brandid the brandid to set
	 */
	public void setBrandid(BigDecimal brandid) {
		this.brandid = brandid;
	}

	/**
	 * @return the keyword
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * @param keyword the keyword to set
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	/**
	 * @return the keyword2
	 */
	public String getKeyword2() {
		return keyword2;
	}

	/**
	 * @param keyword2 the keyword2 to set
	 */
	public void setKeyword2(String keyword2) {
		this.keyword2 = keyword2;
	}

	/**
	 * @return the keyword3
	 */
	public String getKeyword3() {
		return keyword3;
	}

	/**
	 * @param keyword3 the keyword3 to set
	 */
	public void setKeyword3(String keyword3) {
		this.keyword3 = keyword3;
	}

	/**
	 * @return the lpackage
	 */
	public String getLpackage() {
		return lpackage;
	}

	/**
	 * @param lpackage the lpackage to set
	 */
	public void setLpackage(String lpackage) {
		this.lpackage = lpackage;
	}

	/**
	 * @return the deliver
	 */
	public String getDeliver() {
		return deliver;
	}

	/**
	 * @param deliver the deliver to set
	 */
	public void setDeliver(String deliver) {
		this.deliver = deliver;
	}

	/**
	 * @return the transport
	 */
	public String getTransport() {
		return transport;
	}

	/**
	 * @param transport the transport to set
	 */
	public void setTransport(String transport) {
		this.transport = transport;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * @return the validdate
	 */
	public Long getValiddate() {
		return validdate;
	}

	/**
	 * @param validdate the validdate to set
	 */
	public void setValiddate(Long validdate) {
		this.validdate = validdate;
	}

	/**
	 * @return the pubdate
	 */
	public Date getPubdate() {
		return pubdate;
	}

	/**
	 * @param pubdate the pubdate to set
	 */
	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}

	/**
	 * @return the providerid
	 */
	public Long getProviderid() {
		return providerid;
	}

	/**
	 * @param providerid the providerid to set
	 */
	public void setProviderid(Long providerid) {
		this.providerid = providerid;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the checked
	 */
	public String getChecked() {
		return checked;
	}

	/**
	 * @param checked the checked to set
	 */
	public void setChecked(String checked) {
		this.checked = checked;
	}

	/**
	 * @return the checkdate
	 */
	public Date getCheckdate() {
		return checkdate;
	}

	/**
	 * @param checkdate the checkdate to set
	 */
	public void setCheckdate(Date checkdate) {
		this.checkdate = checkdate;
	}

	/**
	 * @return the checkman
	 */
	public String getCheckman() {
		return checkman;
	}

	/**
	 * @param checkman the checkman to set
	 */
	public void setCheckman(String checkman) {
		this.checkman = checkman;
	}

	/**
	 * @return the enddate
	 */
	public Date getEnddate() {
		return enddate;
	}

	/**
	 * @param enddate the enddate to set
	 */
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	/**
	 * @return the num
	 */
	public String getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(String num) {
		this.num = num;
	}

	/**
	 * @return the operstate
	 */
	public String getOperstate() {
		return operstate;
	}

	/**
	 * @param operstate the operstate to set
	 */
	public void setOperstate(String operstate) {
		this.operstate = operstate;
	}

	/**
	 * @return the states
	 */
	public String getStates() {
		return states;
	}

	/**
	 * @param states the states to set
	 */
	public void setStates(String states) {
		this.states = states;
	}

	/**
	 * @return the orignpciId
	 */
	public BigDecimal getOrignpciId() {
		return orignpciId;
	}

	/**
	 * @param orignpciId the orignpciId to set
	 */
	public void setOrignpciId(BigDecimal orignpciId) {
		this.orignpciId = orignpciId;
	}

	/**
	 * @return the orign
	 */
	public String getOrign() {
		return orign;
	}

	/**
	 * @param orign the orign to set
	 */
	public void setOrign(String orign) {
		this.orign = orign;
	}

	/**
	 * @return the yrepeated
	 */
	public String getYrepeated() {
		return yrepeated;
	}

	/**
	 * @param yrepeated the yrepeated to set
	 */
	public void setYrepeated(String yrepeated) {
		this.yrepeated = yrepeated;
	}

	/**
	 * @return the searchstate
	 */
	public String getSearchstate() {
		return searchstate;
	}

	/**
	 * @param searchstate the searchstate to set
	 */
	public void setSearchstate(String searchstate) {
		this.searchstate = searchstate;
	}

	/**
	 * @return the deldate
	 */
	public Date getDeldate() {
		return deldate;
	}

	/**
	 * @param deldate the deldate to set
	 */
	public void setDeldate(Date deldate) {
		this.deldate = deldate;
	}

	/**
	 * @return the updatetime
	 */
	public Date getUpdatetime() {
		return updatetime;
	}

	/**
	 * @param updatetime the updatetime to set
	 */
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	/**
	 * @return the whoupdate
	 */
	public String getWhoupdate() {
		return whoupdate;
	}

	/**
	 * @param whoupdate the whoupdate to set
	 */
	public void setWhoupdate(String whoupdate) {
		this.whoupdate = whoupdate;
	}

	/**
	 * @return the whoinput
	 */
	public String getWhoinput() {
		return whoinput;
	}

	/**
	 * @param whoinput the whoinput to set
	 */
	public void setWhoinput(String whoinput) {
		this.whoinput = whoinput;
	}

	/**
	 * @return the whodel
	 */
	public String getWhodel() {
		return whodel;
	}

	/**
	 * @param whodel the whodel to set
	 */
	public void setWhodel(String whodel) {
		this.whodel = whodel;
	}

	/**
	 * @return the picpath
	 */
	public String getPicpath() {
		return picpath;
	}

	/**
	 * @param picpath the picpath to set
	 */
	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}

	/**
	 * @return the ypic
	 */
	public String getYpic() {
		return ypic;
	}

	/**
	 * @param ypic the ypic to set
	 */
	public void setYpic(String ypic) {
		this.ypic = ypic;
	}

	/**
	 * @return the repeattimes
	 */
	public Long getRepeattimes() {
		return repeattimes;
	}

	/**
	 * @param repeattimes the repeattimes to set
	 */
	public void setRepeattimes(Long repeattimes) {
		this.repeattimes = repeattimes;
	}

	/**
	 * @return the supcatid
	 */
	public String getSupcatid() {
		return supcatid;
	}

	/**
	 * @param supcatid the supcatid to set
	 */
	public void setSupcatid(String supcatid) {
		this.supcatid = supcatid;
	}

	/**
	 * @return the l3supcatid
	 */
	public String getL3supcatid() {
		return l3supcatid;
	}

	/**
	 * @param l3supcatid the l3supcatid to set
	 */
	public void setL3supcatid(String l3supcatid) {
		this.l3supcatid = l3supcatid;
	}

	/**
	 * @return the commend
	 */
	public String getCommend() {
		return commend;
	}

	/**
	 * @param commend the commend to set
	 */
	public void setCommend(String commend) {
		this.commend = commend;
	}

	/**
	 * @return the unchecked
	 */
	public String getUnchecked() {
		return unchecked;
	}

	/**
	 * @param unchecked the unchecked to set
	 */
	public void setUnchecked(String unchecked) {
		this.unchecked = unchecked;
	}

	/**
	 * @return the downcorId
	 */
	public Long getDowncorId() {
		return downcorId;
	}

	/**
	 * @param downcorId the downcorId to set
	 */
	public void setDowncorId(Long downcorId) {
		this.downcorId = downcorId;
	}

	/**
	 * @return the pricerange
	 */
	public BigDecimal getPricerange() {
		return pricerange;
	}

	/**
	 * @param pricerange the pricerange to set
	 */
	public void setPricerange(BigDecimal pricerange) {
		this.pricerange = pricerange;
	}

	/**
	 * @return the firstchecked
	 */
	public String getFirstchecked() {
		return firstchecked;
	}

	/**
	 * @param firstchecked the firstchecked to set
	 */
	public void setFirstchecked(String firstchecked) {
		this.firstchecked = firstchecked;
	}

	/**
	 * @return the minordernum
	 */
	public Integer getMinordernum() {
		return minordernum;
	}

	/**
	 * @param minordernum the minordernum to set
	 */
	public void setMinordernum(Integer minordernum) {
		this.minordernum = minordernum;
	}

	/**
	 * @return the pricechange
	 */
	public String getPricechange() {
		return pricechange;
	}

	/**
	 * @param pricechange the pricechange to set
	 */
	public void setPricechange(String pricechange) {
		this.pricechange = pricechange;
	}

	/**
	 * @return the pricedifference
	 */
	public Double getPricedifference() {
		return pricedifference;
	}

	/**
	 * @param pricedifference the pricedifference to set
	 */
	public void setPricedifference(Double pricedifference) {
		this.pricedifference = pricedifference;
	}

	/**
	 * @return the yview360
	 */
	public String getYview360() {
		return yview360;
	}

	/**
	 * @param yview360 the yview360 to set
	 */
	public void setYview360(String yview360) {
		this.yview360 = yview360;
	}

	/**
	 * @return the preview360path
	 */
	public String getPreview360path() {
		return preview360path;
	}

	/**
	 * @param preview360path the preview360path to set
	 */
	public void setPreview360path(String preview360path) {
		this.preview360path = preview360path;
	}

	/**
	 * @return the view360path
	 */
	public String getView360path() {
		return view360path;
	}

	/**
	 * @param view360path the view360path to set
	 */
	public void setView360path(String view360path) {
		this.view360path = view360path;
	}

	/**
	 * @return the isanymsbuy
	 */
	public Short getIsanymsbuy() {
		return isanymsbuy;
	}

	/**
	 * @param isanymsbuy the isanymsbuy to set
	 */
	public void setIsanymsbuy(Short isanymsbuy) {
		this.isanymsbuy = isanymsbuy;
	}

	/**
	 * @return the iscoronlinerefuse
	 */
	public String getIscoronlinerefuse() {
		return iscoronlinerefuse;
	}

	/**
	 * @param iscoronlinerefuse the iscoronlinerefuse to set
	 */
	public void setIscoronlinerefuse(String iscoronlinerefuse) {
		this.iscoronlinerefuse = iscoronlinerefuse;
	}

	/**
	 * @return the timelimit
	 */
	public Short getTimelimit() {
		return timelimit;
	}

	/**
	 * @param timelimit the timelimit to set
	 */
	public void setTimelimit(Short timelimit) {
		this.timelimit = timelimit;
	}

	/**
	 * @return the issendmail
	 */
	public String getIssendmail() {
		return issendmail;
	}

	/**
	 * @param issendmail the issendmail to set
	 */
	public void setIssendmail(String issendmail) {
		this.issendmail = issendmail;
	}

	/**
	 * @return the iscontacted
	 */
	public String getIscontacted() {
		return iscontacted;
	}

	/**
	 * @param iscontacted the iscontacted to set
	 */
	public void setIscontacted(String iscontacted) {
		this.iscontacted = iscontacted;
	}

	/**
	 * @return the actid
	 */
	public Long getActid() {
		return actid;
	}

	/**
	 * @param actid the actid to set
	 */
	public void setActid(Long actid) {
		this.actid = actid;
	}

	/**
	 * @return the actmodifydate
	 */
	public Date getActmodifydate() {
		return actmodifydate;
	}

	/**
	 * @param actmodifydate the actmodifydate to set
	 */
	public void setActmodifydate(Date actmodifydate) {
		this.actmodifydate = actmodifydate;
	}

	/**
	 * @return the showstate
	 */
	public Short getShowstate() {
		return showstate;
	}

	/**
	 * @param showstate the showstate to set
	 */
	public void setShowstate(Short showstate) {
		this.showstate = showstate;
	}

	/**
	 * @return the pubtype
	 */
	public Short getPubtype() {
		return pubtype;
	}

	/**
	 * @param pubtype the pubtype to set
	 */
	public void setPubtype(Short pubtype) {
		this.pubtype = pubtype;
	}

	/**
	 * @return the createdate
	 */
	public Date getCreatedate() {
		return createdate;
	}

	/**
	 * @param createdate the createdate to set
	 */
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	/**
	 * @return the seriesid
	 */
	public BigDecimal getSeriesid() {
		return seriesid;
	}

	/**
	 * @param seriesid the seriesid to set
	 */
	public void setSeriesid(BigDecimal seriesid) {
		this.seriesid = seriesid;
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * @return the qualific
	 */
	public String getQualific() {
		return qualific;
	}

	/**
	 * @param qualific the qualific to set
	 */
	public void setQualific(String qualific) {
		this.qualific = qualific;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the isSupportTrade
	 */
	public String getIsSupportTrade() {
		return isSupportTrade;
	}

	/**
	 * @param isSupportTrade the isSupportTrade to set
	 */
	public void setIsSupportTrade(String isSupportTrade) {
		this.isSupportTrade = isSupportTrade;
	}

	/**
	 * @return the star
	 */
	public String getStar() {
		return star;
	}

	/**
	 * @param star the star to set
	 */
	public void setStar(String star) {
		this.star = star;
	}

	/**
	 * @return the busintype
	 */
	public String getBusintype() {
		return busintype;
	}

	/**
	 * @param busintype the busintype to set
	 */
	public void setBusintype(String busintype) {
		this.busintype = busintype;
	}

	/**
	 * @return the pricetype
	 */
	public String getPricetype() {
		return pricetype;
	}

	/**
	 * @param pricetype the pricetype to set
	 */
	public void setPricetype(String pricetype) {
		this.pricetype = pricetype;
	}

	/**
	 * @return the weightKg
	 */
	public BigDecimal getWeightKg() {
		return weightKg;
	}

	/**
	 * @param weightKg the weightKg to set
	 */
	public void setWeightKg(BigDecimal weightKg) {
		this.weightKg = weightKg;
	}

	/**
	 * @return the businMark
	 */
	public String getBusinMark() {
		return businMark;
	}

	/**
	 * @param businMark the businMark to set
	 */
	public void setBusinMark(String businMark) {
		this.businMark = businMark;
	}

	/**
	 * @return the isforcar
	 */
	public String getIsforcar() {
		return isforcar;
	}

	/**
	 * @param isforcar the isforcar to set
	 */
	public void setIsforcar(String isforcar) {
		this.isforcar = isforcar;
	}

	/**
	 * @return the businSource
	 */
	public String getBusinSource() {
		return businSource;
	}

	/**
	 * @param businSource the businSource to set
	 */
	public void setBusinSource(String businSource) {
		this.businSource = businSource;
	}

	/**
	 * @return the isundershelf
	 */
	public String getIsundershelf() {
		return isundershelf;
	}

	/**
	 * @param isundershelf the isundershelf to set
	 */
	public void setIsundershelf(String isundershelf) {
		this.isundershelf = isundershelf;
	}

	/**
	 * @return the serviceflag
	 */
	public String getServiceflag() {
		return serviceflag;
	}

	/**
	 * @param serviceflag the serviceflag to set
	 */
	public void setServiceflag(String serviceflag) {
		this.serviceflag = serviceflag;
	}

    
}