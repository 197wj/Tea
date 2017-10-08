package com.zhiyou100.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.zhiyou100.model.Tea;
import com.zhiyou100.vo.TeaSortVo;

@Component
public interface TeaDao {

	int addTea(Tea tea);
	
	String getGradeName(long id);
	
	Tea getTea(long id);
	
	List<Tea> listTea(TeaSortVo teaSortVo);
	
	int getTeaCount();
	
	int getGradeNumber(int gradeId);
}
