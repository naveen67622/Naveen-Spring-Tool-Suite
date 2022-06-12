package com.zensar.ui;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.bean.Student;
import com.zensar.util.HibernateUtil;



public class Examresult {
	static void insert() {
		Student student = new Student();
		student.setName("Roshan");
		student.setSubject("chemistry");
		student.setMarks(95);
		student.setGrade('A');
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Transaction tx =session.beginTransaction();
		session.save(student);
		tx.commit();
		
		HibernateUtil.cleanUp();
		}
	
	

	public static void main(String[] args) {
		insert();

	}

}
