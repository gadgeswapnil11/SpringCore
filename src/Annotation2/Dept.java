package Annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Dept {

	public Dept() {

		System.out.println("Inside Dept");

	}

	private String dpetName;
	
	@Autowired
	@Qualifier(value="desig")
	private Designations designation;

	public String getDpetName() {
		return dpetName;
	}

	public void setDpetName(String dpetName) {
		this.dpetName = dpetName;
	}

	@Override
	public String toString() {
		return "Dept [dpetName=" + dpetName + ", designation=" + designation + "]";
	}

	public Designations getDesignation() {
		return designation;
	}

	public void setDesignation(Designations designation) {
		this.designation = designation;
	}
}
