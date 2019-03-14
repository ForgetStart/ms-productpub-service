/**
 * @file_name ProductPriceServiceImpl.java
 * @project_name MS-ProductPub-Service
 * @user hc360
 * @date 2019年2月25日
 */
package com.hc360.product.service.impl;

import com.github.pagehelper.PageHelper;
import com.hc360.product.dao.BusinPdfDataMapper;
import com.hc360.product.dao.BusinTempParamMapper;
import com.hc360.product.po.BusinTempParamNew;
import com.hc360.product.po.PdfSave;
import com.hc360.product.po.PdfShow;
import com.hc360.product.service.BusinPdfDataService;
import com.hc360.product.service.BusinTempParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hk
 * @version 1.0
 * @date 2019年2月27日
 */
@Service
public class BusinPdfDataServiceImpl implements BusinPdfDataService {

	@Resource
	BusinPdfDataMapper businPdfDataMapper;

	@Override
	public void delPdfPDFSave(long bcid) throws Exception {
		businPdfDataMapper.delPdfPDFSave(bcid);
	}

	@Override
	public void delPdfPDFShow(String pdfshowidsdelete) throws Exception {
		businPdfDataMapper.delPdfPDFShow(pdfshowidsdelete);
	}

	@Override
	public PdfShow getPdfShowInfo(long providerid, long pdfshowid) throws Exception {
		List<PdfShow> pdfShowInfoList = businPdfDataMapper.getPdfShowInfo(providerid, pdfshowid);
		if (pdfShowInfoList != null && !pdfShowInfoList.isEmpty()) {
			return pdfShowInfoList.get(0);
		}
		return null;
	}

	@Override
	public int getPdfShowCount(long providerid) throws Exception {
		return businPdfDataMapper.getPdfShowCount(providerid);
	}

	@Override
	public void savePdfInfo(PdfSave pdfsave) throws Exception {
		businPdfDataMapper.savePdfInfo(pdfsave);
	}

	@Override
	public int countBindPdfShow(long pdfshowid, long bcid) throws Exception {
		return businPdfDataMapper.countBindPdfShow(pdfshowid,bcid);
	}

	@Override
	public List<PdfShow> getPdfShowList(long providerid) throws Exception {
		//默认查询出前500条记录
		PageHelper.startPage(1,500);
		return businPdfDataMapper.getPdfShowList(providerid);
	}


	@Override
	public int savePdfShowInfo(PdfShow pdfshow) throws Exception {
		return businPdfDataMapper.savePdfShowInfo(pdfshow);
	}

	@Override
	public PdfShow getPdfByBcid(long bcid) throws Exception {
		List<PdfShow> pdfShowList = businPdfDataMapper.getPdfByBcid(bcid);
		if (pdfShowList != null && !pdfShowList.isEmpty()) {
			return pdfShowList.get(0);
		}
		return null;
	}

	@Override
	public int countPdfSameNameList(long providerid, String pdfname) throws Exception {
		return businPdfDataMapper.countPdfSameNameList(providerid,pdfname);
	}

	@Override
	public int countPdfShowByProviderid(long providerid) throws Exception {
		return businPdfDataMapper.countPdfShowByProviderid(providerid);
	}

}
