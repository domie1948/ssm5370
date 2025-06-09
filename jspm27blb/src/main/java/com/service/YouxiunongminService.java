package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxiunongminEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxiunongminVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxiunongminView;


/**
 * 优秀农民
 *
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
public interface YouxiunongminService extends IService<YouxiunongminEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxiunongminVO> selectListVO(Wrapper<YouxiunongminEntity> wrapper);
   	
   	YouxiunongminVO selectVO(@Param("ew") Wrapper<YouxiunongminEntity> wrapper);
   	
   	List<YouxiunongminView> selectListView(Wrapper<YouxiunongminEntity> wrapper);
   	
   	YouxiunongminView selectView(@Param("ew") Wrapper<YouxiunongminEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxiunongminEntity> wrapper);
   	
}

