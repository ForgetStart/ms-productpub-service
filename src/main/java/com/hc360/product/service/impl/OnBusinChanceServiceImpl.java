/**
 * @file_name OnBusinChanceServiceImpl.java
 * @project_name MS-ProductPub-Service
 * @user hc360
 * @date 2019年2月25日
 */
package com.hc360.product.service.impl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.*;

import com.hc360.b2b.exception.MmtException;
import com.hc360.b2b.util.DateUtils;
import com.hc360.imgup.UploadType;
import com.hc360.imgup.bo.upload.HandupParam;
import com.hc360.imgup.common.page.UploadPageInfo;
import com.hc360.product.bo.busin.*;
import com.hc360.product.dao.*;
import com.hc360.product.po.*;
import com.hc360.product.service.BusinMultimediaService;
import com.hc360.product.service.ProductPriceService;
import com.hc360.product.util.BusinConstants;
import com.hc360.product.util.PriceType;
import com.hc360.product.util.SwitchBusinLongConfig;
import com.hc360.product.vo.BusinLimitParam;
import com.hc360.rsf.kvdb.helper.KvdbServiceHelper;
import com.netflix.discovery.converters.Auto;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hc360.b2b.util.Convert;
import com.hc360.product.service.BusinAttValueService;
import com.hc360.product.service.OnBusinChanceService;
import com.hc360.product.vo.BusinBaseInfoVO;
import com.hc360.product.vo.BusinLimitParam;
import com.hc360.product.vo.OnBusinChancePageListVO;
import com.hc360.product.vo.PageBean;

/**
 * @author xiangp
 * @version 1.0
 * @date 2019年2月25日 下午3:59:58
 */
@Service
public class OnBusinChanceServiceImpl implements OnBusinChanceService {

	private Logger log = LoggerFactory.getLogger("OnBusinChanceServiceImpl");

	@Autowired
	private BusinAttValueService businAttValueService;

	@Autowired
	private ProductPriceService productPriceService;

	@Autowired
	private BusinMultimediaService businMultimediaService;



	@Autowired
	private OnBusinChanceMapper onBusinChanceMapper;

	@Autowired
	private BusinChanceMapper businChanceMapper;

	@Autowired
	private BusinAddrConfigMapper businAddrConfigMapper;

	@Autowired
	private BusinFareConfigMapper businFareConfigMapper;

	@Auto
	private BusinLongInfoMapper businLongInfoMapper;

	/* (non-Javadoc)
	 * @see com.hc360.product.service.OnBusinChanceService#getOnBusinChancePageList(long, java.lang.String, int, int)
	 */
	@Override
	public OnBusinChancePageListVO getOnBusinChancePageList(long providerid, String titleKeyword, int page,
			int pageSize) {
		OnBusinChancePageListVO onBusinChancePageListVO = new OnBusinChancePageListVO();
		Page<Object> startPage = PageHelper.startPage(page, pageSize);
		List<OnBusinChance> onBusinChancePageList = onBusinChanceMapper.getOnBusinChancePageList(providerid, titleKeyword);
		PageBean pageBean = new PageBean(page, pageSize, startPage.getPages(), startPage.getTotal());
		onBusinChancePageListVO.setPageBean(pageBean);
		onBusinChancePageListVO.setBusins(onBusinChancePageList);
		return onBusinChancePageListVO;
	}

	/* (non-Javadoc)
	 * @see com.hc360.product.service.OnBusinChanceService#getEditBusin(long, long)
	 */
	@Override
	public BusinBaseInfoVO getEditBusin(long providerid, long bcid) {
		BusinBaseInfoVO businBaseInfoVO = null;
		OnBusinChance onBusinChance = getOnBusinChanceFromBakOrOn(providerid, bcid);
		if (null == onBusinChance) {
			return businBaseInfoVO;
		}
		businBaseInfoVO = new BusinBaseInfoVO();
		businBaseInfoVO.setBcid(bcid);
		businBaseInfoVO.setTitle(onBusinChance.getTitle());
		businBaseInfoVO.setSupcatid(onBusinChance.getSupcatid());
		String keyword = onBusinChance.getKeyword();
		if (StringUtils.isNotBlank(keyword)) {
			businBaseInfoVO.setKeywords(keyword.split(","));
		}
		businBaseInfoVO.setTimelimit(onBusinChance.getTimelimit());
		businBaseInfoVO.setWeightKg(null != onBusinChance.getWeightKg() ? onBusinChance.getWeightKg().toString() : "");
		
		// 获取运费模板设置
		List<BusinFareConfig> businFareConfigList = businFareConfigMapper.selectByBcid(bcid);
		if (null != businFareConfigList && !businFareConfigList.isEmpty()) {
			BusinFareConfig businFareConfig = businFareConfigList.get(0);
			businBaseInfoVO.setFreighttemplateid(businFareConfig.getBusinFareConfigId());
			businBaseInfoVO.setFreightType(businFareConfig.getType());
		}
		// 获取发货地址
		List<BusinAddrConfig> businAddrConfigList = businAddrConfigMapper.selectByBcid(bcid);
		if (null != businAddrConfigList && !businAddrConfigList.isEmpty()) {
			businBaseInfoVO.setSendAddrId(businAddrConfigList.get(0).getBusinAddrConfigId());
		}
		
		// 获取参数
		businBaseInfoVO.setAttValueList(businAttValueService.selectByBcid(bcid));


		return businBaseInfoVO;
	}

	/* (non-Javadoc)
	 * @see com.hc360.product.service.OnBusinChanceService#getOnBusinChanceFromBakOrOn(long, long)
	 */
	@Override
	public OnBusinChance getOnBusinChanceFromBakOrOn(long providerid, long bcid) {
		OnBusinChance onBusinChance = null;
		BusinChance businChance = businChanceMapper.selectByProviderIdAndBcid(providerid, bcid);
		if (null != businChance) {
			onBusinChance = new OnBusinChance(businChance);
		} else {
			onBusinChance = onBusinChanceMapper.selectByProviderIdAndBcid(providerid, bcid);
		}
		return onBusinChance;
	}

	/* (non-Javadoc)
	 * @see com.hc360.product.service.OnBusinChanceService#getOnBusinChanceFromBakOrOn(long, long)
	 */
	@Override
	public BusinChance getBusinChanceFromBakOrOn(long providerid, long bcid) {
		BusinChance businChance = businChanceMapper.selectByProviderIdAndBcid(providerid, bcid);
		if (null != businChance) {
			return businChance;
		} else {
			OnBusinChance onBusinChance = onBusinChanceMapper.selectByProviderIdAndBcid(providerid, bcid);
			if (null != onBusinChance) {
				businChance = new BusinChance(onBusinChance);
			}
		}
		return businChance;
	}

	/**
	 * 获得会员发布的供应信息数量
	 *
	 * @param providerid
	 *        企业ID
	 * @return　返回会员发布的供应信息数量（已上网的数量）
	 * @throws Exception
	 */
	@Override
	public int corPubInfoNum(long providerid) throws Exception {
		Map<String, Object> param = new HashMap<>();
		String today = com.hc360.b2b.util.StringUtils.formatDate( new Date() , "yyyy-MM-dd" );

		param.put("providerid", providerid);
		param.put("today", today);

		int count = onBusinChanceMapper.corPubInfoNum(param);
		return count;
	}


	/**
	 * 在线产品总数（在售+审核中+已过期）
	 * @param providerid
	 * @param today
	 * @return
	 * @throws Exception
	 */
	@Override
	public int getBusinCount(long providerid, String today) throws Exception {
		Map<String, Object> param = new HashMap<>();
		param.put("providerid", providerid);
		param.put("today", today);

		Set<String> idSets = new HashSet<String>();

		//在售商机总数
		List<OnBusinChance> onLineBusinChances = onBusinChanceMapper.findOnLineBusinCount(param);
		if(onLineBusinChances != null && onLineBusinChances.size() > 0){
			for(OnBusinChance o : onLineBusinChances){
				idSets.add(Convert.getString(o.getBcId()));
			}
		}

		//审核中
		List<BusinChance> auditBusinChances = businChanceMapper.findAuditBusinCount(param);
		if(auditBusinChances != null && auditBusinChances.size() > 0){
			for(BusinChance o : auditBusinChances){
				idSets.add(Convert.getString(o.getBcId()));
			}
		}


		//已过期
		List<OnBusinChance> pastBusinChances = onBusinChanceMapper.findPastBusinCount(param);
		if(pastBusinChances != null && pastBusinChances.size() > 0){
			for(OnBusinChance o : pastBusinChances){
				idSets.add(Convert.getString(o.getBcId()));
			}
		}

		return idSets.size();
	}

	/* (non-Javadoc)
	 * @see com.hc360.product.service.OnBusinChanceService#saveOrUpdateBusin(com.hc360.product.bo.busin.BusinInfoParamsObject)
	 */
	@Override
	public Long saveOrUpdateBusinChance(BusinInfoParamsObject businInfoParamsObject) throws Exception {
	
		// 保存商机信息
		BusinChance newBusinChance = getBusinChanceByBusinInfoParamsObject(businInfoParamsObject);
		Long bcid = null;
		if (null != newBusinChance) {
			bcid = null != newBusinChance.getBcId() ? newBusinChance.getBcId().longValue() : null;
			if (null != bcid) { // 修改
				BusinChance oldBusinChance = getBusinChanceFromBakOrOn(newBusinChance.getProviderid(), bcid);
				setOldBusinChance(oldBusinChance, newBusinChance);
				businChanceMapper.updateByPrimaryKeySelective(oldBusinChance);
			} else { // 新增
				businChanceMapper.insert(newBusinChance);
				bcid = newBusinChance.getBcId().longValue();
			}

			// 保存商机参数
			List<BusinAttValue> businAttValueList = getBusinAttValuesByBusinInfoParamsObject(newBusinChance.getBcId(), businInfoParamsObject);
			businAttValueService.saveOrUpdateBusinAttValueList(businAttValueList);

			// 保存商机价格
			String priceType = newBusinChance.getPricetype();
			List<ProductPriceItem> productPriceItemList = getProductPriceItemByBusinInfoParamsObject(newBusinChance.getBcId(),priceType, businInfoParamsObject);
			List<ProductSku> productSkuList = null;
			// 规格报价 或 混批报价时获取产品SKU
			if (PriceType.SPEC_QUOTE.type.equals(priceType)
					|| PriceType.BLEND_QUOTE.type.equals(priceType)) {
				productSkuList = getProductSkuByBusinInfoParamsObject(newBusinChance.getBcId(), businInfoParamsObject);
			}
			productPriceService.saveOrUpdateProductPrice(bcid, priceType,newBusinChance.getPricerange(), productPriceItemList, productSkuList);

			// 保存商机图片
			/*HandupParam imgBo=new HandupParam();
			imgBo.setId(bcid);
			imgBo.setProviderId(newBusinChance.getProviderid());
			// 免审
			if (BusinConstants.BUSIN_UNCHECK_PASS.equals(newBusinChance.getUnchecked())){
				imgBo.setFreecheck("1");
			}
			Long sessionId = Long.parseLong(businInfoParamsObject.getBaseInfo().getSeriesid());
			imgBo.setSessionId(sessionId);
			Timestamp stime  = DateUtils.getSysTimestamp();
			int ret = UploadPageInfo.getUploadInfo(UploadType.BUSINCHINCE_IMG_UPLOAD, imgBo);
			log.info("图片上传：商机ID：" + bcid + ",sessionId:" + sessionId + ",结果：" + ret);
			Timestamp etime  = DateUtils.getSysTimestamp();
			//MainHelper.logUploadTime(log, stime, etime, "商机图片上传时间");

			if (BusinConstants.BUSIN_UNCHECK_PASS.equals(newBusinChance.getUnchecked())) {
				businMultimediaService.uncheckPic(newBusinChance.getBcId());
			}*/
			// 保存商机详情
			BusinBaseInfo businBaseInfo = businInfoParamsObject.getBaseInfo();
			if (null != businBaseInfo) {
				String introduce = businBaseInfo.getIntroduce();
				if (StringUtils.isNotBlank(introduce)) {
					KvdbServiceHelper.putBakAndOn(KvdbServiceHelper.SysName.my, bcid + "", introduce);
				}

				// 保存搜索需要的无html标签商机详情
				try {
					//关闭开关时 存储prod
					String isy = SwitchBusinLongConfig.getSwitch();
					if(isy != null && "0".equals( isy )){
						Long bcId = Long.valueOf(bcid);
						String longinfo = com.hc360.b2b.util.StringUtils.delTag(businBaseInfo.getIntroduce());
						if (longinfo != null && longinfo.length() > BusinConstants.BUSINLONGINFO_SEARCHINTRODUCE_MAXLEN) {
							longinfo = longinfo.substring(0, BusinConstants.BUSINLONGINFO_SEARCHINTRODUCE_MAXLEN);
						}
						BusinLongInfo businLongInfo = businLongInfoMapper.getBusinLongInfoByBcid(bcid);
						if (businLongInfo == null) {
							businLongInfo = new BusinLongInfo();
							businLongInfo.setBcId(new BigDecimal(bcid));
							businLongInfo.setType("0");
							businLongInfo.setSearchintroduce(longinfo);
							businLongInfoMapper.insert(businLongInfo);
						} else {
							businLongInfo.setSearchintroduce(longinfo);
							businLongInfoMapper.updateByPrimaryKeySelective(businLongInfo);
						}
					}
				} catch (Exception e) {
					log.error("修改商机businlonginfo出错：bcid is " + bcid + ", 错误信息："+ e.getMessage());
				}
			}

			// 保存商机物流信息

		}

		// 保存
		
		return bcid;
	}

	private void setOldBusinChance(BusinChance oldBusinChance, BusinChance newBusinChance) {
		if (null == oldBusinChance || null == newBusinChance) {
			return;
		}
		if (null != newBusinChance.getIndividflag()) {
			oldBusinChance.setIndividflag(newBusinChance.getIndividflag());
		}
		if (null != newBusinChance.getSorttag()) {
			oldBusinChance.setSorttag(newBusinChance.getSorttag());
		}
		if (null != newBusinChance.getTitle()) {
			oldBusinChance.setTitle(newBusinChance.getTitle());
		}
		if (null != newBusinChance.getType()) {
			oldBusinChance.setType(newBusinChance.getType());
		}
		if (null != newBusinChance.getBrandid()) {
			oldBusinChance.setBrandid(newBusinChance.getBrandid());
		}
		if (null != newBusinChance.getKeyword()) {
			oldBusinChance.setKeyword(newBusinChance.getKeyword());
		}
		if (null != newBusinChance.getKeyword2()) {
			oldBusinChance.setKeyword2(newBusinChance.getKeyword2());
		}
		if (null != newBusinChance.getKeyword3()) {
			oldBusinChance.setKeyword3(newBusinChance.getKeyword3());
		}
		if (null != newBusinChance.getLpackage()) {
			oldBusinChance.setLpackage(newBusinChance.getLpackage());
		}
		if (null != newBusinChance.getDeliver()) {
			oldBusinChance.setDeliver(newBusinChance.getDeliver());
		}
		if (null != newBusinChance.getTransport()) {
			oldBusinChance.setTransport(newBusinChance.getTransport());
		}
		if (null != newBusinChance.getUnit()) {
			oldBusinChance.setUnit(newBusinChance.getUnit());
		}
		if (null != newBusinChance.getValiddate()) {
			oldBusinChance.setValiddate(newBusinChance.getValiddate());
		}
		if (null != newBusinChance.getPubdate()) {
			oldBusinChance.setPubdate(newBusinChance.getPubdate());
		}
		if (null != newBusinChance.getProviderid()) {
			oldBusinChance.setProviderid(newBusinChance.getProviderid());
		}
		if (null != newBusinChance.getUsername()) {
			oldBusinChance.setUsername(newBusinChance.getUsername());
		}
		if (null != newBusinChance.getChecked()) {
			oldBusinChance.setChecked(newBusinChance.getChecked());
		}
		if (null != newBusinChance.getCheckdate()) {
			oldBusinChance.setCheckdate(newBusinChance.getCheckdate());
		}
		if (null != newBusinChance.getCheckman()) {
			oldBusinChance.setCheckman(newBusinChance.getCheckman());
		}
		if (null != newBusinChance.getEnddate()) {
			oldBusinChance.setEnddate(newBusinChance.getEnddate());
		}
		if (null != newBusinChance.getNum()) {
			oldBusinChance.setNum(newBusinChance.getNum());
		}
		if (null != newBusinChance.getOperstate()) {
			oldBusinChance.setOperstate(newBusinChance.getOperstate());
		}
		if (null != newBusinChance.getStates()) {
			oldBusinChance.setStates(newBusinChance.getStates());
		}
		if (null != newBusinChance.getOrignpciId()) {
			oldBusinChance.setOrignpciId(newBusinChance.getOrignpciId());
		}
		if (null != newBusinChance.getOrign()) {
			oldBusinChance.setOrign(newBusinChance.getOrign());
		}
		if (null != newBusinChance.getYrepeated()) {
			oldBusinChance.setYrepeated(newBusinChance.getYrepeated());
		}
		if (null != newBusinChance.getSearchstate()) {
			oldBusinChance.setSearchstate(newBusinChance.getSearchstate());
		}
		if (null != newBusinChance.getDeldate()) {
			oldBusinChance.setDeldate(newBusinChance.getDeldate());
		}
		if (null != newBusinChance.getUpdatetime()) {
			oldBusinChance.setUpdatetime(newBusinChance.getUpdatetime());
		}
		if (null != newBusinChance.getWhoupdate()) {
			oldBusinChance.setWhoupdate(newBusinChance.getWhoupdate());
		}
		if (null != newBusinChance.getWhoinput()) {
			oldBusinChance.setWhoinput(newBusinChance.getWhoinput());
		}
		if (null != newBusinChance.getWhodel()) {
			oldBusinChance.setWhodel(newBusinChance.getWhodel());
		}
		if (null != newBusinChance.getPicpath()) {
			oldBusinChance.setPicpath(newBusinChance.getPicpath());
		}
		if (null != newBusinChance.getYpic()) {
			oldBusinChance.setYpic(newBusinChance.getYpic());
		}
		if (null != newBusinChance.getRepeattimes()) {
			oldBusinChance.setRepeattimes(newBusinChance.getRepeattimes());
		}
		if (null != newBusinChance.getSupcatid()) {
			oldBusinChance.setSupcatid(newBusinChance.getSupcatid());
		}
		if (null != newBusinChance.getL3supcatid()) {
			oldBusinChance.setL3supcatid(newBusinChance.getL3supcatid());
		}
		if (null != newBusinChance.getCommend()) {
			oldBusinChance.setCommend(newBusinChance.getCommend());
		}
		if (null != newBusinChance.getUnchecked()) {
			oldBusinChance.setUnchecked(newBusinChance.getUnchecked());
		}
		if (null != newBusinChance.getDowncorId()) {
			oldBusinChance.setDowncorId(newBusinChance.getDowncorId());
		}
		if (null != newBusinChance.getPricerange()) {
			oldBusinChance.setPricerange(newBusinChance.getPricerange());
		}
		if (null != newBusinChance.getFirstchecked()) {
			oldBusinChance.setFirstchecked(newBusinChance.getFirstchecked());
		}
		if (null != newBusinChance.getMinordernum()) {
			oldBusinChance.setMinordernum(newBusinChance.getMinordernum());
		}
		BigDecimal newPricerange = (null != newBusinChance.getPricerange() ? newBusinChance.getPricerange() : new BigDecimal(0));
		BigDecimal oldPricerange = (null != oldBusinChance.getPricerange() ? oldBusinChance.getPricerange() : new BigDecimal(0));
		if (newPricerange.compareTo(oldPricerange) != 0 ) {
			oldBusinChance.setPricechange("1");
		}
		if (null != newBusinChance.getPricedifference()) {
			oldBusinChance.setPricedifference(newBusinChance.getPricedifference());
		}
		if (null != newBusinChance.getYview360()) {
			oldBusinChance.setYview360(newBusinChance.getYview360());
		}
		if (null != newBusinChance.getPreview360path()) {
			oldBusinChance.setPreview360path(newBusinChance.getPreview360path());
		}
		if (null != newBusinChance.getView360path()) {
			oldBusinChance.setPreview360path(newBusinChance.getView360path());
		}
		if (null != newBusinChance.getIsanymsbuy()) {
			oldBusinChance.setIsanymsbuy(newBusinChance.getIsanymsbuy());
		}
		if (null != newBusinChance.getIscoronlinerefuse()) {
			oldBusinChance.setIscoronlinerefuse(newBusinChance.getIscoronlinerefuse());
		}
		if (null != newBusinChance.getTimelimit()) {
			oldBusinChance.setTimelimit(newBusinChance.getTimelimit());
		}
		if (null != newBusinChance.getIssendmail()) {
			oldBusinChance.setIssendmail(newBusinChance.getIssendmail());
		}
		if (null != newBusinChance.getIscontacted()) {
			oldBusinChance.setIscontacted(newBusinChance.getIscontacted());
		}
		if (null != newBusinChance.getActid()) {
			oldBusinChance.setActid(newBusinChance.getActid());
		}
		if (null != newBusinChance.getActmodifydate()) {
			oldBusinChance.setActmodifydate(newBusinChance.getActmodifydate());
		}
		if (null != newBusinChance.getShowstate()) {
			oldBusinChance.setShowstate(newBusinChance.getShowstate());
		}
		if (null != newBusinChance.getPubtype()) {
			oldBusinChance.setPubtype(newBusinChance.getPubtype());
		}
		if (null != newBusinChance.getCreatedate()) {
			oldBusinChance.setCreatedate(newBusinChance.getCreatedate());
		}
		if (null != newBusinChance.getSeriesid()) {
			oldBusinChance.setSeriesid(newBusinChance.getSeriesid());
		}
		if (null != newBusinChance.getMaterial()) {
			oldBusinChance.setMaterial(newBusinChance.getMaterial());
		}
		if (null != newBusinChance.getQualific()) {
			oldBusinChance.setQualific(newBusinChance.getQualific());
		}
		if (null != newBusinChance.getSource()) {
			oldBusinChance.setSource(newBusinChance.getSource());
		}
		if (null != newBusinChance.getIsSupportTrade()) {
			oldBusinChance.setIsSupportTrade(newBusinChance.getIsSupportTrade());
		}
		if (null != newBusinChance.getStar()) {
			oldBusinChance.setStar(newBusinChance.getStar());
		}
		if (null != newBusinChance.getBusintype()) {
			oldBusinChance.setBusintype(newBusinChance.getBusintype());
		}
		if (null != newBusinChance.getPricetype()) {
			oldBusinChance.setPricetype(newBusinChance.getPricetype());
		}
		if (null != newBusinChance.getWeightKg()) {
			oldBusinChance.setWeightKg(newBusinChance.getWeightKg());
		}
		if (null != newBusinChance.getBusinMark()) {
			oldBusinChance.setBusinMark(newBusinChance.getBusinMark());
		}
		if (null != newBusinChance.getIsforcar()) {
			oldBusinChance.setIsforcar(newBusinChance.getIsforcar());
		}
		if (null != newBusinChance.getBusinSource()) {
			oldBusinChance.setBusinSource(newBusinChance.getBusinSource());
		}
		if (null != newBusinChance.getIsundershelf()) {
			oldBusinChance.setIsundershelf(newBusinChance.getIsundershelf());
		}
		if (null != newBusinChance.getServiceflag()) {
			oldBusinChance.setServiceflag(newBusinChance.getServiceflag());
		}
	}


	/**
	 * 封装商机sku列表
	 * @param bcId
	 * @param businInfoParamsObject
	 * @return
	 */
	private List<ProductSku> getProductSkuByBusinInfoParamsObject(BigDecimal bcId, BusinInfoParamsObject businInfoParamsObject) {

		List<ProductSku> productSkuList = null;
		if (null == businInfoParamsObject) {
			return productSkuList;
		}
		BusinTradeInfo tradeInfo = businInfoParamsObject.getTradeInfo();
		if (null != tradeInfo) {
			List<SpecPrice> specPriceList = tradeInfo.getSpecPrice();
			if (null != specPriceList && !specPriceList.isEmpty()) {
				productSkuList = new ArrayList<ProductSku>();
				ProductSku productSku = null;
				for (SpecPrice specPrice : specPriceList) {
					productSku = new ProductSku();
					productSku.setId(null != specPrice.getId() ? new BigDecimal(specPrice.getId()) : null);
					productSku.setBcId(bcId);
					productSku.setCoding(specPrice.getCoding());
					productSku.setSkuValue(specPrice.getSkuValue());
					productSku.setNum(StringUtils.isNotBlank(specPrice.getNum()) ? new BigDecimal(specPrice.getNum()) : null);
					productSku.setStatus("0");
					productSku.setKeyIndex(specPrice.getKeyindex());
					productSkuList.add(productSku);
				}
			}
		}
		return productSkuList;
	}

	/**
	 * 封装商机价格列表
	 * @param bcId
	 * @param businInfoParamsObject
	 * @return
	 */
	private List<ProductPriceItem> getProductPriceItemByBusinInfoParamsObject(BigDecimal bcId, String priceType, BusinInfoParamsObject businInfoParamsObject) {
		List<ProductPriceItem> productPriceItemList = null;
		if (null == businInfoParamsObject || null == businInfoParamsObject.getTradeInfo()) {
			return productPriceItemList;
		}

		BusinTradeInfo tradeInfo = businInfoParamsObject.getTradeInfo();
		if (null != tradeInfo) {
			productPriceItemList = new ArrayList<ProductPriceItem>();
			ProductPriceItem productPriceItem = null;

			// 区间报价或混合报价时从IntervalPrice获取价格
			if (PriceType.INTERVAL_QUOTE.type.equals(priceType)
					|| PriceType.BLEND_QUOTE.type.equals(priceType)) {

				List<IntervalPrice> intervalPriceList = tradeInfo.getIntervalPrice();
				if (null != intervalPriceList && !intervalPriceList.isEmpty()) {
					for (IntervalPrice intervalPrice : intervalPriceList) {
						productPriceItem = new ProductPriceItem();
						productPriceItem.setId(null != intervalPrice.getId() ? new BigDecimal(intervalPrice.getId()) : null);
						productPriceItem.setBcId(bcId);
						productPriceItem.setType(intervalPrice.getPriceType());
						productPriceItem.setUnitPrice(StringUtils.isNotBlank(intervalPrice.getBuyPrice()) ? new BigDecimal(intervalPrice.getBuyPrice()) : null);
						productPriceItem.setImoq(StringUtils.isNotBlank(intervalPrice.getBuyNum()) ? new BigDecimal(intervalPrice.getBuyNum()) : null);
						productPriceItem.setStates("0");
						productPriceItemList.add(productPriceItem);
					}
				}

			} else if (PriceType.SPEC_QUOTE.type.equals(priceType)) { // 规格报价从specPrice获取价格
				List<SpecPrice> specPriceList = tradeInfo.getSpecPrice();
				if (null != specPriceList && !specPriceList.isEmpty()) {
					for (SpecPrice specPrice : specPriceList) {
						productPriceItem = new ProductPriceItem();
						productPriceItem.setId(null != specPrice.getPriceId() ? new BigDecimal(specPrice.getPriceId()) : null);
						productPriceItem.setBcId(bcId);
						productPriceItem.setType(priceType);
						productPriceItem.setUnitPrice(StringUtils.isNotBlank(specPrice.getUnitPrice()) ? new BigDecimal(specPrice.getUnitPrice()) : null);
						productPriceItem.setImoq(StringUtils.isNotBlank(specPrice.getNum()) ? new BigDecimal(specPrice.getNum()) : null);
						productPriceItem.setStates("0");
						productPriceItemList.add(productPriceItem);
					}
				}
			}
		}
		return productPriceItemList;
	}

	/**
	 * 封装商机参数列表
	 * @param businInfoParamsObject
	 * @return
	 */
	private List<BusinAttValue> getBusinAttValuesByBusinInfoParamsObject(BigDecimal bcid, BusinInfoParamsObject businInfoParamsObject) {
		List<BusinAttValue> businAttValueList = null;
		if (null == businInfoParamsObject && null == businInfoParamsObject.getBaseInfo()) {
			return businAttValueList;
		}
		BusinBaseInfo baseInfo = businInfoParamsObject.getBaseInfo();
		if (null != baseInfo) {
			List<BusinAttItem> items = baseInfo.getItems();
			if (null != baseInfo && !items.isEmpty()) {
				businAttValueList = new ArrayList<BusinAttValue>();
				BusinAttValue businAttValue = null;
				String supcatid = baseInfo.getSupcatid();
				String l3supercatId = null;
				if (StringUtils.isNotBlank(supcatid)) {
					l3supercatId = supcatid.substring(supcatid.length() - 3);
				}
				for (BusinAttItem businAttItem : items) {
					businAttValue = new BusinAttValue();
					businAttValue.setId(StringUtils.isNotBlank(businAttItem.getId()) ? new BigDecimal(businAttItem.getId()) : null);
					businAttValue.setBcId(bcid);
					businAttValue.setAttid(StringUtils.isNotBlank(businAttItem.getAttId()) ? new BigDecimal(businAttItem.getAttId()) : null);
					businAttValue.setAttname(businAttItem.getAttName());
					if (null != businAttItem.getAttValue() && businAttItem.getAttValue().length > 0) {
						businAttValue.setAttvalue(StringUtils.join(businAttItem.getAttValue(),","));
					}
					businAttValue.setYdirect(businAttItem.getYdirect());
					businAttValue.setYfill("0");
					businAttValue.setUnit(businAttItem.getUnitId());
					businAttValue.setStatus("0");
					businAttValue.setIsNormsParam(businAttItem.getIsNormsParam());
					businAttValue.setPicfile(businAttItem.getAttrImg());
					businAttValue.setL3supcatid(l3supercatId);
					businAttValueList.add(businAttValue);
				}
			}
		}
		return businAttValueList;
	}


	/**
	 * @author xiangp
	 * @date 2019年3月3日 下午8:06:59
	 * @param businInfoParamsObject
	 * @return
	 */
	private BusinChance getBusinChanceByBusinInfoParamsObject(BusinInfoParamsObject businInfoParamsObject) {
		BusinChance businChance = null;
		if (null == businInfoParamsObject) {
			return businChance;
		}
		businChance = new BusinChance();
		BusinBaseInfo baseInfo = businInfoParamsObject.getBaseInfo();
		Date curDate = new Date();
		if (null != baseInfo) {
			if (null != baseInfo.getBcid()) {
				businChance.setBcId(new BigDecimal(baseInfo.getBcid()));
			}
			businChance.setTitle(baseInfo.getTitle());
			businChance.setSorttag(baseInfo.getSorttag());
			businChance.setTitle(baseInfo.getTitle());
			businChance.setKeyword(baseInfo.getKeyword());
			businChance.setPubdate(curDate);
			businChance.setProviderid(baseInfo.getProviderid());
			businChance.setUsername(baseInfo.getUserName());
			businChance.setStates("0");
			businChance.setOperstate("0");
			businChance.setSearchstate("0");
			businChance.setUpdatetime(curDate);
			businChance.setWhoupdate(baseInfo.getUserName());
			businChance.setWhoinput(baseInfo.getUserName());
			businChance.setSupcatid(baseInfo.getSupcatid());
			businChance.setChecked(baseInfo.getChecked());
			businChance.setCheckman(baseInfo.getCheckman());
			businChance.setCheckdate(baseInfo.getCheckdate());
			businChance.setUnchecked(null);
			businChance.setSeriesid(StringUtils.isNotBlank(baseInfo.getSeriesid()) ? new BigDecimal(baseInfo.getSeriesid()) : null);
			// 发布类型： '1':会员自发 '2':搬家 '3':批量发布 '4':销售代发 '5':纷享销客 '6':畅捷通
			businChance.setBusinSource(baseInfo.getBusinSource());
			businChance.setSource("0");
			businChance.setStar(baseInfo.getStar());
			businChance.setWeightKg(StringUtils.isNotBlank(baseInfo.getWeightKg()) ? new BigDecimal(baseInfo.getWeightKg()) : null);
			businChance.setServiceflag(baseInfo.getServiceflag());

			//商机标题个性标志 0 新品 1 优惠 2 降价
			businChance.setIndividflag(baseInfo.getIndividflag());
			List<BusinAttItem> items = baseInfo.getItems();
			if (null != items && !items.isEmpty()) {
				String type = null;
				for (BusinAttItem businAttItem : items) {
					if ("型号".equals(businAttItem.getAttName())) {
						type = businAttItem.getAttName();
						break;
					}
				}
				//商品型号，对应页面上商机参数中的：型号
				businChance.setType(type);
			}
			businChance.setLpackage(baseInfo.getLpackage());
			businChance.setDeliver(baseInfo.getDeliver());
			businChance.setTransport(baseInfo.getTransport());
			Long validdate = StringUtils.isNotBlank(baseInfo.getValiddate()) ? Long.parseLong(baseInfo.getValiddate()) : 0;
			businChance.setValiddate(validdate);
			// 到期日期（计算规则 发布日期+有效添数=到期日期）前台页面传过来一个Validdate有效日期
			businChance.setEnddate(DateUtils.addDateTime(new Timestamp(curDate.getTime()), "D", validdate.intValue()));
		}

		// TODO 该数据存在企业库内
		businChance.setBrandid(null);

		businChance.setOrignpciId(null);
		businChance.setOrign(null);
		businChance.setYrepeated("0");
		businChance.setPricedifference(0D);

		businChance.setRepeattimes(null);
		businChance.setL3supcatid(null);
		businChance.setCommend(null);
		businChance.setDowncorId(null);
		businChance.setFirstchecked(null);
		businChance.setYview360(null);
		businChance.setPreview360path(null);
		businChance.setView360path(null);
		businChance.setIsanymsbuy(null);
		businChance.setIscoronlinerefuse(null);
		businChance.setIssendmail(null);
		businChance.setIscontacted(null);
		businChance.setActid(null);
		
		businChance.setActmodifydate(null);
		businChance.setShowstate((short) 0);
		businChance.setPubtype(null);
		businChance.setMaterial(null);
		businChance.setQualific(null);
		businChance.setBusintype(null);
		businChance.setBusinMark(null);

		businChance.setIsforcar(null);
		businChance.setIsundershelf(null);
		// 交易信息
		BusinTradeInfo tradeInfo = businInfoParamsObject.getTradeInfo();
		if (null != tradeInfo) {
			businChance.setUnit(tradeInfo.getUnit());
			businChance.setNum(tradeInfo.getNum());
			businChance.setIsSupportTrade(tradeInfo.getIsSupportTrade());
			businChance.setPricetype(tradeInfo.getPriceType());
			// 最小起订量
			businChance.setMinordernum(null != tradeInfo.getMinorderNum() ? Integer.parseInt(tradeInfo.getMinorderNum()) : 0);
			// 产品单价
			businChance.setPricerange(getPricerange(tradeInfo));
		}
		
		
		// 首图
		BusinImagesInfo imagesInfo = businInfoParamsObject.getImagesInfo();
		if (null != imagesInfo) {
			businChance.setPicpath("");
			businChance.setYpic("");
		}
		BusinLogisticsInfo logisticsInfo = businInfoParamsObject.getLogisticsInfo();
		if (null != logisticsInfo) {
			businChance.setTimelimit(null != logisticsInfo.getTimelimit() ? Short.parseShort(logisticsInfo.getTimelimit()) : null);
		}

		return businChance;
	}

	/**
	 * 获取产品单价，规格报价时获取第一条报价价格；区间报价、混批报价时获取最后一条报价价格
	 * @param tradeInfo
	 * @return
	 */
	private BigDecimal getPricerange(BusinTradeInfo tradeInfo) {
		BigDecimal pricerange = null;
		if (null == tradeInfo) {
			return pricerange;
		}
		String priceType = tradeInfo.getPriceType();
		if (PriceType.SPEC_QUOTE.equals(priceType)) {
			List<SpecPrice> specPriceList = tradeInfo.getSpecPrice();
			if (null != specPriceList && !specPriceList.isEmpty()) {
				String unitPrice = specPriceList.get(0).getUnitPrice();
				if (StringUtils.isNotBlank(unitPrice)) {
					pricerange = new BigDecimal(unitPrice);
				}
			}
		} else {
			List<IntervalPrice> intervalPriceList = tradeInfo.getIntervalPrice();
			if (null != intervalPriceList && !intervalPriceList.isEmpty()) {
				String buyPrice = intervalPriceList.get(intervalPriceList.size() - 1).getBuyPrice();
				if (StringUtils.isNotBlank(buyPrice)) {
					pricerange = new BigDecimal(buyPrice);
				}
			}
		}
		return pricerange;
	}

	/**
	 * 获取用户可发送的商机上限
	 * @param businLimitParam
	 * @return
	 * @throws Exception
	 */
	@Override
	public int findBusinLimit(BusinLimitParam businLimitParam) throws Exception {

		return onBusinChanceMapper.findBusinLimit(businLimitParam);
	}

	/**
	 * 根据行业id，判断是否该行业被限制发布商机的数目 返回值大于0 存在行业限制
	 * @param areaId
	 * @return
	 * @throws Exception
	 */
	@Override
	public int isExistAreaLimit(String areaId) throws Exception {
		return onBusinChanceMapper.isExistAreaLimit(areaId);
	}

	/**
	 * 炫铺分类商机统计
	 * @param providerId
	 * @param seriesid
	 * @return
	 * @throws Exception
	 */
	@Override
	public int findBcNumBySeriesId(long providerId, long seriesid) throws Exception {
		Map<String, Object> param = new HashMap<>();
		param.put("providerId", providerId);
		param.put("seriesid", seriesid);

		return onBusinChanceMapper.findBcNumBySeriesId(param);
	}
	
}
