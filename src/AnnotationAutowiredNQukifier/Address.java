package AnnotationAutowiredNQukifier;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	String city;
	
	@Autowired
	State state;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
}
