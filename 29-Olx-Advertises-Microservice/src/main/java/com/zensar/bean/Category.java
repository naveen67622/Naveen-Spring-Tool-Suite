package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="advertises")
public class Category {
	private int id;
	private  String title;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", title=" + title + "]";
	}
	
	

}
