package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Bus;

public class BusTest {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("bus.xml");
		Bus b= (Bus) ac.getBean("b");
		System.out.println("bus abstract impl class name :"+b.getClass().getCanonicalName());
		System.out.println("bus engine name :"+b.myBusEngine().getEngineName());

	}

}
