package com.zhiyou100.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.TeaDao;
import com.zhiyou100.model.Tea;
import com.zhiyou100.service.TeaService;
import com.zhiyou100.vo.AddTeaVo;
import com.zhiyou100.vo.TeaSortVo;


@Service
public class TeaServiceImpl implements TeaService {

	@Autowired
	private TeaDao dao;
	
	public AddTeaVo saveTea(Tea tea) {
		
		List<Double[]> listScores = new ArrayList<Double[]>();

		Double[] t0 = {1d,0.9d,0.9d,0.9d,1d,1d,0.9d};
		Double[] t1 = {0.9d,0.8d,0.9d,0.9d,0.9d,0.9d,0.8d};
		Double[] t2 = {0.8d,0.7d,0.9d,0.8d,0.8d,0.7d,0.7d};
		Double[] t3 = {0.6d,0.5d,0.7d,0.6d,0.7d,0.7d,0.6d};
		Double[] t4 = {0.5d,0.4d,0.5d,0.5d,0.6d,0.6d,0.4d};
		Double[] t5 = {0.4d,0.3d,0.5d,0.4d,0.5d,0.5d,0.4d};
		Double[] t6 = {0.3d,0.2d,0.5d,0.2d,0.3d,0.3d,0.2d};
		listScores.add(0, t0);
		listScores.add(1, t1);
		listScores.add(2, t2);
		listScores.add(3, t3);
		listScores.add(4, t4);
		listScores.add(5, t5);
		listScores.add(6, t6);

		double[] similar = new double[7];
		
		for (int i = 0; i < listScores.size(); i++) {
			
			Double[] gradeScore = listScores.get(i);
			double x1 = tea.getShape();
			double y1 = gradeScore[0];
			double x2 = tea.getColor();
			double y2 = gradeScore[1];
			double x3 = tea.getClarity();
			double y3 = gradeScore[2];
			double x4 = tea.getTang();
			double y4 = gradeScore[3];
			double x5 = tea.getAroma();
			double y5 = gradeScore[4];
			double x6 = tea.getTaste();
			double y6 = gradeScore[5];
			double x7 = tea.getLeaf();
			double y7 = gradeScore[6];
			double a1 = x1 < y1 ? x1 : y1;
			double a2 = x2 < y2 ? x2 : y2;
			double a3 = x3 < y3 ? x3 : y3;
			double a4 = x4 < y4 ? x4 : y4;
			double a5 = x5 < y5 ? x5 : y5;
			double a6 = x6 < y6 ? x6 : y6;
			double a7 = x7 < y7 ? x7 : y7;
			
			similar[i] = 2.0*(a1+a2+a3+a4+a5+a6+a7)/(x1+y1+x2+y2+x3+y3+x4+y4+x5+y5+x6+y6+x7+y7);
		}

		double max = similar[0];
		
		int index = 0;
		
		for (int i = 0; i < similar.length; i++) {
			
			max = max > similar[i] ? max : similar[i];
			
			index = max > similar[i] ? index : i;
		}

		tea.setGradeId(index+1);
		
		int code = dao.addTea(tea);
		
		String gradeName = dao.getGradeName(tea.getId());
		
		tea.setGradeName(gradeName);
		
		return new AddTeaVo(code, similar, gradeName);
	}

	public Tea getTea(long id) {
		
		return dao.getTea(id);
	}

	public List<Tea> listTea(TeaSortVo teaSortVo) {

		return dao.listTea(teaSortVo);
	}

	public int getPageCount(int pageSize) {
		
		int m = dao.getTeaCount();
		
		int n = pageSize;
		
		return (m + n - 1) / n;
	}

	public Integer[] getGradeNumber() {
		
		Integer[] gradeNumber = new Integer[7];
		
		for(int i = 0; i < 7; i++){
			
			gradeNumber[i] = dao.getGradeNumber(i+1);
		}
		
		return gradeNumber;
	}

}
