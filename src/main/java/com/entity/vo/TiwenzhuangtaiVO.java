package com.entity.vo;

import com.entity.TiwenzhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 体温状态
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-10 10:02:51
 */
public class TiwenzhuangtaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 体温状态
	 */
	
	private String tiwenzhuangtai;
				
	
	/**
	 * 设置：体温状态
	 */
	 
	public void setTiwenzhuangtai(String tiwenzhuangtai) {
		this.tiwenzhuangtai = tiwenzhuangtai;
	}
	
	/**
	 * 获取：体温状态
	 */
	public String getTiwenzhuangtai() {
		return tiwenzhuangtai;
	}
			
}
