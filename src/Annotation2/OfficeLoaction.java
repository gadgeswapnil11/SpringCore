package Annotation2;

public class OfficeLoaction {
	private String officeplace;

	
	public OfficeLoaction(){   
		
		System.out.println("Inside OfficeLoactions");
	}

	public String getOfficeplace() {
		return officeplace;
	}
	
	public void setOfficeplace(String officeplace) {
		this.officeplace = officeplace;
	}

	@Override
	public String toString() {
		return "OfficeLoaction [officeplace=" + officeplace + "]";
	}

	
}
