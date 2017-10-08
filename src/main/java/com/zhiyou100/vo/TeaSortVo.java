package com.zhiyou100.vo;

/**
 * 统计页面展示的条件的封装
 * @author LE
 *
 */
public class TeaSortVo extends PageVo{
	
	/**
	 * 品级升序：0;降序：1
	 * 时间升序：2;降序：3
	 */
	private Integer sortType;

	public Integer getSortType() {
		return sortType;
	}

	public void setSortType(Integer sortType) {
		this.sortType = sortType;
	}
}
