package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Student;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Student st = (Student) ac.getBean("stud");
		((AbstractApplicationContext) ac).close();
	}


}
