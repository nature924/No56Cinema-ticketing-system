package com.entity.model;

import com.entity.DianyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 电影
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DianyingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 电影名称
     */
    private String dianyingName;


    /**
     * 电影类型
     */
    private Integer dianyingTypes;


    /**
     * 封面
     */
    private String dianyingPhoto;


    /**
     * 导演
     */
    private String dianyingDanyan;


    /**
     * 编剧
     */
    private String dianyingBianju;


    /**
     * 制片国家/地区
     */
    private String dianyingAddress;


    /**
     * 语言
     */
    private String dianyingYuyan;


    /**
     * 上映日期
     */
    private String dianyingShijian;


    /**
     * 片长
     */
    private String dianyingPianchang;


    /**
     * 电影原价
     */
    private Double dianyingOldMoney;


    /**
     * 现价
     */
    private Double dianyingNewMoney;


    /**
     * 座位
     */
    private Integer zuoweiNumber;


    /**
     * 点击次数
     */
    private Integer dianyingClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer dianyingDelete;


    /**
     * 电影简介
     */
    private String dianyingContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：电影名称
	 */
    public String getDianyingName() {
        return dianyingName;
    }


    /**
	 * 设置：电影名称
	 */
    public void setDianyingName(String dianyingName) {
        this.dianyingName = dianyingName;
    }
    /**
	 * 获取：电影类型
	 */
    public Integer getDianyingTypes() {
        return dianyingTypes;
    }


    /**
	 * 设置：电影类型
	 */
    public void setDianyingTypes(Integer dianyingTypes) {
        this.dianyingTypes = dianyingTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getDianyingPhoto() {
        return dianyingPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setDianyingPhoto(String dianyingPhoto) {
        this.dianyingPhoto = dianyingPhoto;
    }
    /**
	 * 获取：导演
	 */
    public String getDianyingDanyan() {
        return dianyingDanyan;
    }


    /**
	 * 设置：导演
	 */
    public void setDianyingDanyan(String dianyingDanyan) {
        this.dianyingDanyan = dianyingDanyan;
    }
    /**
	 * 获取：编剧
	 */
    public String getDianyingBianju() {
        return dianyingBianju;
    }


    /**
	 * 设置：编剧
	 */
    public void setDianyingBianju(String dianyingBianju) {
        this.dianyingBianju = dianyingBianju;
    }
    /**
	 * 获取：制片国家/地区
	 */
    public String getDianyingAddress() {
        return dianyingAddress;
    }


    /**
	 * 设置：制片国家/地区
	 */
    public void setDianyingAddress(String dianyingAddress) {
        this.dianyingAddress = dianyingAddress;
    }
    /**
	 * 获取：语言
	 */
    public String getDianyingYuyan() {
        return dianyingYuyan;
    }


    /**
	 * 设置：语言
	 */
    public void setDianyingYuyan(String dianyingYuyan) {
        this.dianyingYuyan = dianyingYuyan;
    }
    /**
	 * 获取：上映日期
	 */
    public String getDianyingShijian() {
        return dianyingShijian;
    }


    /**
	 * 设置：上映日期
	 */
    public void setDianyingShijian(String dianyingShijian) {
        this.dianyingShijian = dianyingShijian;
    }
    /**
	 * 获取：片长
	 */
    public String getDianyingPianchang() {
        return dianyingPianchang;
    }


    /**
	 * 设置：片长
	 */
    public void setDianyingPianchang(String dianyingPianchang) {
        this.dianyingPianchang = dianyingPianchang;
    }
    /**
	 * 获取：电影原价
	 */
    public Double getDianyingOldMoney() {
        return dianyingOldMoney;
    }


    /**
	 * 设置：电影原价
	 */
    public void setDianyingOldMoney(Double dianyingOldMoney) {
        this.dianyingOldMoney = dianyingOldMoney;
    }
    /**
	 * 获取：现价
	 */
    public Double getDianyingNewMoney() {
        return dianyingNewMoney;
    }


    /**
	 * 设置：现价
	 */
    public void setDianyingNewMoney(Double dianyingNewMoney) {
        this.dianyingNewMoney = dianyingNewMoney;
    }
    /**
	 * 获取：座位
	 */
    public Integer getZuoweiNumber() {
        return zuoweiNumber;
    }


    /**
	 * 设置：座位
	 */
    public void setZuoweiNumber(Integer zuoweiNumber) {
        this.zuoweiNumber = zuoweiNumber;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getDianyingClicknum() {
        return dianyingClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setDianyingClicknum(Integer dianyingClicknum) {
        this.dianyingClicknum = dianyingClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getDianyingDelete() {
        return dianyingDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setDianyingDelete(Integer dianyingDelete) {
        this.dianyingDelete = dianyingDelete;
    }
    /**
	 * 获取：电影简介
	 */
    public String getDianyingContent() {
        return dianyingContent;
    }


    /**
	 * 设置：电影简介
	 */
    public void setDianyingContent(String dianyingContent) {
        this.dianyingContent = dianyingContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
