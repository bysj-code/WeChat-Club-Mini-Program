package com.entity.view;

import com.entity.ShetuanshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社团申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 17:17:58
 */
@TableName("shetuanshenqing")
public class ShetuanshenqingView  extends ShetuanshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShetuanshenqingView(){
	}
 
 	public ShetuanshenqingView(ShetuanshenqingEntity shetuanshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, shetuanshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
