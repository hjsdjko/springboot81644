package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengzhuangtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengzhuangtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengzhuangtaiView;


/**
 * 学生状态
 *
 * @author 
 * @email 
 * @date 2021-01-10 10:02:51
 */
public interface XueshengzhuangtaiService extends IService<XueshengzhuangtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengzhuangtaiVO> selectListVO(Wrapper<XueshengzhuangtaiEntity> wrapper);
   	
   	XueshengzhuangtaiVO selectVO(@Param("ew") Wrapper<XueshengzhuangtaiEntity> wrapper);
   	
   	List<XueshengzhuangtaiView> selectListView(Wrapper<XueshengzhuangtaiEntity> wrapper);
   	
   	XueshengzhuangtaiView selectView(@Param("ew") Wrapper<XueshengzhuangtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengzhuangtaiEntity> wrapper);
   	
}

