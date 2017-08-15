package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;

public class Client {

	public static void main(String[] args) {
		String files[] = new String[] { "car.xml", "engine.xml" };
		ApplicationContext ac = new ClassPathXmlApplicationContext(files);
		Car c = (Car) ac.getBean("c");
		c.show();

	}

}
