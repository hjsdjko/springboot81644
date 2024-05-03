package com.dao;

import com.entity.DiscussyiqingzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyiqingzhishiVO;
import com.entity.view.DiscussyiqingzhishiView;


/**
 * 疫情知识评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-10 10:02:51
 */
public interface DiscussyiqingzhishiDao extends BaseMapper<DiscussyiqingzhishiEntity> {
	
	List<DiscussyiqingzhishiVO> selectListVO(@Param("ew") Wrapper<DiscussyiqingzhishiEntity> wrapper);
	
	DiscussyiqingzhishiVO selectVO(@Param("ew") Wrapper<DiscussyiqingzhishiEntity> wrapper);
	
	List<DiscussyiqingzhishiView> selectListView(@Param("ew") Wrapper<DiscussyiqingzhishiEntity> wrapper);

	List<DiscussyiqingzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyiqingzhishiEntity> wrapper);
	
	DiscussyiqingzhishiView selectView(@Param("ew") Wrapper<DiscussyiqingzhishiEntity> wrapper);
	
}
