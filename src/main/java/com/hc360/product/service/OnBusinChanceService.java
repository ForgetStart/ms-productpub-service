package com.hc360.product.service;

import com.hc360.b2b.exception.MmtException;
import com.hc360.product.bo.busin.BusinInfoParamsObject;
import com.hc360.product.po.BusinChance;
import com.hc360.product.po.OnBusinChance;
import com.hc360.product.vo.BusinBaseInfoVO;
import com.hc360.product.vo.BusinLimitParam;
import com.hc360.product.vo.OnBusinChancePageListVO;

public interface OnBusinChanceService {
	
	/**
	 * 获取用户在售商机列表
	 * @author xiangp
	 * @date 2019年2月25日 下午4:23:53
	 * @param providerid
	 * @param titleKeyword
	 * @param page
	 * @param pageSize
	 * @return
	 */
   OnBusinChancePageListVO getOnBusinChancePageList(long providerid, String titleKeyword, int page, int pageSize);
  
   /**
    * 修改商机时获取商机基本信息
    * @author xiangp
    * @date 2019年2月25日 下午4:23:41
    * @param providerid
    * @param bcid
    * @return
    */
   BusinBaseInfoVO getEditBusin(long providerid, long bcid);
  
   /**
    * 获取商机信息，优先从bak表获取
    * @author xiangp
    * @date 2019年2月25日 下午4:23:19
    * @param providerid
    * @param bcid
    * @return
    */
   OnBusinChance getOnBusinChanceFromBakOrOn(long providerid, long bcid);
   /**
    * 获取商机信息，优先从bak表获取
    * @author xiangp
    * @date 2019年2月25日 下午4:23:19
    * @param providerid
    * @param bcid
    * @return
    */
   BusinChance getBusinChanceFromBakOrOn(long providerid, long bcid);

	/**
	 * 查询今天之前发布的的供应信息数量
	 * @param providerid
	 * @return
	 */
	int corPubInfoNum(long providerid) throws Exception;

	/**
	 * 在线产品总数（在售+审核中+已过期）
	 * @param providerid
	 * @param today
	 * @return
	 * @throws Exception
	 */
	int getBusinCount(long providerid, String today) throws Exception;

	/**
	 * 获取用户可发送的商机上限
	 * @param businLimitParam
	 * @return
	 * @throws Exception
	 */
	int findBusinLimit(BusinLimitParam businLimitParam) throws Exception;

	/**
	 * 根据行业id，判断是否该行业被限制发布商机的数目 返回值大于0 存在行业限制
	 * @param areaId
	 * @return
	 * @throws Exception
	 */
	int isExistAreaLimit(String areaId) throws Exception;

	/**
	 * 炫铺分类商机统计
	 * @param providerId
	 * @param seriesid
	 * @return
	 * @throws Exception
	 */
	int findBcNumBySeriesId(long providerId, long seriesid) throws Exception;

	/**
	 * 保存或更新商机
	 * @author xiangp
	 * @date 2019年3月2日 下午6:40:24
	 * @param businInfoParamsObject
	 * @return
	 */
	Long saveOrUpdateBusinChance(BusinInfoParamsObject businInfoParamsObject) throws Exception;
}

