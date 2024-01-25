package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Annotation3_1.xml");
		
		
		Employee e= (Employee) ctx.getBean("employee");
		

	}

}
