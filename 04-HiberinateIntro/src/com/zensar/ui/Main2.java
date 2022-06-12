package com.zensar.ui;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.bean.Employee;
import com.zensar.bean.Person;
import com.zensar.util.HibernateUtil;

public class Main2 {
	static void insert() {
		Employee employee=new Employee();
		employee.setName("Dravid");
		employee.setBasic(75000);
		employee.setDateOfJoin(LocalDate.of(2014, 11, 12));
		employee.setGrade('B');
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		session.save(employee);
		tx.commit();
		
		HibernateUtil.cleanUp();
	}
		static void editing() {
			HibernateUtil.init();
			Session session=HibernateUtil.getSession();
		Employee employee =session.load(Employee.class, 3);
		
		employee.setName("virat");
		Transaction tx=session.beginTransaction();
		session.update(employee);
		
		tx.commit();
		
		
		HibernateUtil.cleanUp();
		
		}
		static void deleting() {
			
			HibernateUtil.init();
			Session session = HibernateUtil.getSession();
			
			Employee employee = session.load(Employee.class, 2);
			 employee.setName("Mahesh");
			   
			 Transaction tx =session.beginTransaction();
			 session.delete(employee);
			 tx.commit();
			 
			 HibernateUtil.cleanUp();
			 
		}
		static void load() {
			Employee employee=null;
			Session session=null;
			HibernateUtil.init();
			session=HibernateUtil.getSession();
			
			employee = session.load(Employee.class, 3);
			
			System.out.println(employee);
			
			HibernateUtil.cleanUp();
		}
		static void loadAll() {
			HibernateUtil.init();
			Session  session =HibernateUtil.getSession();
			
			String qry="from Employee";// HQL QUERY
			Query query=session.createQuery(qry);
			List<Employee> allemployee=query.list();
			System.out.println(allemployee);
			
			HibernateUtil.cleanUp();
			
		}
		
		
	
	public static void main(String[] args) {
		loadAll();
	}
}

