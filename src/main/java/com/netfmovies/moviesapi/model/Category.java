package com.netfmovies.moviesapi.model;

public class Category {
	int id;
	String category;
	String code;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Category(int id, String category, String code) {
		super();
		this.id = id;
		this.category = category;
		this.code = code;
	}
	
}
