package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.TestOne;

public class ClientOne {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("springOne.xml");
		TestOne t=(TestOne) ac.getBean("t");
		t.show();

	}
}
