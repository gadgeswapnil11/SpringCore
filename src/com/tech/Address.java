package com.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Address {
	
	
	Address(){
		System.out.println("Hello im in Address. class");
	}

	@Autowired
	City c1;

	public void m1() {
		System.out.println("Hello im in Address.m1 class");

		c1.m1();
	}

	public void m2() {
		System.out.println("Hello im in Address.m2 class");

		c1.m2();

	}

	public void m3() {
		System.out.println("Hello im in Address.m3 class");

		c1.m3();

	}

}
