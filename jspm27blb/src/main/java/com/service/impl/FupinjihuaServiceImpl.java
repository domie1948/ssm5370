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


import com.dao.FupinjihuaDao;
import com.entity.FupinjihuaEntity;
import com.service.FupinjihuaService;
import com.entity.vo.FupinjihuaVO;
import com.entity.view.FupinjihuaView;

@Service("fupinjihuaService")
public class FupinjihuaServiceImpl extends ServiceImpl<FupinjihuaDao, FupinjihuaEntity> implements FupinjihuaService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FupinjihuaEntity> page = this.selectPage(
                new Query<FupinjihuaEntity>(params).getPage(),
                new EntityWrapper<FupinjihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FupinjihuaEntity> wrapper) {
		  Page<FupinjihuaView> page =new Query<FupinjihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FupinjihuaVO> selectListVO(Wrapper<FupinjihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FupinjihuaVO selectVO(Wrapper<FupinjihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FupinjihuaView> selectListView(Wrapper<FupinjihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FupinjihuaView selectView(Wrapper<FupinjihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
