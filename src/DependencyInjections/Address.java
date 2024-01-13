package DependencyInjections;

public class Address {

	
	private String state;
	private City city;
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + "]";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}


	
	
}
