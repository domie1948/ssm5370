package com.entity.view;

import com.entity.FupinjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 扶贫计划
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
@TableName("fupinjihua")
public class FupinjihuaView  extends FupinjihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FupinjihuaView(){
	}
 
 	public FupinjihuaView(FupinjihuaEntity fupinjihuaEntity){
 	try {
			BeanUtils.copyProperties(this, fupinjihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
