package com.dao;

import com.entity.YiqingzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiqingzhishiVO;
import com.entity.view.YiqingzhishiView;


/**
 * 疫情知识
 * 
 * @author 
 * @email 
 * @date 2021-01-10 10:02:51
 */
public interface YiqingzhishiDao extends BaseMapper<YiqingzhishiEntity> {
	
	List<YiqingzhishiVO> selectListVO(@Param("ew") Wrapper<YiqingzhishiEntity> wrapper);
	
	YiqingzhishiVO selectVO(@Param("ew") Wrapper<YiqingzhishiEntity> wrapper);
	
	List<YiqingzhishiView> selectListView(@Param("ew") Wrapper<YiqingzhishiEntity> wrapper);

	List<YiqingzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<YiqingzhishiEntity> wrapper);
	
	YiqingzhishiView selectView(@Param("ew") Wrapper<YiqingzhishiEntity> wrapper);
	
}
