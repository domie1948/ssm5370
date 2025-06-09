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


import com.dao.ZhiyuanzhebaomingDao;
import com.entity.ZhiyuanzhebaomingEntity;
import com.service.ZhiyuanzhebaomingService;
import com.entity.vo.ZhiyuanzhebaomingVO;
import com.entity.view.ZhiyuanzhebaomingView;

@Service("zhiyuanzhebaomingService")
public class ZhiyuanzhebaomingServiceImpl extends ServiceImpl<ZhiyuanzhebaomingDao, ZhiyuanzhebaomingEntity> implements ZhiyuanzhebaomingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuanzhebaomingEntity> page = this.selectPage(
                new Query<ZhiyuanzhebaomingEntity>(params).getPage(),
                new EntityWrapper<ZhiyuanzhebaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuanzhebaomingEntity> wrapper) {
		  Page<ZhiyuanzhebaomingView> page =new Query<ZhiyuanzhebaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiyuanzhebaomingVO> selectListVO(Wrapper<ZhiyuanzhebaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiyuanzhebaomingVO selectVO(Wrapper<ZhiyuanzhebaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiyuanzhebaomingView> selectListView(Wrapper<ZhiyuanzhebaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuanzhebaomingView selectView(Wrapper<ZhiyuanzhebaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
