package Emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Testemp 
{
	public static void main(String[] args) 
	{
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Employee obj = new Employee();
		obj.setID(7);
		obj.setName("sana");
		obj.setSalary("45000");
		
		
		
		
		Integer val= (Integer)session.save(obj);
		
		session.getTransaction().commit();
		
		sessionFactory.close();
		session.close();
		
		System.out.println("Saved Employee ID is - "+val);
		
	}

}
