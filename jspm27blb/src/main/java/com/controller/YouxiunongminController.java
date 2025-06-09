package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YouxiunongminEntity;
import com.entity.view.YouxiunongminView;

import com.service.YouxiunongminService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 优秀农民
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-19 12:16:40
 */
@RestController
@RequestMapping("/youxiunongmin")
public class YouxiunongminController {
    @Autowired
    private YouxiunongminService youxiunongminService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YouxiunongminEntity youxiunongmin, 
		HttpServletRequest request){

        EntityWrapper<YouxiunongminEntity> ew = new EntityWrapper<YouxiunongminEntity>();
    	PageUtils page = youxiunongminService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxiunongmin), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YouxiunongminEntity youxiunongmin, HttpServletRequest request){
        EntityWrapper<YouxiunongminEntity> ew = new EntityWrapper<YouxiunongminEntity>();
    	PageUtils page = youxiunongminService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxiunongmin), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YouxiunongminEntity youxiunongmin){
       	EntityWrapper<YouxiunongminEntity> ew = new EntityWrapper<YouxiunongminEntity>();
      	ew.allEq(MPUtil.allEQMapPre( youxiunongmin, "youxiunongmin")); 
        return R.ok().put("data", youxiunongminService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YouxiunongminEntity youxiunongmin){
        EntityWrapper< YouxiunongminEntity> ew = new EntityWrapper< YouxiunongminEntity>();
 		ew.allEq(MPUtil.allEQMapPre( youxiunongmin, "youxiunongmin")); 
		YouxiunongminView youxiunongminView =  youxiunongminService.selectView(ew);
		return R.ok("查询优秀农民成功").put("data", youxiunongminView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YouxiunongminEntity youxiunongmin = youxiunongminService.selectById(id);
        return R.ok().put("data", youxiunongmin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YouxiunongminEntity youxiunongmin = youxiunongminService.selectById(id);
        return R.ok().put("data", youxiunongmin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YouxiunongminEntity youxiunongmin, HttpServletRequest request){
    	youxiunongmin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youxiunongmin);

        youxiunongminService.insert(youxiunongmin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YouxiunongminEntity youxiunongmin, HttpServletRequest request){
    	youxiunongmin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youxiunongmin);

        youxiunongminService.insert(youxiunongmin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YouxiunongminEntity youxiunongmin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(youxiunongmin);
        youxiunongminService.updateById(youxiunongmin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        youxiunongminService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YouxiunongminEntity> wrapper = new EntityWrapper<YouxiunongminEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = youxiunongminService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
