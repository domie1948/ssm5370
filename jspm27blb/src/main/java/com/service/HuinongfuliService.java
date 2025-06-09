package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuinongfuliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuinongfuliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuinongfuliView;


/**
 * 惠农福利
 *
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
public interface HuinongfuliService extends IService<HuinongfuliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuinongfuliVO> selectListVO(Wrapper<HuinongfuliEntity> wrapper);
   	
   	HuinongfuliVO selectVO(@Param("ew") Wrapper<HuinongfuliEntity> wrapper);
   	
   	List<HuinongfuliView> selectListView(Wrapper<HuinongfuliEntity> wrapper);
   	
   	HuinongfuliView selectView(@Param("ew") Wrapper<HuinongfuliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuinongfuliEntity> wrapper);
   	
}

