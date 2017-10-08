package com.zhiyou100.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Tea {

	/**
	 * 茶葉的主鍵
	 */
	private Long id;
	
	/**
	 * 茶葉的名字
	 */
	private String name;
	
	/**
	 * 形狀
	 */
	private double shape;
	
	/**
	 * 色泽
	 */
	private double color;
	
	/**
	 * 净度
	 */
	private double clarity;
	
	/**
	 * 汤色
	 */
	private double tang;
	
	/**
	 * 香气
	 */
	private double aroma;
	
	/**
	 * 滋味
	 */
	private double taste;
	
	/**
	 * 叶底
	 */
	private double leaf;
	
	/**
	 * 茶叶的等级id
	 */
	private Integer gradeId;
	
	/**
	 * 等级名称
	 */
	private String gradeName;
	
	/**
	 * 茶叶添加时间
	 */
	// 客户端发送给服务器的时间格式
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	// 服务器发送给客户端的时间格式
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Shanghai") 
	private Date gmtCreat;
	
	@Override
	public String toString() {
		return "Tea [id=" + id + ", name=" + name + ", shape=" + shape + ", color=" + color + ", clarity=" + clarity
				+ ", tang=" + tang + ", aroma=" + aroma + ", taste=" + taste + ", leaf=" + leaf + ", gradeId=" + gradeId
				+ ", gradeName=" + gradeName + ", gmtCreat=" + gmtCreat + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getShape() {
		return shape;
	}

	public void setShape(double shape) {
		this.shape = shape;
	}

	public double getColor() {
		return color;
	}

	public void setColor(double color) {
		this.color = color;
	}

	public double getClarity() {
		return clarity;
	}

	public void setClarity(double clarity) {
		this.clarity = clarity;
	}

	public double getTang() {
		return tang;
	}

	public void setTang(double tang) {
		this.tang = tang;
	}

	public double getAroma() {
		return aroma;
	}

	public void setAroma(double aroma) {
		this.aroma = aroma;
	}

	public double getTaste() {
		return taste;
	}

	public void setTaste(double taste) {
		this.taste = taste;
	}

	public double getLeaf() {
		return leaf;
	}

	public void setLeaf(double leaf) {
		this.leaf = leaf;
	}

	public Integer getGradeId() {
		return gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public Date getGmtCreat() {
		return gmtCreat;
	}

	public void setGmtCreat(Date gmtCreat) {
		this.gmtCreat = gmtCreat;
	}
}
