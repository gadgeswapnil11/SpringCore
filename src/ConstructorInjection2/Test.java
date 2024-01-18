package ConstructorInjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("ConstructorSecondaryType.xml");
		Employee e1=(Employee)ctx.getBean("emp2"); 
		 System.out.println(e1);
		 System.out.println(e1.getId());
		 System.out.println(e1.getLastName());
		 System.out.println(e1.getName());
		 System.out.println(e1.getAdd());
		 



		
	}

}
