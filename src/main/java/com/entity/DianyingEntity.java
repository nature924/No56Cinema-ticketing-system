package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 电影
 *
 * @author 
 * @email
 */
@TableName("dianying")
public class DianyingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DianyingEntity() {

	}

	public DianyingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 电影名称
     */
    @TableField(value = "dianying_name")

    private String dianyingName;


    /**
     * 电影类型
     */
    @TableField(value = "dianying_types")

    private Integer dianyingTypes;


    /**
     * 封面
     */
    @TableField(value = "dianying_photo")

    private String dianyingPhoto;


    /**
     * 导演
     */
    @TableField(value = "dianying_danyan")

    private String dianyingDanyan;


    /**
     * 编剧
     */
    @TableField(value = "dianying_bianju")

    private String dianyingBianju;


    /**
     * 制片国家/地区
     */
    @TableField(value = "dianying_address")

    private String dianyingAddress;


    /**
     * 语言
     */
    @TableField(value = "dianying_yuyan")

    private String dianyingYuyan;


    /**
     * 上映日期
     */
    @TableField(value = "dianying_shijian")

    private String dianyingShijian;


    /**
     * 片长
     */
    @TableField(value = "dianying_pianchang")

    private String dianyingPianchang;


    /**
     * 电影原价
     */
    @TableField(value = "dianying_old_money")

    private Double dianyingOldMoney;


    /**
     * 现价
     */
    @TableField(value = "dianying_new_money")

    private Double dianyingNewMoney;


    /**
     * 座位
     */
    @TableField(value = "zuowei_number")

    private Integer zuoweiNumber;


    /**
     * 点击次数
     */
    @TableField(value = "dianying_clicknum")

    private Integer dianyingClicknum;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "dianying_delete")

    private Integer dianyingDelete;


    /**
     * 电影简介
     */
    @TableField(value = "dianying_content")

    private String dianyingContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：电影名称
	 */
    public String getDianyingName() {
        return dianyingName;
    }


    /**
	 * 获取：电影名称
	 */

    public void setDianyingName(String dianyingName) {
        this.dianyingName = dianyingName;
    }
    /**
	 * 设置：电影类型
	 */
    public Integer getDianyingTypes() {
        return dianyingTypes;
    }


    /**
	 * 获取：电影类型
	 */

    public void setDianyingTypes(Integer dianyingTypes) {
        this.dianyingTypes = dianyingTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getDianyingPhoto() {
        return dianyingPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setDianyingPhoto(String dianyingPhoto) {
        this.dianyingPhoto = dianyingPhoto;
    }
    /**
	 * 设置：导演
	 */
    public String getDianyingDanyan() {
        return dianyingDanyan;
    }


    /**
	 * 获取：导演
	 */

    public void setDianyingDanyan(String dianyingDanyan) {
        this.dianyingDanyan = dianyingDanyan;
    }
    /**
	 * 设置：编剧
	 */
    public String getDianyingBianju() {
        return dianyingBianju;
    }


    /**
	 * 获取：编剧
	 */

    public void setDianyingBianju(String dianyingBianju) {
        this.dianyingBianju = dianyingBianju;
    }
    /**
	 * 设置：制片国家/地区
	 */
    public String getDianyingAddress() {
        return dianyingAddress;
    }


    /**
	 * 获取：制片国家/地区
	 */

    public void setDianyingAddress(String dianyingAddress) {
        this.dianyingAddress = dianyingAddress;
    }
    /**
	 * 设置：语言
	 */
    public String getDianyingYuyan() {
        return dianyingYuyan;
    }


    /**
	 * 获取：语言
	 */

    public void setDianyingYuyan(String dianyingYuyan) {
        this.dianyingYuyan = dianyingYuyan;
    }
    /**
	 * 设置：上映日期
	 */
    public String getDianyingShijian() {
        return dianyingShijian;
    }


    /**
	 * 获取：上映日期
	 */

    public void setDianyingShijian(String dianyingShijian) {
        this.dianyingShijian = dianyingShijian;
    }
    /**
	 * 设置：片长
	 */
    public String getDianyingPianchang() {
        return dianyingPianchang;
    }


    /**
	 * 获取：片长
	 */

    public void setDianyingPianchang(String dianyingPianchang) {
        this.dianyingPianchang = dianyingPianchang;
    }
    /**
	 * 设置：电影原价
	 */
    public Double getDianyingOldMoney() {
        return dianyingOldMoney;
    }


    /**
	 * 获取：电影原价
	 */

    public void setDianyingOldMoney(Double dianyingOldMoney) {
        this.dianyingOldMoney = dianyingOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getDianyingNewMoney() {
        return dianyingNewMoney;
    }


    /**
	 * 获取：现价
	 */

    public void setDianyingNewMoney(Double dianyingNewMoney) {
        this.dianyingNewMoney = dianyingNewMoney;
    }
    /**
	 * 设置：座位
	 */
    public Integer getZuoweiNumber() {
        return zuoweiNumber;
    }


    /**
	 * 获取：座位
	 */

    public void setZuoweiNumber(Integer zuoweiNumber) {
        this.zuoweiNumber = zuoweiNumber;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getDianyingClicknum() {
        return dianyingClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setDianyingClicknum(Integer dianyingClicknum) {
        this.dianyingClicknum = dianyingClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getDianyingDelete() {
        return dianyingDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setDianyingDelete(Integer dianyingDelete) {
        this.dianyingDelete = dianyingDelete;
    }
    /**
	 * 设置：电影简介
	 */
    public String getDianyingContent() {
        return dianyingContent;
    }


    /**
	 * 获取：电影简介
	 */

    public void setDianyingContent(String dianyingContent) {
        this.dianyingContent = dianyingContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Dianying{" +
            "id=" + id +
            ", dianyingName=" + dianyingName +
            ", dianyingTypes=" + dianyingTypes +
            ", dianyingPhoto=" + dianyingPhoto +
            ", dianyingDanyan=" + dianyingDanyan +
            ", dianyingBianju=" + dianyingBianju +
            ", dianyingAddress=" + dianyingAddress +
            ", dianyingYuyan=" + dianyingYuyan +
            ", dianyingShijian=" + dianyingShijian +
            ", dianyingPianchang=" + dianyingPianchang +
            ", dianyingOldMoney=" + dianyingOldMoney +
            ", dianyingNewMoney=" + dianyingNewMoney +
            ", zuoweiNumber=" + zuoweiNumber +
            ", dianyingClicknum=" + dianyingClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", dianyingDelete=" + dianyingDelete +
            ", dianyingContent=" + dianyingContent +
            ", createTime=" + createTime +
        "}";
    }
}
