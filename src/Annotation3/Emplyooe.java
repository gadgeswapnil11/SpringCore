package Annotation3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Emplyooe {
	
	
	public	Emplyooe(){
	System.out.println("Employee class here");	
	}

	private String id;

	@Autowired
	private Address address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emplyooe [id=" + id + ", address=" + address + "]";
	}

}
