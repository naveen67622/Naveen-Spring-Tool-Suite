package com.zensar.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="doctors10")
@NamedQueries(
        {
        @NamedQuery(name="findAll", query = "select d from Doctor d"),
        @NamedQuery(name="findById", query = "select d from Doctor d where d.id=:searchId"),
        @NamedQuery(name="updateFees", query = "update Doctor set fees=fees+200"),

        }
)

@NamedNativeQueries({
    @NamedNativeQuery(name = "readAll", query = "select * from doctors10", resultClass =Doctor.class),
    @NamedNativeQuery(name = "readById", query = "select * from doctors10 where id=?", resultClass =Doctor.class)
	}
)

public class Doctor {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String name;
	double fees;
	String gender;
	
	LocalDate persisingSince;
	public Doctor(String name, double fees, String gender, LocalDate persisingSince) {
		super();
		this.name = name;
		this.fees = fees;
		this.gender = gender;
		this.persisingSince = persisingSince;
	}
	

	public Doctor() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getPersisingSince() {
		return persisingSince;
	}

	public void setPersisingSince(LocalDate persisingSince) {
		this.persisingSince = persisingSince;
	}

	@Override
	public String toString() {
		return "\n Doctor [id=" + id + ", name=" + name + ", fees=" + fees + ", gender=" + gender + ", persisingSince="
				+ persisingSince + "]";
	}

}
