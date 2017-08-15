package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Student;

public class StudentTest {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");

		Student student = (Student) context.getBean("student");

		System.out.println("student Name : " +student.getName());
		System.out.println("student Age : " + student.getAge());

		
	}

}
