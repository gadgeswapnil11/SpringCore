package Annotation3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {

	
	
	
	private String add;
	
	@Autowired
	private  City city;
	
	
public	Address(){
	System.out.println("Here is Address class");	
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}
	
	
	@Override
	public String toString() {
		return "Address [add=" + add + "]";
	}

}
