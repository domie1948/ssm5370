package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FupinjihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FupinjihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FupinjihuaView;


/**
 * 扶贫计划
 *
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
public interface FupinjihuaService extends IService<FupinjihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FupinjihuaVO> selectListVO(Wrapper<FupinjihuaEntity> wrapper);
   	
   	FupinjihuaVO selectVO(@Param("ew") Wrapper<FupinjihuaEntity> wrapper);
   	
   	List<FupinjihuaView> selectListView(Wrapper<FupinjihuaEntity> wrapper);
   	
   	FupinjihuaView selectView(@Param("ew") Wrapper<FupinjihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FupinjihuaEntity> wrapper);
   	
}

