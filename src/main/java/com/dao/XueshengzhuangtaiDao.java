package com.dao;

import com.entity.XueshengzhuangtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengzhuangtaiVO;
import com.entity.view.XueshengzhuangtaiView;


/**
 * 学生状态
 * 
 * @author 
 * @email 
 * @date 2021-01-10 10:02:51
 */
public interface XueshengzhuangtaiDao extends BaseMapper<XueshengzhuangtaiEntity> {
	
	List<XueshengzhuangtaiVO> selectListVO(@Param("ew") Wrapper<XueshengzhuangtaiEntity> wrapper);
	
	XueshengzhuangtaiVO selectVO(@Param("ew") Wrapper<XueshengzhuangtaiEntity> wrapper);
	
	List<XueshengzhuangtaiView> selectListView(@Param("ew") Wrapper<XueshengzhuangtaiEntity> wrapper);

	List<XueshengzhuangtaiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengzhuangtaiEntity> wrapper);
	
	XueshengzhuangtaiView selectView(@Param("ew") Wrapper<XueshengzhuangtaiEntity> wrapper);
	
}
