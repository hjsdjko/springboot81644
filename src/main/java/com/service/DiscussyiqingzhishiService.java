package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyiqingzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyiqingzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyiqingzhishiView;


/**
 * 疫情知识评论表
 *
 * @author 
 * @email 
 * @date 2021-01-10 10:02:51
 */
public interface DiscussyiqingzhishiService extends IService<DiscussyiqingzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyiqingzhishiVO> selectListVO(Wrapper<DiscussyiqingzhishiEntity> wrapper);
   	
   	DiscussyiqingzhishiVO selectVO(@Param("ew") Wrapper<DiscussyiqingzhishiEntity> wrapper);
   	
   	List<DiscussyiqingzhishiView> selectListView(Wrapper<DiscussyiqingzhishiEntity> wrapper);
   	
   	DiscussyiqingzhishiView selectView(@Param("ew") Wrapper<DiscussyiqingzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyiqingzhishiEntity> wrapper);
   	
}

