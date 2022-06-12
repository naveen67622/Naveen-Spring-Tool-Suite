package comzensar.ui;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;

import com.zensar.bean.Employee;
import com.zensar.bean.Person;
import com.zensar.util.JPAUtil;

public class Main2 {
	static void insert() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		
		Employee employee=new Employee();
		employee.setName("seenuu");
		employee.setBasic(80000);
		employee.setGrade('A');
		employee.setDateOfJoin(LocalDate.of(2012, 8, 13));
		
		
		em.getTransaction().begin();
		
		em.persist(employee);
		
		em.getTransaction().commit();
		
		JPAUtil.shutDown();
	}
	static void load() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em= emf.createEntityManager();
		
		
		Employee employee=em.find(Employee.class,6);
		System.out.println(employee);
		
	}
	static void editing() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em= emf.createEntityManager();
		
		Employee employee = em.find(Employee.class, 6);
		employee.setName("Kumar");
		
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	static void deleteing() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em= emf.createEntityManager();
		
				Employee employee = em.find(Employee.class, 5);
				
				
				em.getTransaction().begin();
				em.remove(employee);
				em.getTransaction().commit();
				em.close();
				emf.close();
	
	}
	static void loadAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em= emf.createEntityManager();
		
		
		String qry="from Employee";
		Query query= em.createQuery(qry);
		List<Employee> allemployees=query.getResultList();
		System.out.println(allemployees);
		em.close();
		emf.close();
	
		
	}
	
		
		 public static void main(String[] args) {
			 editing();
			 
	}
	
}
	