package com.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class City {

	City() {
		System.out.println("Hello im in city. class");

	}

	@Autowired
	LaneNo l1;

	public void m1() {
		System.out.println("Hello im in city.m1 class");

		l1.m1();
	}

	public void m2() {
		System.out.println("Hello im in city.m2 class");

		l1.m2();

	}

	public void m3() {
		System.out.println("Hello im in city.m3 class");

		l1.m3();

	}

}
