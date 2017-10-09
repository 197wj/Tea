package com.zhiyou100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.VoteDao;
import com.zhiyou100.model.Vote;
import com.zhiyou100.service.VoteService;

@Service
public class VoteServiceImpl implements VoteService {

	@Autowired
	private VoteDao dao;
	
	public int voteTea(int id) {

		return dao.updateVotes(id);
	}

	public List<Vote> listVote() {

		return dao.listVote();
	}

	public List<Vote> listTopVote() {

		return dao.listTopVote();
	}
}
