package com.zhiyou100.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.model.Tea;
import com.zhiyou100.service.TeaService;
import com.zhiyou100.util.PageInfo;
import com.zhiyou100.vo.AddTeaVo;
import com.zhiyou100.vo.ResponseVo;
import com.zhiyou100.vo.TeaSortVo;

@RestController
public class TeaController {

	@Autowired
	private TeaService service;
	
	@RequestMapping(path="/addTea", method=RequestMethod.POST)
	public ResponseVo<AddTeaVo> addTea(@RequestBody Tea tea){
		
		AddTeaVo addTeaVo = service.saveTea(tea);
		
		return new ResponseVo<AddTeaVo>(0, "添加成功", addTeaVo);
	}
	
	@RequestMapping(path="/listTea", method=RequestMethod.POST)
	public ResponseVo<PageInfo<Tea>> listTea(@RequestBody TeaSortVo teaSortVo){
		
		int pageSize = teaSortVo.getPageSize();
		
		List<Tea> list = service.listTea(teaSortVo);
		
		int pageCount = service.getPageCount(pageSize);
		
		PageInfo<Tea> pageInfo = new PageInfo<Tea>(teaSortVo.getPageIndex(), pageCount, teaSortVo.getSortType(), list);
		
		return new ResponseVo<PageInfo<Tea>>(0, "", pageInfo);
	}
	
	@RequestMapping(path="/getTea/{id}", method=RequestMethod.GET)
	public ResponseVo<Tea> getTea(@PathVariable("id") long id){
		
		Tea tea = service.getTea(id);
		
		return new ResponseVo<Tea>(0, "", tea);
	}
	
	@RequestMapping(path="/statistics", method=RequestMethod.GET)
	public ResponseVo<Integer[]> getGradeCount(){
		
		Integer[] gradeNumber = service.getGradeNumber();
		
		return new ResponseVo<Integer[]>(0, "", gradeNumber);
	}
}
