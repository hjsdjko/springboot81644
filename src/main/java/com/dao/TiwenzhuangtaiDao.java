package com.dao;

import com.entity.TiwenzhuangtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiwenzhuangtaiVO;
import com.entity.view.TiwenzhuangtaiView;


/**
 * 体温状态
 * 
 * @author 
 * @email 
 * @date 2021-01-10 10:02:51
 */
public interface TiwenzhuangtaiDao extends BaseMapper<TiwenzhuangtaiEntity> {
	
	List<TiwenzhuangtaiVO> selectListVO(@Param("ew") Wrapper<TiwenzhuangtaiEntity> wrapper);
	
	TiwenzhuangtaiVO selectVO(@Param("ew") Wrapper<TiwenzhuangtaiEntity> wrapper);
	
	List<TiwenzhuangtaiView> selectListView(@Param("ew") Wrapper<TiwenzhuangtaiEntity> wrapper);

	List<TiwenzhuangtaiView> selectListView(Pagination page,@Param("ew") Wrapper<TiwenzhuangtaiEntity> wrapper);
	
	TiwenzhuangtaiView selectView(@Param("ew") Wrapper<TiwenzhuangtaiEntity> wrapper);
	
}
