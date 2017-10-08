package com.zhiyou100.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.model.Tea;
import com.zhiyou100.service.TeaService;
import com.zhiyou100.vo.TeaSortVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class TeaServiceImplTest {
	
	@Autowired
	private TeaService service;

	@Test
	public void testSaveTea() {
		
		Tea tea = new Tea();
		
		tea.setName("西湖龙井");
		tea.setShape(1.0);
		tea.setColor(0.9);
		tea.setClarity(0.9);
		tea.setTang(0.9);
		tea.setAroma(0.9);
		tea.setTaste(0.9);
		tea.setLeaf(1.0);
		
		service.saveTea(tea);
		
		System.out.println(tea);
	}

	@Test
	public void testGetTea() {
		
		Tea tea = service.getTea(1);
		
		System.out.println(tea);
	}

	@Test
	public void testListTea() {
		
		TeaSortVo teaSortVo = new TeaSortVo();
		
		teaSortVo.setPageIndex(1);
		teaSortVo.setPageSize(4);
		teaSortVo.setSortType(3);
		
		List<Tea> listTeas = service.listTea(teaSortVo);
		
		for (Tea tea : listTeas) {
			
			System.out.println(tea);
		}
	}
	
	@Test
	public void testGetTeaCount() {
		
		int count = service.getPageCount(5);
		
		System.out.println(count);
	}
}
