package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Test;

public class ScopeSingleton {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("scope_singleton.xml");
		Test t1 = (Test) ac.getBean("t");
		t1.hello();
		Test t2 = (Test) ac.getBean("t");
		t2.hello();
		System.out.println("both object reference are same:"+(t1 == t2));
	}
}
