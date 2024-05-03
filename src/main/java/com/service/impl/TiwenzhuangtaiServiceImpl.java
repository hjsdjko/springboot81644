package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TiwenzhuangtaiDao;
import com.entity.TiwenzhuangtaiEntity;
import com.service.TiwenzhuangtaiService;
import com.entity.vo.TiwenzhuangtaiVO;
import com.entity.view.TiwenzhuangtaiView;

@Service("tiwenzhuangtaiService")
public class TiwenzhuangtaiServiceImpl extends ServiceImpl<TiwenzhuangtaiDao, TiwenzhuangtaiEntity> implements TiwenzhuangtaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiwenzhuangtaiEntity> page = this.selectPage(
                new Query<TiwenzhuangtaiEntity>(params).getPage(),
                new EntityWrapper<TiwenzhuangtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiwenzhuangtaiEntity> wrapper) {
		  Page<TiwenzhuangtaiView> page =new Query<TiwenzhuangtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TiwenzhuangtaiVO> selectListVO(Wrapper<TiwenzhuangtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiwenzhuangtaiVO selectVO(Wrapper<TiwenzhuangtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiwenzhuangtaiView> selectListView(Wrapper<TiwenzhuangtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiwenzhuangtaiView selectView(Wrapper<TiwenzhuangtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
