package Annotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execution {

	
	public static void main(String[] args) {
	ApplicationContext ctx= new ClassPathXmlApplicationContext("AutowireNQulifierBean.xml");
	Employee e= (Employee)ctx.getBean("emp");  
	System.out.println(e);
	
	}
}   
     