package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiwenzhuangtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiwenzhuangtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiwenzhuangtaiView;


/**
 * 体温状态
 *
 * @author 
 * @email 
 * @date 2021-01-10 10:02:51
 */
public interface TiwenzhuangtaiService extends IService<TiwenzhuangtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiwenzhuangtaiVO> selectListVO(Wrapper<TiwenzhuangtaiEntity> wrapper);
   	
   	TiwenzhuangtaiVO selectVO(@Param("ew") Wrapper<TiwenzhuangtaiEntity> wrapper);
   	
   	List<TiwenzhuangtaiView> selectListView(Wrapper<TiwenzhuangtaiEntity> wrapper);
   	
   	TiwenzhuangtaiView selectView(@Param("ew") Wrapper<TiwenzhuangtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiwenzhuangtaiEntity> wrapper);
   	
}

