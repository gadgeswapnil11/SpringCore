package ConstructorInjection2;

public class Employee {
	int id;
	String name;
	String lastName;

	Address add;

	
	
	public Employee (){
		System.out.println("Frsit step completed ypou are in Employee class");
	}
	
	public Employee(int id, String name, String lastName, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.add = add;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Employee(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", add=" + add + "]";
	}

	
}
