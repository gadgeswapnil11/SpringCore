package ConstructorInjection2;

public class Company {
	String companyName;
	Department department;

	public Company(String companyName, Department department) {
		super();
		this.companyName = companyName;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", department=" + department + "]";
	}

}
