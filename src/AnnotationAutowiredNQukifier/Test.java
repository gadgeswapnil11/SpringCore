package AnnotationAutowiredNQukifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("AutowireNQulifier.xml");
		
		Student s= (Student)ctx.getBean("student");
		System.out.println(s);

	}

}
