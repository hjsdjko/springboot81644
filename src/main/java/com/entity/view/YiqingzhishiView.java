package com.entity.view;

import com.entity.YiqingzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫情知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-10 10:02:51
 */
@TableName("yiqingzhishi")
public class YiqingzhishiView  extends YiqingzhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiqingzhishiView(){
	}
 
 	public YiqingzhishiView(YiqingzhishiEntity yiqingzhishiEntity){
 	try {
			BeanUtils.copyProperties(this, yiqingzhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}