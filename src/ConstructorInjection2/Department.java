package ConstructorInjection2;

public class Department {

	String designation;
	String departMent;

	public String getDesignation() {
		return designation;
	}

	@Override
	public String toString() {
		return "Department [designation=" + designation + ", departMent=" + departMent + "]";
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartMent() {
		return departMent;
	}

	public void setDepartMent(String departMent) {
		this.departMent = departMent;
	}

}
