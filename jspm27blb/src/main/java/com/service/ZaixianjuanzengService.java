package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixianjuanzengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixianjuanzengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixianjuanzengView;


/**
 * 在线捐赠
 *
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
public interface ZaixianjuanzengService extends IService<ZaixianjuanzengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixianjuanzengVO> selectListVO(Wrapper<ZaixianjuanzengEntity> wrapper);
   	
   	ZaixianjuanzengVO selectVO(@Param("ew") Wrapper<ZaixianjuanzengEntity> wrapper);
   	
   	List<ZaixianjuanzengView> selectListView(Wrapper<ZaixianjuanzengEntity> wrapper);
   	
   	ZaixianjuanzengView selectView(@Param("ew") Wrapper<ZaixianjuanzengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixianjuanzengEntity> wrapper);
   	
}

