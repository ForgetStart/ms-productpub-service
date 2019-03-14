package com.hc360.product.service;

import com.hc360.product.po.PdfSave;
import com.hc360.product.po.PdfShow;

import java.util.List;

public interface BusinPdfDataService {

   /**
    * 根据bcID 删除PDFSave
    * @author hk
    * @date 2019-02-27
    * @param bcid 商机id
    * @throws Exception
    * @return
    */
   public void delPdfPDFSave(long bcid) throws Exception;

   /**
    * 根据ids删除pdfshow
    * @param pdfshowidsdelete
    * @throws Exception
    */
   public void delPdfPDFShow(String pdfshowidsdelete)throws Exception;

   /**
    * 保存pdf上传文件
    *
    * @param pdfsave
    */
   public void savePdfInfo(PdfSave pdfsave)throws Exception;

   /**
    * 根据pdfshowId查询实体对象
    * @author hk
    * @date 2014-09-28
    * @param providerid
    * @param pdfshowid
    * @throws Exception
    */
   public PdfShow getPdfShowInfo(long providerid,long pdfshowid) throws Exception;


   /**
    * 根据pdfshowId和bcid查看绑定数量
    * @author hk
    * @date 2019-03-05
    * @param pdfshowid
    * @param bcid
    * @throws Exception
    */
   public int countBindPdfShow(long pdfshowid,long bcid) throws Exception;

   /**
    * 页面展示的pdf数据，状态为1，按照上传时间排序，倒序
    * @author hk
    * @date 2019-03-05
    * @param providerid
    * @throws Exception
    */
   public List<PdfShow> getPdfShowList(long providerid) throws Exception;

   /**
    * 根据商品ID 获取绑定pdf文档
    * @author hk
    * @date 2019-03-05
    * @return
    * @throws Exception
    */
   public PdfShow getPdfByBcid(long bcid) throws Exception;


   /**
    * 上传pdf的时候查询数据库，判断是否重名
    * @author hk
    * @date 2019-03-05
    * @param providerid
    * @param pdfname
    * @return
    * @throws Exception
    */
   public int countPdfSameNameList(long providerid,String pdfname) throws Exception;

   /**
    * 查询pdfshow表里上传的pdf文件的总数
    * @author hk
    * @date 2019-03-05
    * @param providerid
    * @throws Exception
    */

   public int countPdfShowByProviderid(long providerid) throws Exception;

   /**
    * 保存上传数据到pdf_show表中
    * @param pdfshow
    */
   public int savePdfShowInfo(PdfShow pdfshow) throws Exception;
}
