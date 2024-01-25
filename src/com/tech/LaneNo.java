package com.tech;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class LaneNo {

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	LaneNo() {

		System.out.println("Hello im in LaneNo. class");
	}

	String fullAddress;

	public void myDetails() {

		System.out.println("I'm Swapnil");

		System.out.println("I'm From Latur");

		System.out.println("I'm Software Engineer");

	}

	public void m1() {

		System.out.println("I'm m1 method");

	}

	public void m2() {

		System.out.println("I'm m2 method");

	}
	
	public void m3() {

		System.out.println("I'm m3 method");

	}

}
