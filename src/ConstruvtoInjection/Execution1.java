package ConstruvtoInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execution1 {

	public static void main(String[] args) {

		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Constructor.xml");
		Emplyoess e1=(Emplyoess)ctx.getBean("empl1");
		Emplyoess e2=(Emplyoess)ctx.getBean("empl2");
		Emplyoess e3=(Emplyoess)ctx.getBean("empl3");
		Emplyoess e4=(Emplyoess)ctx.getBean("empl4");
	
		System.out.println(e1); //single parameter
		System.out.println(e2);  //single parameter with Type
		System.out.println(e3);  // 2's Parameter with Index
		System.out.println(e4);  // 3 Parameter with Index & type

	}

}
