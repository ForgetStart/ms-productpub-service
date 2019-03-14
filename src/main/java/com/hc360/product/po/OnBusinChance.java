package com.hc360.product.po;

import java.math.BigDecimal;
import java.util.Date;

public class OnBusinChance {
    /**
     * 商机ID
     */
    private BigDecimal bcId;

    /**
     * INDIVIDFLAG
     */
    private String individflag;

    /**
     * 求购供应标识  0-供应商机  1-求购信息
     */
    private String sorttag;

    /**
     * 信息标题
     */
    private String title;

    /**
     * 商品型号or类型
     */
    private String type;

    /**
     * BRANDID
     */
    private BigDecimal brandid;

    /**
     * 关键字
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
     * 商品单位 例如:台、套、箱等
     */
    private String unit;

    /**
     * VALIDDATE
     */
    private Long validdate;

    /**
     * 发布时间
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
     * 商机审核日期
     */
    private Date checkdate;

    /**
     * 商机审核人
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
     * 状态 '0'可用 '1'逻辑删除
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
     * 更新处理操作时间
     */
    private Date updatetime;

    /**
     * 更新处理操作类型
     */
    private String whoupdate;

    /**
     * 插入类型 会员新增、搬家工具等
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
     * 所属类目
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
     * 最小起订量
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
     * 0:客户发布 1:客户端发布 2:人工代发 3:批量导入 4:产品转商机 5：匿名求购 6：求购抓取 7:  8:买家库
     */
    private Short pubtype;

    /**
     * OLD_COMPLETE
     */
    private BigDecimal oldComplete;

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
     * 报价方式 * 方式：0区间，电话议价 1规格报价 2混批
     */
    private String pricetype;

    /**
     *  1  现货/标准品(紧急求购) 或 供应信息 27 代理加盟 或 诚招代理商 28 二手商品 或  二手信息 29 合作 或 提供合作 31 库存 或 库存甩货 34 求租 或 招租 33 招标（采购通） 19 商务服务（买卖通） 前面的为（采购通），或后面的为（买卖通）
     */
    private String busintype;

    /**
     * 计量单位/公斤
     */
    private BigDecimal weightKg;

    /**
     * PICMEMO
     */
    private String picmemo;

    /**
     * STORE
     */
    private String store;

    /**
     * 商机打标标识，0-高质上线 1-为限期整改
     */
    private String businMark;

    /**
     * 转移数据时间戳
     */
    private Date transferDate;

    /**
     * 是否存在适用车型 '0':否 '1':是
     */
    private String isforcar;

    /**
     * '1':会员自发 '2':搬家 '3':批量发布 '4':销售代发 '5':纷享销客 '6':畅捷通
     */
    private String businSource;

    /**
     * 是否下架 '0'-上架 '1'是已下架 历史数据是空默认为上架
     */
    private String isundershelf;

    /**
     * PFLAG
     */
    private String pflag;

    /**
     * SORTNUM
     */
    private String sortnum;

    /**
     * ORIGNPUBDATE
     */
    private Date orignpubdate;

    /**
     * CONTACTOR
     */
    private String contactor;

    /**
     * O_AREAID
     */
    private String oAreaid;

    /**
     * O_CLSID
     */
    private String oClsid;

    /**
     * COR_SORTVALUE
     */
    private BigDecimal corSortvalue;

    /**
     * 服务类信息标识, 1-服务信息
     */
    private String serviceflag;

    /**
   	 * 
   	 */
   	public OnBusinChance() {
   		super();
   	}
   	
   	/**
   	 * 
   	 */
   	public OnBusinChance(BusinChance obj) {
   		  this.bcId = obj.getBcId();
   		  this.individflag = obj.getIndividflag();
   		  this.sorttag = obj.getSorttag();
   		  this.title = obj.getTitle();
   		  this.type = obj.getType();
   		  this.brandid = obj.getBrandid();
   		  this.keyword = obj.getKeyword();
   		  this.keyword2 = obj.getKeyword2();
   		  this.keyword3 = obj.getKeyword3();
   		  this.lpackage = obj.getLpackage();
   		  this.deliver = obj.getDeliver();
   		  this.transport = obj.getTransport();
   		  this.unit = obj.getUnit();
   		  this.validdate = obj.getValiddate();
   		  this.pubdate = obj.getPubdate();
   		  this.providerid = obj.getProviderid();
   		  this.username = obj.getUsername();
   		  this.checked = obj.getChecked();
   		  this.checkdate = obj.getCheckdate();
   		  this.checkman = obj.getCheckman();
   		  this.enddate = obj.getEnddate();
   		  this.num = obj.getNum();
   		  this.operstate = obj.getOperstate();
   		  this.states = obj.getStates();
   		  this.orignpciId = obj.getOrignpciId();
   		  this.orign = obj.getOrign();
   		  this.yrepeated = obj.getYrepeated();
   		  this.searchstate = obj.getSearchstate();
   		  this.deldate = obj.getDeldate();
   		  this.updatetime = obj.getUpdatetime();
   		  this.whoupdate = obj.getWhoupdate();
   		  this.whoinput = obj.getWhoinput();
   		  this.whodel = obj.getWhodel();
   		  this.picpath = obj.getPicpath();
   		  this.ypic = obj.getYpic();
   		  this.repeattimes = obj.getRepeattimes();
   		  this.supcatid = obj.getSupcatid();
   		  this.l3supcatid = obj.getL3supcatid();
   		  this.commend = obj.getCommend();
   		  this.unchecked = obj.getUnchecked();
   		  this.downcorId = obj.getDowncorId();
   		  this.pricerange = obj.getPricerange();
   		  this.firstchecked = obj.getFirstchecked();
   		  this.minordernum = obj.getMinordernum();
   		  this.pricechange = obj.getPricechange();
   		  this.pricedifference = obj.getPricedifference();
   		  this.yview360 = obj.getYview360();
   		  this.preview360path = obj.getPreview360path();
   		  this.view360path = obj.getView360path();
   		  this.isanymsbuy = obj.getIsanymsbuy();
   		  this.iscoronlinerefuse = obj.getIscoronlinerefuse();
   		  this.timelimit = obj.getTimelimit();
   		  this.issendmail = obj.getIssendmail();
   		  this.iscontacted = obj.getIscontacted();
   		  this.actid = obj.getActid();
   		  this.actmodifydate = obj.getActmodifydate();
   		  this.showstate = obj.getShowstate();
   		  this.pubtype = obj.getPubtype();
   		  this.seriesid = obj.getSeriesid();
   		  this.createdate = obj.getCreatedate();
   		  this.material = obj.getMaterial();
   		  this.qualific = obj.getQualific();
   		  this.source = obj.getSource();
   		  this.isSupportTrade = obj.getIsSupportTrade();
   		  this.pricetype = obj.getPricetype();
   		  this.busintype = obj.getBusintype();
   		  this.weightKg = obj.getWeightKg();
   		  this.businSource = obj.getBusinSource();
   		  this.isforcar = obj.getIsforcar();
   		  this.isundershelf = obj.getIsundershelf();
   		  this.serviceflag = obj.getServiceflag();
   	}
    
    public BigDecimal getBcId() {
        return bcId;
    }

    public void setBcId(BigDecimal bcId) {
        this.bcId = bcId;
    }

    public String getIndividflag() {
        return individflag;
    }

    public void setIndividflag(String individflag) {
        this.individflag = individflag == null ? null : individflag.trim();
    }

    public String getSorttag() {
        return sorttag;
    }

    public void setSorttag(String sorttag) {
        this.sorttag = sorttag == null ? null : sorttag.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getBrandid() {
        return brandid;
    }

    public void setBrandid(BigDecimal brandid) {
        this.brandid = brandid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getKeyword2() {
        return keyword2;
    }

    public void setKeyword2(String keyword2) {
        this.keyword2 = keyword2 == null ? null : keyword2.trim();
    }

    public String getKeyword3() {
        return keyword3;
    }

    public void setKeyword3(String keyword3) {
        this.keyword3 = keyword3 == null ? null : keyword3.trim();
    }

    public String getLpackage() {
        return lpackage;
    }

    public void setLpackage(String lpackage) {
        this.lpackage = lpackage == null ? null : lpackage.trim();
    }

    public String getDeliver() {
        return deliver;
    }

    public void setDeliver(String deliver) {
        this.deliver = deliver == null ? null : deliver.trim();
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport == null ? null : transport.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Long getValiddate() {
        return validdate;
    }

    public void setValiddate(Long validdate) {
        this.validdate = validdate;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public Long getProviderid() {
        return providerid;
    }

    public void setProviderid(Long providerid) {
        this.providerid = providerid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked == null ? null : checked.trim();
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public String getCheckman() {
        return checkman;
    }

    public void setCheckman(String checkman) {
        this.checkman = checkman == null ? null : checkman.trim();
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getOperstate() {
        return operstate;
    }

    public void setOperstate(String operstate) {
        this.operstate = operstate == null ? null : operstate.trim();
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states == null ? null : states.trim();
    }

    public BigDecimal getOrignpciId() {
        return orignpciId;
    }

    public void setOrignpciId(BigDecimal orignpciId) {
        this.orignpciId = orignpciId;
    }

    public String getOrign() {
        return orign;
    }

    public void setOrign(String orign) {
        this.orign = orign == null ? null : orign.trim();
    }

    public String getYrepeated() {
        return yrepeated;
    }

    public void setYrepeated(String yrepeated) {
        this.yrepeated = yrepeated == null ? null : yrepeated.trim();
    }

    public String getSearchstate() {
        return searchstate;
    }

    public void setSearchstate(String searchstate) {
        this.searchstate = searchstate == null ? null : searchstate.trim();
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

    public String getWhoupdate() {
        return whoupdate;
    }

    public void setWhoupdate(String whoupdate) {
        this.whoupdate = whoupdate == null ? null : whoupdate.trim();
    }

    public String getWhoinput() {
        return whoinput;
    }

    public void setWhoinput(String whoinput) {
        this.whoinput = whoinput == null ? null : whoinput.trim();
    }

    public String getWhodel() {
        return whodel;
    }

    public void setWhodel(String whodel) {
        this.whodel = whodel == null ? null : whodel.trim();
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    public String getYpic() {
        return ypic;
    }

    public void setYpic(String ypic) {
        this.ypic = ypic == null ? null : ypic.trim();
    }

    public Long getRepeattimes() {
        return repeattimes;
    }

    public void setRepeattimes(Long repeattimes) {
        this.repeattimes = repeattimes;
    }

    public String getSupcatid() {
        return supcatid;
    }

    public void setSupcatid(String supcatid) {
        this.supcatid = supcatid == null ? null : supcatid.trim();
    }

    public String getL3supcatid() {
        return l3supcatid;
    }

    public void setL3supcatid(String l3supcatid) {
        this.l3supcatid = l3supcatid == null ? null : l3supcatid.trim();
    }

    public String getCommend() {
        return commend;
    }

    public void setCommend(String commend) {
        this.commend = commend == null ? null : commend.trim();
    }

    public String getUnchecked() {
        return unchecked;
    }

    public void setUnchecked(String unchecked) {
        this.unchecked = unchecked == null ? null : unchecked.trim();
    }

    public Long getDowncorId() {
        return downcorId;
    }

    public void setDowncorId(Long downcorId) {
        this.downcorId = downcorId;
    }

    public BigDecimal getPricerange() {
        return pricerange;
    }

    public void setPricerange(BigDecimal pricerange) {
        this.pricerange = pricerange;
    }

    public String getFirstchecked() {
        return firstchecked;
    }

    public void setFirstchecked(String firstchecked) {
        this.firstchecked = firstchecked == null ? null : firstchecked.trim();
    }

    public Integer getMinordernum() {
        return minordernum;
    }

    public void setMinordernum(Integer minordernum) {
        this.minordernum = minordernum;
    }

    public String getPricechange() {
        return pricechange;
    }

    public void setPricechange(String pricechange) {
        this.pricechange = pricechange == null ? null : pricechange.trim();
    }

    public Double getPricedifference() {
        return pricedifference;
    }

    public void setPricedifference(Double pricedifference) {
        this.pricedifference = pricedifference;
    }

    public String getYview360() {
        return yview360;
    }

    public void setYview360(String yview360) {
        this.yview360 = yview360 == null ? null : yview360.trim();
    }

    public String getPreview360path() {
        return preview360path;
    }

    public void setPreview360path(String preview360path) {
        this.preview360path = preview360path == null ? null : preview360path.trim();
    }

    public String getView360path() {
        return view360path;
    }

    public void setView360path(String view360path) {
        this.view360path = view360path == null ? null : view360path.trim();
    }

    public Short getIsanymsbuy() {
        return isanymsbuy;
    }

    public void setIsanymsbuy(Short isanymsbuy) {
        this.isanymsbuy = isanymsbuy;
    }

    public String getIscoronlinerefuse() {
        return iscoronlinerefuse;
    }

    public void setIscoronlinerefuse(String iscoronlinerefuse) {
        this.iscoronlinerefuse = iscoronlinerefuse == null ? null : iscoronlinerefuse.trim();
    }

    public Short getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Short timelimit) {
        this.timelimit = timelimit;
    }

    public String getIssendmail() {
        return issendmail;
    }

    public void setIssendmail(String issendmail) {
        this.issendmail = issendmail == null ? null : issendmail.trim();
    }

    public String getIscontacted() {
        return iscontacted;
    }

    public void setIscontacted(String iscontacted) {
        this.iscontacted = iscontacted == null ? null : iscontacted.trim();
    }

    public Long getActid() {
        return actid;
    }

    public void setActid(Long actid) {
        this.actid = actid;
    }

    public Date getActmodifydate() {
        return actmodifydate;
    }

    public void setActmodifydate(Date actmodifydate) {
        this.actmodifydate = actmodifydate;
    }

    public Short getShowstate() {
        return showstate;
    }

    public void setShowstate(Short showstate) {
        this.showstate = showstate;
    }

    public Short getPubtype() {
        return pubtype;
    }

    public void setPubtype(Short pubtype) {
        this.pubtype = pubtype;
    }

    public BigDecimal getOldComplete() {
        return oldComplete;
    }

    public void setOldComplete(BigDecimal oldComplete) {
        this.oldComplete = oldComplete;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public BigDecimal getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(BigDecimal seriesid) {
        this.seriesid = seriesid;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getQualific() {
        return qualific;
    }

    public void setQualific(String qualific) {
        this.qualific = qualific == null ? null : qualific.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getIsSupportTrade() {
        return isSupportTrade;
    }

    public void setIsSupportTrade(String isSupportTrade) {
        this.isSupportTrade = isSupportTrade == null ? null : isSupportTrade.trim();
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star == null ? null : star.trim();
    }

    public String getPricetype() {
        return pricetype;
    }

    public void setPricetype(String pricetype) {
        this.pricetype = pricetype == null ? null : pricetype.trim();
    }

    public String getBusintype() {
        return busintype;
    }

    public void setBusintype(String busintype) {
        this.busintype = busintype == null ? null : busintype.trim();
    }

    public BigDecimal getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(BigDecimal weightKg) {
        this.weightKg = weightKg;
    }

    public String getPicmemo() {
        return picmemo;
    }

    public void setPicmemo(String picmemo) {
        this.picmemo = picmemo == null ? null : picmemo.trim();
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store == null ? null : store.trim();
    }

    public String getBusinMark() {
        return businMark;
    }

    public void setBusinMark(String businMark) {
        this.businMark = businMark == null ? null : businMark.trim();
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public String getIsforcar() {
        return isforcar;
    }

    public void setIsforcar(String isforcar) {
        this.isforcar = isforcar == null ? null : isforcar.trim();
    }

    public String getBusinSource() {
        return businSource;
    }

    public void setBusinSource(String businSource) {
        this.businSource = businSource == null ? null : businSource.trim();
    }

    public String getIsundershelf() {
        return isundershelf;
    }

    public void setIsundershelf(String isundershelf) {
        this.isundershelf = isundershelf == null ? null : isundershelf.trim();
    }

    public String getPflag() {
        return pflag;
    }

    public void setPflag(String pflag) {
        this.pflag = pflag == null ? null : pflag.trim();
    }

    public String getSortnum() {
        return sortnum;
    }

    public void setSortnum(String sortnum) {
        this.sortnum = sortnum == null ? null : sortnum.trim();
    }

    public Date getOrignpubdate() {
        return orignpubdate;
    }

    public void setOrignpubdate(Date orignpubdate) {
        this.orignpubdate = orignpubdate;
    }

    public String getContactor() {
        return contactor;
    }

    public void setContactor(String contactor) {
        this.contactor = contactor == null ? null : contactor.trim();
    }

    public String getoAreaid() {
        return oAreaid;
    }

    public void setoAreaid(String oAreaid) {
        this.oAreaid = oAreaid == null ? null : oAreaid.trim();
    }

    public String getoClsid() {
        return oClsid;
    }

    public void setoClsid(String oClsid) {
        this.oClsid = oClsid == null ? null : oClsid.trim();
    }

    public BigDecimal getCorSortvalue() {
        return corSortvalue;
    }

    public void setCorSortvalue(BigDecimal corSortvalue) {
        this.corSortvalue = corSortvalue;
    }

    public String getServiceflag() {
        return serviceflag;
    }

    public void setServiceflag(String serviceflag) {
        this.serviceflag = serviceflag == null ? null : serviceflag.trim();
    }
}