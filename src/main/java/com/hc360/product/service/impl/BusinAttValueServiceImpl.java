package com.hc360.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hc360.b2b.netWorker.GetUrl;
import com.hc360.product.dao.BusinAttValueMapper;
import com.hc360.product.po.BusinAttValue;
import com.hc360.product.service.BusinAttValueService;
import com.hc360.product.vo.BusinAttValueVO;


@Service
public class BusinAttValueServiceImpl implements BusinAttValueService {
	@Autowired
	private BusinAttValueMapper businAttValueMapper;

	public List<BusinAttValueVO> selectByBcid(long bcid) {
		List<BusinAttValueVO> businAttValueVOList = null;
		List<BusinAttValue> businAttValueList = this.businAttValueMapper.selectByBcid(bcid);
		if ((null != businAttValueList) && (!businAttValueList.isEmpty())) {
			businAttValueVOList = new ArrayList<BusinAttValueVO>();
			for (BusinAttValue businAttValue : businAttValueList) {
				businAttValueVOList.add(businAttValuePOtoVO(businAttValue));
			}
		}
		return businAttValueVOList;
	}

	@Override
	public void saveOrUpdateBusinAttValueList(List<BusinAttValue> businAttValueList) {
		if (null != businAttValueList && !businAttValueList.isEmpty()) {
			for (BusinAttValue businAttValue : businAttValueList) {
				if (null != businAttValue.getId()) {
					businAttValue.setModifyTime(new Date());
					if (StringUtils.isBlank(businAttValue.getAttvalue())) {
						businAttValueMapper.deleteByPrimaryKey(businAttValue.getId());
					} else {
						businAttValueMapper.updateByPrimaryKeySelective(businAttValue);
					}
				} else {
					businAttValue.setPublishTime(new Date());
					businAttValueMapper.insert(businAttValue);
				}
			}
		}
	}

	private BusinAttValueVO businAttValuePOtoVO(BusinAttValue businAttValue) {
		BusinAttValueVO businAttValueVO = null;
		if (null != businAttValue) {
			businAttValueVO = new BusinAttValueVO();
			businAttValueVO.setId(null != businAttValue.getId() ? businAttValue.getId().longValue() : 0L);
			businAttValueVO.setBcid(null != businAttValue.getBcId() ? businAttValue.getBcId().longValue() : 0L);
			businAttValueVO.setAttid(null != businAttValue.getAttid() ? businAttValue.getAttid().longValue() : 0L);
			businAttValueVO.setAttname(businAttValue.getAttname());
			String attvalue = businAttValue.getAttvalue();
			if (StringUtils.isNotBlank(attvalue)) {
				businAttValueVO.setAttvalue(attvalue.split(","));
			}
			String picfile = businAttValue.getPicfile();
			if (StringUtils.isNotBlank(picfile)) {
				businAttValueVO.setAttrImg(GetUrl.getPicUrl("0", picfile));
			}
			businAttValueVO.setIsNormsParam(businAttValue.getIsNormsParam());
			businAttValueVO.setYdirect(businAttValue.getYdirect());
		}
		return businAttValueVO;
	}
}
