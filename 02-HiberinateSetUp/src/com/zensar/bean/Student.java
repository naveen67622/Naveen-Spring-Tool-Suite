package com.zensar.bean;

public class Student {
	private int student_id;
	private String name;
	private String subject;
	private int marks;
	private char grade;
	
	
	public Student(int student_id, String name, String subject, int marks, char grade) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
		this.grade = grade;
	}
	public Student() {
		
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", subject=" + subject + ", marks=" + marks
				+ ", grade=" + grade + "]";
	}
	

	}
	
	
	
	


