package SingletonPrototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx= new ClassPathXmlApplicationContext("SingletonePrototype.xml");
		
		
		Student  s= ctx.getBean("s",Student.class);
		System.out.println(s);
		
		
		Student  s1= ctx.getBean("s",Student.class);
		System.out.println(s1);
		
		Student  s2= ctx.getBean("s",Student.class);
		System.out.println(s2);
		
		Student  s3= ctx.getBean("s",Student.class);
		System.out.println(s3);
		
		System.out.println( "Here Start Prototype ");
		
		Employee  e= ctx.getBean("e",Employee.class);
		System.out.println(e);
		
		
		Employee  e1= ctx.getBean("e",Employee.class);
		System.out.println(e1);
		
		
		Employee  e2= ctx.getBean("e",Employee.class);
		System.out.println(e2);
		
		Employee  e3= ctx.getBean("e",Employee.class);
		System.out.println(e3);
		
	}
	
	
	

}
