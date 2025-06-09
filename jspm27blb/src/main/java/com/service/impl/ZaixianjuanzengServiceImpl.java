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


import com.dao.ZaixianjuanzengDao;
import com.entity.ZaixianjuanzengEntity;
import com.service.ZaixianjuanzengService;
import com.entity.vo.ZaixianjuanzengVO;
import com.entity.view.ZaixianjuanzengView;

@Service("zaixianjuanzengService")
public class ZaixianjuanzengServiceImpl extends ServiceImpl<ZaixianjuanzengDao, ZaixianjuanzengEntity> implements ZaixianjuanzengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixianjuanzengEntity> page = this.selectPage(
                new Query<ZaixianjuanzengEntity>(params).getPage(),
                new EntityWrapper<ZaixianjuanzengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixianjuanzengEntity> wrapper) {
		  Page<ZaixianjuanzengView> page =new Query<ZaixianjuanzengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixianjuanzengVO> selectListVO(Wrapper<ZaixianjuanzengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixianjuanzengVO selectVO(Wrapper<ZaixianjuanzengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixianjuanzengView> selectListView(Wrapper<ZaixianjuanzengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixianjuanzengView selectView(Wrapper<ZaixianjuanzengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
