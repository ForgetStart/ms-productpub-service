package com.hc360.product.po;

import java.math.BigDecimal;
import java.util.Date;

public class BusinMultimedia {
    /**
     * 编号
     */
    private BigDecimal bimId;

    /**
     * 是否为默认图片(1:是,0:否)
     */
    private String defaultflag;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 文件名称
     */
    private String filename;

    /**
     * 文件简述
     */
    private String filenotes;

    /**
     * 上传人员
     */
    private String uploader;

    /**
     * 上传日期
     */
    private Date uploadDate;

    /**
     * 审核标志 （0：未审核 1：已审核 2：已删除）
     */
    private String checked;

    /**
     * 审核日期
     */
    private Date checkdate;

    /**
     * 审核人
     */
    private String checkman;

    /**
     * 删除人
     */
    private String whodel;

    /**
     * 修改人
     */
    private String whoupdate;

    /**
     * 更新日期
     */
    private Date updatetime;

    /**
     * 删除日期
     */
    private Date deldate;

    /**
     * 商机商品编号
     */
    private BigDecimal bcId;

    /**
     * 是否需要审核
     */
    private Short editchecked;

    /**
     * 待审核图片名称
     */
    private String editpicname;

    /**
     * IMAGE_WIDTH
     */
    private Integer imageWidth;

    /**
     * IMAGE_HEIGHT
     */
    private Integer imageHeight;

    /**
     * PICID
     */
    private BigDecimal picid;

    /**
     * TITLE
     */
    private String title;

    public BigDecimal getBimId() {
        return bimId;
    }

    public void setBimId(BigDecimal bimId) {
        this.bimId = bimId;
    }

    public String getDefaultflag() {
        return defaultflag;
    }

    public void setDefaultflag(String defaultflag) {
        this.defaultflag = defaultflag == null ? null : defaultflag.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFilenotes() {
        return filenotes;
    }

    public void setFilenotes(String filenotes) {
        this.filenotes = filenotes == null ? null : filenotes.trim();
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader == null ? null : uploader.trim();
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
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

    public String getWhodel() {
        return whodel;
    }

    public void setWhodel(String whodel) {
        this.whodel = whodel == null ? null : whodel.trim();
    }

    public String getWhoupdate() {
        return whoupdate;
    }

    public void setWhoupdate(String whoupdate) {
        this.whoupdate = whoupdate == null ? null : whoupdate.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getDeldate() {
        return deldate;
    }

    public void setDeldate(Date deldate) {
        this.deldate = deldate;
    }

    public BigDecimal getBcId() {
        return bcId;
    }

    public void setBcId(BigDecimal bcId) {
        this.bcId = bcId;
    }

    public Short getEditchecked() {
        return editchecked;
    }

    public void setEditchecked(Short editchecked) {
        this.editchecked = editchecked;
    }

    public String getEditpicname() {
        return editpicname;
    }

    public void setEditpicname(String editpicname) {
        this.editpicname = editpicname == null ? null : editpicname.trim();
    }

    public Integer getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    public Integer getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    public BigDecimal getPicid() {
        return picid;
    }

    public void setPicid(BigDecimal picid) {
        this.picid = picid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}