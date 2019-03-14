/**
 * @file_name ProductPriceServiceImpl.java
 * @project_name MS-ProductPub-Service
 * @user hc360
 * @date 2019年2月25日
 */
package com.hc360.product.service.impl;

import com.hc360.product.dao.BusinTempParamMapper;
import com.hc360.product.po.BusinTempParamNew;
import com.hc360.product.service.BusinTempParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hk
 * @version 1.0
 * @date 2019年2月27日
 */
@Service
public class BusinTempParamServiceImpl implements BusinTempParamService {

	@Resource
	BusinTempParamMapper businTempParamMapper;


	@Override
	public void delTempParamNew(Long bcid) throws Exception {
		businTempParamMapper.delTempParamNew(bcid);
	}

	@Override
	public void delBatchTempParamNew(Long bcid, String tmpname) throws Exception {
		businTempParamMapper.delBatchTempParamNew(bcid,tmpname);
	}

	@Override
	public void saveTempParamNew(BusinTempParamNew businTempParam) throws Exception {
		businTempParamMapper.saveTempParamNew(businTempParam);
	}
}
