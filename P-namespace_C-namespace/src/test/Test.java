package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;
import bean.Engine;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
        Car c= (Car) context.getBean("c");
        c.show();
        
	}

}
