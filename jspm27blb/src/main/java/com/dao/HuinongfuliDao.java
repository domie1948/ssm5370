package com.dao;

import com.entity.HuinongfuliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuinongfuliVO;
import com.entity.view.HuinongfuliView;


/**
 * 惠农福利
 * 
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
public interface HuinongfuliDao extends BaseMapper<HuinongfuliEntity> {
	
	List<HuinongfuliVO> selectListVO(@Param("ew") Wrapper<HuinongfuliEntity> wrapper);
	
	HuinongfuliVO selectVO(@Param("ew") Wrapper<HuinongfuliEntity> wrapper);
	
	List<HuinongfuliView> selectListView(@Param("ew") Wrapper<HuinongfuliEntity> wrapper);

	List<HuinongfuliView> selectListView(Pagination page,@Param("ew") Wrapper<HuinongfuliEntity> wrapper);
	
	HuinongfuliView selectView(@Param("ew") Wrapper<HuinongfuliEntity> wrapper);
	
}
