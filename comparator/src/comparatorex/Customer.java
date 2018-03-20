package comparatorex;

public class Customer {
	private Integer Id;
	private Integer age;
	private String firstName;
	private String lastName;
	
public Customer(Integer id, Integer age, String firstName, String lastName) {
		super();
		this.Id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Integer getId() {
				return Id;
	}
	public Integer setid(Integer id) {
		
		return Id=id;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age=age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstname(String firstName) {
		this.firstName=firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastname(String lastname) {
		this.lastName=lastName;
		
		
	}
	@Override
	public String toString() {
		return "Customer[Id="+Id+",age="+age+",firstName="+firstName+",lastName="+lastName+"]";
	}
}