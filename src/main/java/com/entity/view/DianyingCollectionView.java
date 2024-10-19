package com.entity.view;

import com.entity.DianyingCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 电影收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("dianying_collection")
public class DianyingCollectionView extends DianyingCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String dianyingCollectionValue;



		//级联表 dianying
			/**
			* 电影名称
			*/
			private String dianyingName;
			/**
			* 电影类型
			*/
			private Integer dianyingTypes;
				/**
				* 电影类型的值
				*/
				private String dianyingValue;
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
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer dianyingDelete;
			/**
			* 电影简介
			*/
			private String dianyingContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public DianyingCollectionView() {

	}

	public DianyingCollectionView(DianyingCollectionEntity dianyingCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, dianyingCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getDianyingCollectionValue() {
				return dianyingCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setDianyingCollectionValue(String dianyingCollectionValue) {
				this.dianyingCollectionValue = dianyingCollectionValue;
			}




				//级联表的get和set dianying
					/**
					* 获取： 电影名称
					*/
					public String getDianyingName() {
						return dianyingName;
					}
					/**
					* 设置： 电影名称
					*/
					public void setDianyingName(String dianyingName) {
						this.dianyingName = dianyingName;
					}
					/**
					* 获取： 电影类型
					*/
					public Integer getDianyingTypes() {
						return dianyingTypes;
					}
					/**
					* 设置： 电影类型
					*/
					public void setDianyingTypes(Integer dianyingTypes) {
						this.dianyingTypes = dianyingTypes;
					}


						/**
						* 获取： 电影类型的值
						*/
						public String getDianyingValue() {
							return dianyingValue;
						}
						/**
						* 设置： 电影类型的值
						*/
						public void setDianyingValue(String dianyingValue) {
							this.dianyingValue = dianyingValue;
						}
					/**
					* 获取： 封面
					*/
					public String getDianyingPhoto() {
						return dianyingPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setDianyingPhoto(String dianyingPhoto) {
						this.dianyingPhoto = dianyingPhoto;
					}
					/**
					* 获取： 导演
					*/
					public String getDianyingDanyan() {
						return dianyingDanyan;
					}
					/**
					* 设置： 导演
					*/
					public void setDianyingDanyan(String dianyingDanyan) {
						this.dianyingDanyan = dianyingDanyan;
					}
					/**
					* 获取： 编剧
					*/
					public String getDianyingBianju() {
						return dianyingBianju;
					}
					/**
					* 设置： 编剧
					*/
					public void setDianyingBianju(String dianyingBianju) {
						this.dianyingBianju = dianyingBianju;
					}
					/**
					* 获取： 制片国家/地区
					*/
					public String getDianyingAddress() {
						return dianyingAddress;
					}
					/**
					* 设置： 制片国家/地区
					*/
					public void setDianyingAddress(String dianyingAddress) {
						this.dianyingAddress = dianyingAddress;
					}
					/**
					* 获取： 语言
					*/
					public String getDianyingYuyan() {
						return dianyingYuyan;
					}
					/**
					* 设置： 语言
					*/
					public void setDianyingYuyan(String dianyingYuyan) {
						this.dianyingYuyan = dianyingYuyan;
					}
					/**
					* 获取： 上映日期
					*/
					public String getDianyingShijian() {
						return dianyingShijian;
					}
					/**
					* 设置： 上映日期
					*/
					public void setDianyingShijian(String dianyingShijian) {
						this.dianyingShijian = dianyingShijian;
					}
					/**
					* 获取： 片长
					*/
					public String getDianyingPianchang() {
						return dianyingPianchang;
					}
					/**
					* 设置： 片长
					*/
					public void setDianyingPianchang(String dianyingPianchang) {
						this.dianyingPianchang = dianyingPianchang;
					}
					/**
					* 获取： 电影原价
					*/
					public Double getDianyingOldMoney() {
						return dianyingOldMoney;
					}
					/**
					* 设置： 电影原价
					*/
					public void setDianyingOldMoney(Double dianyingOldMoney) {
						this.dianyingOldMoney = dianyingOldMoney;
					}
					/**
					* 获取： 现价
					*/
					public Double getDianyingNewMoney() {
						return dianyingNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setDianyingNewMoney(Double dianyingNewMoney) {
						this.dianyingNewMoney = dianyingNewMoney;
					}
					/**
					* 获取： 座位
					*/
					public Integer getZuoweiNumber() {
						return zuoweiNumber;
					}
					/**
					* 设置： 座位
					*/
					public void setZuoweiNumber(Integer zuoweiNumber) {
						this.zuoweiNumber = zuoweiNumber;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getDianyingClicknum() {
						return dianyingClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setDianyingClicknum(Integer dianyingClicknum) {
						this.dianyingClicknum = dianyingClicknum;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getDianyingDelete() {
						return dianyingDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setDianyingDelete(Integer dianyingDelete) {
						this.dianyingDelete = dianyingDelete;
					}
					/**
					* 获取： 电影简介
					*/
					public String getDianyingContent() {
						return dianyingContent;
					}
					/**
					* 设置： 电影简介
					*/
					public void setDianyingContent(String dianyingContent) {
						this.dianyingContent = dianyingContent;
					}






















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
