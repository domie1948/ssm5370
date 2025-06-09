package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyuanzhebaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyuanzhebaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuanzhebaomingView;


/**
 * 志愿者报名
 *
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
public interface ZhiyuanzhebaomingService extends IService<ZhiyuanzhebaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuanzhebaomingVO> selectListVO(Wrapper<ZhiyuanzhebaomingEntity> wrapper);
   	
   	ZhiyuanzhebaomingVO selectVO(@Param("ew") Wrapper<ZhiyuanzhebaomingEntity> wrapper);
   	
   	List<ZhiyuanzhebaomingView> selectListView(Wrapper<ZhiyuanzhebaomingEntity> wrapper);
   	
   	ZhiyuanzhebaomingView selectView(@Param("ew") Wrapper<ZhiyuanzhebaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuanzhebaomingEntity> wrapper);
   	
}

