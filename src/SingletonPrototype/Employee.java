package SingletonPrototype;

public class Employee {
	String id;
	String name;
	
	
	public Employee() {
		
		System.out.println("Here is  Employee  class");
		}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
