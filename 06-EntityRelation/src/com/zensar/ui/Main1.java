package com.zensar.ui;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import com.zensar.bean.pack1.ContactInfo;
import com.zensar.bean.pack1.Person;
import com.zensar.util.JPAUtil;

public class Main1 {
	
	static void test1() {
		Person person= new Person("Rajesh",LocalDate.of(1997,4,7),'B');
		person.setPersonId(1013);
		ContactInfo contactInfo= new ContactInfo("rajesh@gmail.com", "9885658768");
		person.setContactInfo(contactInfo);
		contactInfo.setPerson(person);
		
		
		EntityManager em =JPAUtil.createEntityManager("JPAIntro");
		
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
				
	}
	static void test2() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
				Person person=em.find(Person.class, 1012);
				System.out.println(person);
				JPAUtil.shutDown();
				
	}
	
	static void test3() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		ContactInfo contactInfo=em.find(ContactInfo.class,1011);
		System.out.println(contactInfo);
		System.out.println(contactInfo.getPerson());
		JPAUtil.shutDown();
		
			
	}
	
	public static void main(String[] args) {
		test2();

	}

}
