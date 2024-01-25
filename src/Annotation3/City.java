package Annotation3;

import org.springframework.stereotype.Component;

@Component
public class City {

	private String cityName;

	public City() {
		System.out.println("Here is City class");
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + "]";
	}

}
