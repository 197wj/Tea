package com.zhiyou100.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.zhiyou100.model.Vote;

@Component
public interface VoteDao {

	int updateVotes(int id);
	
	List<Vote> listVote();
	
	List<Vote> listTopVote();
}
