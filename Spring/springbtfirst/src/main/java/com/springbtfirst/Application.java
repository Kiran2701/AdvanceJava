package com.springbtfirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		Student student=(Student) context.getBean("john");
		System.out.println(student);
		
	}

}
