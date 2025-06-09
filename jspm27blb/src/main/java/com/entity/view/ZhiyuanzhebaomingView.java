package com.entity.view;

import com.entity.ZhiyuanzhebaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 志愿者报名
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
@TableName("zhiyuanzhebaoming")
public class ZhiyuanzhebaomingView  extends ZhiyuanzhebaomingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiyuanzhebaomingView(){
	}
 
 	public ZhiyuanzhebaomingView(ZhiyuanzhebaomingEntity zhiyuanzhebaomingEntity){
 	try {
			BeanUtils.copyProperties(this, zhiyuanzhebaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
