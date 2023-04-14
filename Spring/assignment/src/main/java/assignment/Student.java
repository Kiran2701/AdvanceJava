package assignment;

public class Student 
{
	public int id;
	public String name;
	public String city;
	public Address address;
	public College college;
	
	public Student()
	{
		
	}
	
	public Student(Address address)
	{
		this.address=address;
		
	}
    public Student(College college)
    {
    	this.college=college;
		
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + ", college="
				+ college + "]";
	}

	
}
