package com.springassign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest
{
	public static void main(String[] args) {
		

	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	
	Employee emp=(Employee) context.getBean("jay");
	
	
	System.out.println(emp);


}
}