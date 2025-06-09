package com.entity.view;

import com.entity.ZaixianjuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线捐赠
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
@TableName("zaixianjuanzeng")
public class ZaixianjuanzengView  extends ZaixianjuanzengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaixianjuanzengView(){
	}
 
 	public ZaixianjuanzengView(ZaixianjuanzengEntity zaixianjuanzengEntity){
 	try {
			BeanUtils.copyProperties(this, zaixianjuanzengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
