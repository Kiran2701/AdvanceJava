package scope;

import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean
{
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("from initializing bean");
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

}
