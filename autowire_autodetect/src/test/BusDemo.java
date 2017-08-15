package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Bus;

public class BusDemo {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bus.xml");
		Bus b = (Bus) ac.getBean("b");
		b.show();
	}
}
