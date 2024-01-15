package DependencyInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ExecutionClass {

	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("springCore.xml");
	
		Employee emp=(Employee) ctx.getBean("emp");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getEmail());
		System.out.println(emp.getAddress());
		System.out.println(emp.getAddress().getState());
		System.out.println(emp.getAddress().getCity().getDist());
		System.out.println(emp.getAddress().getCity().getPin());


		
	}

}
