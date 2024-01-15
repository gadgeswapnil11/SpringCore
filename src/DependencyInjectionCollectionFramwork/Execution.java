package DependencyInjectionCollectionFramwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execution {

	public static void main(String[] args) {

		ApplicationContext apx=new ClassPathXmlApplicationContext("CollectionSpring.xml");
	Employee e= (Employee) apx.getBean("emp1");
	System.out.println(e);
//	System.out.println(e.getId());
//	System.out.println(e.getName());
//	System.out.println(e.getList());
//	System.out.println(e.getSet());
//	System.out.println(e.getMap());



	}

}
