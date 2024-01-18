package ConstructorInjection2;

public class Address {
	String state;
	City city;
	public Address(String state, City city) {
		super();
		this.state = state;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + "]";
	}

}
