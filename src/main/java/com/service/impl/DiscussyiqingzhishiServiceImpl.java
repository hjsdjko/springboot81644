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


import com.dao.DiscussyiqingzhishiDao;
import com.entity.DiscussyiqingzhishiEntity;
import com.service.DiscussyiqingzhishiService;
import com.entity.vo.DiscussyiqingzhishiVO;
import com.entity.view.DiscussyiqingzhishiView;

@Service("discussyiqingzhishiService")
public class DiscussyiqingzhishiServiceImpl extends ServiceImpl<DiscussyiqingzhishiDao, DiscussyiqingzhishiEntity> implements DiscussyiqingzhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyiqingzhishiEntity> page = this.selectPage(
                new Query<DiscussyiqingzhishiEntity>(params).getPage(),
                new EntityWrapper<DiscussyiqingzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyiqingzhishiEntity> wrapper) {
		  Page<DiscussyiqingzhishiView> page =new Query<DiscussyiqingzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyiqingzhishiVO> selectListVO(Wrapper<DiscussyiqingzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyiqingzhishiVO selectVO(Wrapper<DiscussyiqingzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyiqingzhishiView> selectListView(Wrapper<DiscussyiqingzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyiqingzhishiView selectView(Wrapper<DiscussyiqingzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
