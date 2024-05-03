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


import com.dao.YiqingzhishiDao;
import com.entity.YiqingzhishiEntity;
import com.service.YiqingzhishiService;
import com.entity.vo.YiqingzhishiVO;
import com.entity.view.YiqingzhishiView;

@Service("yiqingzhishiService")
public class YiqingzhishiServiceImpl extends ServiceImpl<YiqingzhishiDao, YiqingzhishiEntity> implements YiqingzhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiqingzhishiEntity> page = this.selectPage(
                new Query<YiqingzhishiEntity>(params).getPage(),
                new EntityWrapper<YiqingzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiqingzhishiEntity> wrapper) {
		  Page<YiqingzhishiView> page =new Query<YiqingzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiqingzhishiVO> selectListVO(Wrapper<YiqingzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiqingzhishiVO selectVO(Wrapper<YiqingzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiqingzhishiView> selectListView(Wrapper<YiqingzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiqingzhishiView selectView(Wrapper<YiqingzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
