package com.entity.model;

import com.entity.HesuanjianceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 核酸检测
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-10 10:02:51
 */
public class HesuanjianceModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 核酸状态
	 */
	
	private String hesuanzhuangtai;
				
	
	/**
	 * 设置：核酸状态
	 */
	 
	public void setHesuanzhuangtai(String hesuanzhuangtai) {
		this.hesuanzhuangtai = hesuanzhuangtai;
	}
	
	/**
	 * 获取：核酸状态
	 */
	public String getHesuanzhuangtai() {
		return hesuanzhuangtai;
	}
			
}
