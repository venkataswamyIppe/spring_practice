package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.DemoBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		DemoBean db1= (DemoBean) ac.getBean("db1");
		db1.show();
		System.out.println(db1);
		DemoBean db2= (DemoBean) ac.getBean("db2");
		db2.show();
		System.out.println(db2);
		
	}

}
