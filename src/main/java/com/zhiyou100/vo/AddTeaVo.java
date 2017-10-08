package com.zhiyou100.vo;

public class AddTeaVo {

	private int code;
	
	private double[] similar;
	
	private String grade;

	public AddTeaVo() {
		super();
	}

	public AddTeaVo(int code, double[] similar, String grade) {
		super();
		this.code = code;
		this.similar = similar;
		this.grade = grade;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double[] getSimilar() {
		return similar;
	}

	public void setSimilar(double[] similar) {
		this.similar = similar;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
