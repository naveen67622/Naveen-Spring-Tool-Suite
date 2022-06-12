package comzensar.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.zensar.bean.Address;
import com.zensar.bean.Student;
import com.zensar.util.JPAUtil;

public class Main3 {

	
	static void insert() {
		
	Address address=new Address("F-5","Golden Temple","Amrutsar");
	
	Student student = new Student();
	student.setRollNumber(1011);
	student.setName("Vamshi");
	
	student.setAddress(address);
	
	EntityManager em=JPAUtil.createEntityManager("JPAIntro");
	
	em.getTransaction().begin();
	em.persist(student);
	em.getTransaction().commit();
	
	JPAUtil.shutDown();
}
	static void load() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		Student student=em.find(Student.class, 1099);
		System.out.println(student);
		JPAUtil.shutDown();
	}
	
	static void editing() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		Student student=em.find(Student.class, 1098);
		student.setName(student.getName().toUpperCase());
		student.getAddress().setCityName("Hyderabad");
		
		em.getTransaction().begin();
		em.merge(student);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}
	static void deleting() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		Student student=em.find(Student.class, 1099);
		em.getTransaction().begin();
		em.remove(student);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}
	
	static void loadAll() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		String qry="from Student";
		Query query=em.createQuery(qry);
		List<Student> allstudents=query.getResultList();

		
		
	}
	
	
	public static void main(String[] args) {
		editing();

	}

	}
