package com.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Employee {
	Employee() {
		System.out.println("Hello im in Employee. class");
	}

	@Autowired
	Address add;

	public void m1() {
		System.out.println("Hello im in city.m1 class");

		add.m1();
	}

	public void m2() {
		System.out.println("Hello im in city.m2 class");

		add.m2();

	}

	public void m3() {
		System.out.println("Hello im in city.m3 class");

		add.m3();

	}

	@Override
	public String toString() {
		return "Employee [add=" + add + "]";
	}

}
