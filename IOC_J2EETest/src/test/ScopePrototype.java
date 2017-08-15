package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Test;

public class ScopePrototype {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("scope_prototype.xml");
		Test t1 = (Test) ac.getBean("t");
		Test t2 = (Test) ac.getBean("t");
		// by default scope is singleton
		System.out.println("both object reference are same:"+(t1 == t2));
		t1.hello();
		t2.hello();

	}

}
