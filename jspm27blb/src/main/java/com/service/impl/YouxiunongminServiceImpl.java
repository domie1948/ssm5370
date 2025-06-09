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


import com.dao.YouxiunongminDao;
import com.entity.YouxiunongminEntity;
import com.service.YouxiunongminService;
import com.entity.vo.YouxiunongminVO;
import com.entity.view.YouxiunongminView;

@Service("youxiunongminService")
public class YouxiunongminServiceImpl extends ServiceImpl<YouxiunongminDao, YouxiunongminEntity> implements YouxiunongminService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxiunongminEntity> page = this.selectPage(
                new Query<YouxiunongminEntity>(params).getPage(),
                new EntityWrapper<YouxiunongminEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxiunongminEntity> wrapper) {
		  Page<YouxiunongminView> page =new Query<YouxiunongminView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxiunongminVO> selectListVO(Wrapper<YouxiunongminEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxiunongminVO selectVO(Wrapper<YouxiunongminEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxiunongminView> selectListView(Wrapper<YouxiunongminEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxiunongminView selectView(Wrapper<YouxiunongminEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
