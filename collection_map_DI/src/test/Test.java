package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.StatesAndCapital;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		StatesAndCapital sc= (StatesAndCapital) ac.getBean("sc");
		sc.printData();
	}

}
