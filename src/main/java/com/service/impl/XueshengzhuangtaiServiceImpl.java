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


import com.dao.XueshengzhuangtaiDao;
import com.entity.XueshengzhuangtaiEntity;
import com.service.XueshengzhuangtaiService;
import com.entity.vo.XueshengzhuangtaiVO;
import com.entity.view.XueshengzhuangtaiView;

@Service("xueshengzhuangtaiService")
public class XueshengzhuangtaiServiceImpl extends ServiceImpl<XueshengzhuangtaiDao, XueshengzhuangtaiEntity> implements XueshengzhuangtaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengzhuangtaiEntity> page = this.selectPage(
                new Query<XueshengzhuangtaiEntity>(params).getPage(),
                new EntityWrapper<XueshengzhuangtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengzhuangtaiEntity> wrapper) {
		  Page<XueshengzhuangtaiView> page =new Query<XueshengzhuangtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengzhuangtaiVO> selectListVO(Wrapper<XueshengzhuangtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengzhuangtaiVO selectVO(Wrapper<XueshengzhuangtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengzhuangtaiView> selectListView(Wrapper<XueshengzhuangtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengzhuangtaiView selectView(Wrapper<XueshengzhuangtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
