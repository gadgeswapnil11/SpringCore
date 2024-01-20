package Annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Designations {
	
	private String designation;

	
	@Autowired
	private OfficeLoaction officeLocation;

	public Designations() {

		System.out.println("Inside Designations");

	}


	public OfficeLoaction getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(OfficeLoaction officeLocation) {
		this.officeLocation = officeLocation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Designations [designation=" + designation + "]";
	}

}
