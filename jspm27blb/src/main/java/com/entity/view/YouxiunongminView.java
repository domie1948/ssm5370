package com.entity.view;

import com.entity.YouxiunongminEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 优秀农民
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
@TableName("youxiunongmin")
public class YouxiunongminView  extends YouxiunongminEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxiunongminView(){
	}
 
 	public YouxiunongminView(YouxiunongminEntity youxiunongminEntity){
 	try {
			BeanUtils.copyProperties(this, youxiunongminEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
