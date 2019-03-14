package com.hc360.product.service;

import com.hc360.product.po.BusinAttValue;
import com.hc360.product.vo.BusinAttValueVO;
import java.util.List;

public interface BusinAttValueService{
 
	List<BusinAttValueVO> selectByBcid(long bcid);

	/**
	 * 保存或更新商机参数列表
	 * @param businAttValueList
	 */
	void saveOrUpdateBusinAttValueList(List<BusinAttValue> businAttValueList);

}
