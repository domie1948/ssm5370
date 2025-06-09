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
 * 优秀农民
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
@TableName("youxiunongmin")
public class YouxiunongminEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YouxiunongminEntity() {
		
	}
	
	public YouxiunongminEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 农民姓名
	 */
					
	private String nongminxingming;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 个人简介
	 */
					
	private String gerenjianjie;
	
	/**
	 * 风光事迹
	 */
					
	private String fengguangshiji;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：农民姓名
	 */
	public void setNongminxingming(String nongminxingming) {
		this.nongminxingming = nongminxingming;
	}
	/**
	 * 获取：农民姓名
	 */
	public String getNongminxingming() {
		return nongminxingming;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：个人简介
	 */
	public void setGerenjianjie(String gerenjianjie) {
		this.gerenjianjie = gerenjianjie;
	}
	/**
	 * 获取：个人简介
	 */
	public String getGerenjianjie() {
		return gerenjianjie;
	}
	/**
	 * 设置：风光事迹
	 */
	public void setFengguangshiji(String fengguangshiji) {
		this.fengguangshiji = fengguangshiji;
	}
	/**
	 * 获取：风光事迹
	 */
	public String getFengguangshiji() {
		return fengguangshiji;
	}

}
