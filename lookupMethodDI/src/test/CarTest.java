package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;

public class CarTest {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("car.xml");
		Car c=(Car) ac.getBean("c");
		System.out.println("car interface impl class name :"+c.getClass().getCanonicalName());
		System.out.println("car engine name :"+c.myCarEngine().getEngineName());

	}

}
