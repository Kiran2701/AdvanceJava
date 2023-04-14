package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DbconfigTest
{
	public static void main(String[] args) 
	{
		
		ApplicationContext context= new ClassPathXmlApplicationContext(" Beans.xml");
		
		Dbconfig config=(Dbconfig) context.getBean("dbconfig");
		System.out.println(config);
		
		((AbstractApplicationContext) context).registerShutdownHook();
		
	}

}
