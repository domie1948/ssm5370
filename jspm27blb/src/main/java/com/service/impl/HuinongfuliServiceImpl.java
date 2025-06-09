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


import com.dao.HuinongfuliDao;
import com.entity.HuinongfuliEntity;
import com.service.HuinongfuliService;
import com.entity.vo.HuinongfuliVO;
import com.entity.view.HuinongfuliView;

@Service("huinongfuliService")
public class HuinongfuliServiceImpl extends ServiceImpl<HuinongfuliDao, HuinongfuliEntity> implements HuinongfuliService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuinongfuliEntity> page = this.selectPage(
                new Query<HuinongfuliEntity>(params).getPage(),
                new EntityWrapper<HuinongfuliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuinongfuliEntity> wrapper) {
		  Page<HuinongfuliView> page =new Query<HuinongfuliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuinongfuliVO> selectListVO(Wrapper<HuinongfuliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuinongfuliVO selectVO(Wrapper<HuinongfuliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuinongfuliView> selectListView(Wrapper<HuinongfuliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuinongfuliView selectView(Wrapper<HuinongfuliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
