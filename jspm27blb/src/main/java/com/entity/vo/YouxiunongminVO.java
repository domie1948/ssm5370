package com.entity.vo;

import com.entity.YouxiunongminEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 优秀农民
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
public class YouxiunongminVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
