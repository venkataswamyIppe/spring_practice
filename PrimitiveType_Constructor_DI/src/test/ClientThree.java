package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.TestTwo;

public class ClientThree {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("springThree.xml");
		TestTwo t=(TestTwo) ac.getBean("t");
		t.show();

	}
}
