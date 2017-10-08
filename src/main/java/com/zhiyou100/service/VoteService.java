package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.Vote;

public interface VoteService {

	int voteTea(int id);
	
	List<Vote> listVote();
	
	List<Vote> listTopVote();
}
