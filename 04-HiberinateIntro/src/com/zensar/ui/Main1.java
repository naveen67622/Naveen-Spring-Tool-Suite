package com.zensar.ui;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.zensar.bean.Person;
import com.zensar.util.HibernateUtil;

public class Main1 {

	static void insert() {
		Person person = new Person();
		person.setName("rithika");
		person.setSalary(73000.00);
		
		Session session = null;
		HibernateUtil.init();
	session = HibernateUtil.getSession();
	
	Transaction tx = session.beginTransaction();
	session.save(person);
	tx.commit();
	
		
		HibernateUtil.cleanUp();
	}
	

	static void load() {
		Person person=null;
		Session session=null;
		HibernateUtil.init();
		session=HibernateUtil.getSession();
		
		person = session.load(Person.class, 3);
		
		System.out.println(person);
		
		HibernateUtil.cleanUp();
	}

		
		static void loadAll() {
			HibernateUtil.init();
			Session  session =HibernateUtil.getSession();
			
			String qry="from Person";// HQL QUERY
			Query query=session.createQuery(qry);
			List<Person> allPersons=query.list();
			System.out.println(allPersons);
			
			HibernateUtil.cleanUp();
			loadAll();
		}
		
	
			static void editing() {
				HibernateUtil.init();
				Session session=HibernateUtil.getSession();
			Person person =session.load(Person.class, 1);
			
			person.setSalary(25000);
			Transaction tx=session.beginTransaction();
			session.update(person);
			
			tx.commit();
			
			
			HibernateUtil.cleanUp();
			
			}
			static void deleting1() {
				
				HibernateUtil.init();
				Session session = HibernateUtil.getSession();
				
				Person person = session.load(Person.class, 2);
				 person.setSalary(45000);
				   
				 Transaction tx =session.beginTransaction();
				 session.delete(person);
				 tx.commit();
				 
				 HibernateUtil.cleanUp();
				 
			}
			public static void main(String[] args) {
				load();
			}
	
	}
		
		

		
		
	

