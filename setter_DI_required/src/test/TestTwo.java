package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Student;


public class TestTwo {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Student d=(Student) ac.getBean("student");
		d.show();
		

	}

}
