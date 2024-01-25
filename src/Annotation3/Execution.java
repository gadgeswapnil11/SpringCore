package Annotation3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execution {
	
	
	public static void main(String[] args) {
		
		ApplicationContext  ctx= new ClassPathXmlApplicationContext("Annotation3.xml");
		
		
		Emplyooe e= (Emplyooe)ctx.getBean("emplyooe");
		
		System.out.println(e);
	}

}
