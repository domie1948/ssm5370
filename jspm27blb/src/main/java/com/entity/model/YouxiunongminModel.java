package com.entity.model;

import com.entity.YouxiunongminEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 优秀农民
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
public class YouxiunongminModel  implements Serializable {
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
