package Annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Subdist {
	private String subDistname;
	private String pincode;
	
	@Autowired
	@Qualifier(value="desig")
	private Designations designation;

	public Designations getDesignation() {
		return designation;
	}

	public void setDesignation(Designations designation) {
		this.designation = designation;
	}

	public Subdist() {

		System.out.println("Inside Subdist");

	}



	public String getSubDistname() {
		return subDistname;
	}

	public void setSubDistname(String subDistname) {
		this.subDistname = subDistname;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Subdist [subDistname=" + subDistname + ", pincode=" + pincode + "]";
	}
}
