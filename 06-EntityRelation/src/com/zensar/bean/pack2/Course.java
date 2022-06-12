package com.zensar.bean.pack2;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="course10")

public  class Course {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int courceId;
	
	@Column
	String courceName;
	
	@Column
	double fees;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="c_id")
	Set<Subject> subjects;


	public Course(String courceName, double fees, Set<Subject> subjects) {
		super();
		this.courceName = courceName;
		this.fees = fees;
		this.subjects = subjects;
	}


	public Course() {
		super();
	}


	public int getCourceId() {
		return courceId;
	}


	public void setCourceId(int courceId) {
		this.courceId = courceId;
	}


	public String getCourceName() {
		return courceName;
	}


	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}


	public double getFees() {
		return fees;
	}


	public void setFees(double fees) {
		this.fees = fees;
	}


	public Set<Subject> getSubjects() {
		return subjects;
	}


	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}


	@Override
	public String toString() {
		return "Course [courceId=" + courceId + ", courceName=" + courceName + ", fees=" + fees + ", subjects="
				+ subjects + "]";
	}
	
}
