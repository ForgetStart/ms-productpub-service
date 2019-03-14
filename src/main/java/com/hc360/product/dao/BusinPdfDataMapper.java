package com.hc360.product.dao;

import com.hc360.b2b.exception.MmtException;
import com.hc360.product.po.PdfSave;
import com.hc360.product.po.PdfShow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BusinPdfDataMapper
{

   /**
    * 根据bcID 删除PDFSave
    * @author hk
    * @date 2019-02-27
    * @param bcid 商机id
    * @throws Exception
    * @return
    */
   public void delPdfPDFSave(@Param("bcid")long bcid) throws Exception;

   /**
    * 根据ids删除pdfshow
    * @param pdfshowidsdelete
    * @throws Exception
    */
   public void delPdfPDFShow(@Param("pdfshowidsdelete")String pdfshowidsdelete)throws Exception;

   /**
    * 保存pdf上传文件
    *
    * @param pdfsave
    */
   public void savePdfInfo(PdfSave pdfsave)throws Exception;


   /**
    * 保存上传数据到pdf_show表中
    * @param pdfshow
    */
   public int savePdfShowInfo(PdfShow pdfshow) throws Exception;


   /**
    * 根据pdfshowId查询实体对象
    * @author hk
    * @date 2014-09-28
    * @param providerid
    * @param pdfshowid
    * @throws Exception
    */
   public List<PdfShow> getPdfShowInfo(@Param("providerid")long providerid, @Param("pdfshowid")long pdfshowid) throws Exception;

   /**
    * 根据pdfshowId和bcid查看绑定数量
    * @author hk
    * @date 2019-03-05
    * @param pdfshowid
    * @param bcid
    * @throws Exception
    */
   public int countBindPdfShow(@Param("pdfshowid")long pdfshowid,@Param("bcid")long bcid) throws Exception;

   /**
    * 查询pdfshow表里上传的pdf文件的总数
    * @author hk
    * @date 2019-03-05
    * @param providerid
    * @throws Exception
    */

   public int countPdfShowByProviderid(@Param("providerid")long providerid) throws Exception;


   /**
    * 页面展示的pdf数据，状态为1，按照上传时间排序，倒序
    * @author hk
    * @date 2019-03-05
    * @param providerid
    * @throws Exception
    */
   public List<PdfShow> getPdfShowList(@Param("providerid")long providerid) throws Exception;

   /**
    * 根据商品ID 获取绑定pdf文档
    * @author hk
    * @date 2019-03-05
    * @return
    * @throws Exception
    */
   public List<PdfShow> getPdfByBcid(@Param("bcid")long bcid) throws Exception;

   /**
    * 上传pdf的时候查询数据库，判断是否重名
    * @author hk
    * @date 2019-03-05
    * @param providerid
    * @param pdfname
    * @return
    * @throws Exception
    */
   public int countPdfSameNameList(@Param("providerid")long providerid,@Param("pdfname")String pdfname) throws Exception;


}
