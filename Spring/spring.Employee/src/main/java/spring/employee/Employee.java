package spring.employee;

public class Employee 
{
	 
	 public int id;
	 public String name;
	 public int salary;
	 public Department department;
	 
	 public Employee(Department department)
	 {
		 this.department=department;
		 
	 }
	 
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	 
	 
	 @Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
		}

}
