package com.dao;

import com.entity.YouxiunongminEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxiunongminVO;
import com.entity.view.YouxiunongminView;


/**
 * 优秀农民
 * 
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
public interface YouxiunongminDao extends BaseMapper<YouxiunongminEntity> {
	
	List<YouxiunongminVO> selectListVO(@Param("ew") Wrapper<YouxiunongminEntity> wrapper);
	
	YouxiunongminVO selectVO(@Param("ew") Wrapper<YouxiunongminEntity> wrapper);
	
	List<YouxiunongminView> selectListView(@Param("ew") Wrapper<YouxiunongminEntity> wrapper);

	List<YouxiunongminView> selectListView(Pagination page,@Param("ew") Wrapper<YouxiunongminEntity> wrapper);
	
	YouxiunongminView selectView(@Param("ew") Wrapper<YouxiunongminEntity> wrapper);
	
}
