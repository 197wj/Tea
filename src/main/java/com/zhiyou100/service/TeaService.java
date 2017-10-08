package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.Tea;
import com.zhiyou100.vo.AddTeaVo;
import com.zhiyou100.vo.TeaSortVo;

public interface TeaService {

	AddTeaVo saveTea(Tea tea);
	
	Tea getTea(long id);
	
	List<Tea> listTea(TeaSortVo teaSortVo);
	
	int getPageCount(int pageSize);
	
	Integer[] getGradeNumber();
}
