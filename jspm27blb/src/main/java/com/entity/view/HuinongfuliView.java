package com.entity.view;

import com.entity.HuinongfuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 惠农福利
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
@TableName("huinongfuli")
public class HuinongfuliView  extends HuinongfuliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuinongfuliView(){
	}
 
 	public HuinongfuliView(HuinongfuliEntity huinongfuliEntity){
 	try {
			BeanUtils.copyProperties(this, huinongfuliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
