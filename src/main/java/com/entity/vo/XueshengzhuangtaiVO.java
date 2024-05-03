package com.entity.vo;

import com.entity.XueshengzhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生状态
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-10 10:02:51
 */
public class XueshengzhuangtaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 身体状态
	 */
	
	private String shentizhuangtai;
		
	/**
	 * 核酸检测
	 */
	
	private String hesuanjiance;
		
	/**
	 * 核酸状态
	 */
	
	private String hesuanzhuangtai;
		
	/**
	 * 体温
	 */
	
	private String tiwen;
		
	/**
	 * 体温状态
	 */
	
	private String tiwenzhuangtai;
		
	/**
	 * 更新日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinriqi;
		
	/**
	 * 登记内容
	 */
	
	private String dengjineirong;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
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
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：身体状态
	 */
	 
	public void setShentizhuangtai(String shentizhuangtai) {
		this.shentizhuangtai = shentizhuangtai;
	}
	
	/**
	 * 获取：身体状态
	 */
	public String getShentizhuangtai() {
		return shentizhuangtai;
	}
				
	
	/**
	 * 设置：核酸检测
	 */
	 
	public void setHesuanjiance(String hesuanjiance) {
		this.hesuanjiance = hesuanjiance;
	}
	
	/**
	 * 获取：核酸检测
	 */
	public String getHesuanjiance() {
		return hesuanjiance;
	}
				
	
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
				
	
	/**
	 * 设置：体温
	 */
	 
	public void setTiwen(String tiwen) {
		this.tiwen = tiwen;
	}
	
	/**
	 * 获取：体温
	 */
	public String getTiwen() {
		return tiwen;
	}
				
	
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
				
	
	/**
	 * 设置：更新日期
	 */
	 
	public void setGengxinriqi(Date gengxinriqi) {
		this.gengxinriqi = gengxinriqi;
	}
	
	/**
	 * 获取：更新日期
	 */
	public Date getGengxinriqi() {
		return gengxinriqi;
	}
				
	
	/**
	 * 设置：登记内容
	 */
	 
	public void setDengjineirong(String dengjineirong) {
		this.dengjineirong = dengjineirong;
	}
	
	/**
	 * 获取：登记内容
	 */
	public String getDengjineirong() {
		return dengjineirong;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
