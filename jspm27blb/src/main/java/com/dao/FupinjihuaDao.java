package com.dao;

import com.entity.FupinjihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FupinjihuaVO;
import com.entity.view.FupinjihuaView;


/**
 * 扶贫计划
 * 
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
public interface FupinjihuaDao extends BaseMapper<FupinjihuaEntity> {
	
	List<FupinjihuaVO> selectListVO(@Param("ew") Wrapper<FupinjihuaEntity> wrapper);
	
	FupinjihuaVO selectVO(@Param("ew") Wrapper<FupinjihuaEntity> wrapper);
	
	List<FupinjihuaView> selectListView(@Param("ew") Wrapper<FupinjihuaEntity> wrapper);

	List<FupinjihuaView> selectListView(Pagination page,@Param("ew") Wrapper<FupinjihuaEntity> wrapper);
	
	FupinjihuaView selectView(@Param("ew") Wrapper<FupinjihuaEntity> wrapper);
	
}
