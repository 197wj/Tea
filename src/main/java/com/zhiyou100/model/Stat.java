package com.zhiyou100.model;

public class Stat {

	/**
	 * 統計表主鍵
	 */
	private Long id;

	/**
	 * 茶葉的id
	 */
	private Long teaId;

	/**
	 * 茶葉的名字
	 */
	private String teaName;

	/**
	 * 等級id
	 */
	private int gradeId;

	/**
	 * 等級名稱
	 */
	private String gradeName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTeaId() {
		return teaId;
	}

	public void setTeaId(Long teaId) {
		this.teaId = teaId;
	}

	public String getTeaName() {
		return teaName;
	}

	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}

	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

}
