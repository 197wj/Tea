package com.zhiyou100.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.model.Vote;
import com.zhiyou100.service.VoteService;
import com.zhiyou100.vo.ResponseVo;

@RestController
public class VoteController {

	@Autowired
	private VoteService service;
	
	@RequestMapping(path="/listVote", method=RequestMethod.GET)
	public ResponseVo<List<Vote>> listVote(){
		
		List<Vote> list = service.listVote();
		
		return new ResponseVo<List<Vote>>(0, "查询成功", list);
	}
	
	@RequestMapping(path="/listTopVote", method=RequestMethod.GET)
	public ResponseVo<List<Vote>> listTopVote(){
		
		return new ResponseVo<List<Vote>>(0, "", service.listTopVote());
	}
	
	@RequestMapping(path="/vote/{id}", method=RequestMethod.GET)
	public ResponseVo<String> voteTea(@PathVariable("id") int id){
		
		int number = service.voteTea(id);
		
		if(number == 1){
			
			return new ResponseVo<String>(0, "投票成功", "");
		}else{
			
			return new ResponseVo<String>(-1, "投票失败", "");
		}
		
	}
	
	@RequestMapping(path="/login",method=RequestMethod.POST)
	public ResponseVo<String> checkPhone(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		session.setAttribute("user", "user");
		
		return new ResponseVo<String>(0,"登录成功", null);
	}
}
