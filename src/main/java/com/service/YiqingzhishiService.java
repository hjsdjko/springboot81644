package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiqingzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiqingzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiqingzhishiView;


/**
 * 疫情知识
 *
 * @author 
 * @email 
 * @date 2021-01-10 10:02:51
 */
public interface YiqingzhishiService extends IService<YiqingzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiqingzhishiVO> selectListVO(Wrapper<YiqingzhishiEntity> wrapper);
   	
   	YiqingzhishiVO selectVO(@Param("ew") Wrapper<YiqingzhishiEntity> wrapper);
   	
   	List<YiqingzhishiView> selectListView(Wrapper<YiqingzhishiEntity> wrapper);
   	
   	YiqingzhishiView selectView(@Param("ew") Wrapper<YiqingzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiqingzhishiEntity> wrapper);
   	
}

