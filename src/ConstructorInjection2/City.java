package ConstructorInjection2;

public class City {
	String cityName;
	String pin;
	Company company;
	
	public	City (){
		System.out.println("Welcome to city of pune");
	}

	public City(String cityName, String pin, Company company) {
		super();
		this.cityName = cityName;
		this.pin = pin;
		this.company = company;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", pin=" + pin + ", company=" + company + "]";
	}
}
