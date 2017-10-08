package com.zhiyou100.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.model.Vote;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class VoteServiceTest {

	@Autowired
	private VoteService service;
	
	@Test
	public void testVoteTea() {
		
		int number = service.voteTea(4);
		
		System.out.println(number);
	}

	@Test
	public void testListVote() {
		
		List<Vote> list = service.listVote();
		
		for (Vote vote : list) {
			
			System.out.println(vote);
		}
	}

	@Test
	public void testListTopVote() {
		
		List<Vote> list = service.listTopVote();
		
		for (Vote vote : list) {
			
			System.out.println(vote);
		}
	}

}
