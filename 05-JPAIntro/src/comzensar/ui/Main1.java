package comzensar.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.zensar.bean.Person;

public class Main1 {
	static void insert() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em= emf.createEntityManager();
		
		Person person=new Person();
		person.setName("Rahul");
		person.setSalary(350000);
		
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
		
	}
	static void load() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em= emf.createEntityManager();
		Person person=em.find(Person.class,9);
		System.out.println(person);
		
	}
	static void editing() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em= emf.createEntityManager();
		
		Person person = em.find(Person.class, 9);
		person.setId(2);
		
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		
	}
	static void deleteing() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em= emf.createEntityManager();
		
				Person person = em.find(Person.class, 9);
				
				
				em.getTransaction().begin();
				em.remove(person);
				em.getTransaction().commit();
	}
	
	


	public static void main(String[] args) {
		insert();
		

	}

}
