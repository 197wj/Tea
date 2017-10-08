package com.zhiyou100.model;

public class Vote {
	
	private Integer id;
	
	private String name;
	
	private String image;
	
	private Integer votes;

	public Vote() {
		super();
	}

	public Vote(Integer id, String name, String image, Integer votes) {
		super();
		this.id = id;
		this.name = name;
		this.votes = votes;
		this.image = image;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", name=" + name + ", votes=" + votes + ", image=" + image + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
