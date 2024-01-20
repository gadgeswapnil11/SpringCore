package Annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Address {

	public Address() {

		System.out.println("Inside Address");

	}

	private String cityname;
	public String getCityname() {
		return cityname;
	}


	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	@Autowired
	@Qualifier(value = "state1")
	private State state;

	@Override
	public String toString() {
		return "Address [cityname=" + cityname + ", state=" + state + "]";
	}


	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
