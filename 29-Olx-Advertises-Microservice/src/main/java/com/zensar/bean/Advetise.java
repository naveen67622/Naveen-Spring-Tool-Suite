package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_advertise")
public class Advetise {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String category;
	private String description;
	private int createdDate;
	private int modofiedDate;
	private String status;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(int createdDate) {
		this.createdDate = createdDate;
	}
	public int getModofiedDate() {
		return modofiedDate;
	}
	public void setModofiedDate(int modofiedDate) {
		this.modofiedDate = modofiedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Advetise [id=" + id + ", category=" + category + ", description=" + description + ", createdDate="
				+ createdDate + ", modofiedDate=" + modofiedDate + ", status=" + status + "]";
	}
	

	

}
