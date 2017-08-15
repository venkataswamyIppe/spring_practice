package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Test;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Test t1 = (Test) ac.getBean("t");
		Test t2 = (Test) ac.getBean("t");

		System.out.println("Both objects are same :" + (t1 == t2));

	}

}
