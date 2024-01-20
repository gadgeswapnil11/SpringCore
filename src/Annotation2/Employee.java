package Annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	public Employee(){
		
		System.out.println("Inside Employee");
		
	}
private String name;
private String Lname;

@Autowired
@Qualifier(value="add")
private Address address;
@Autowired
@Qualifier(value="dept")
private Dept dept;  

public Dept getDept() {
	return dept;
}

public void setDept(Dept dept) {
	this.dept = dept;
}

public OfficeLoaction getOfficeLocation() {
	return officeLocation;
}

public void setOfficeLocation(OfficeLoaction officeLocation) {
	this.officeLocation = officeLocation;
}
@Autowired
private OfficeLoaction officeLocation;

@Override
public String toString() {
	return "Employee [name=" + name + ", Lname=" + Lname + ", address=" + address + ", dept=" + dept
			+ ", officeLocation=" + officeLocation + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLname() {
	return Lname;
}

public void setLname(String lname) {
	Lname = lname;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}



}
