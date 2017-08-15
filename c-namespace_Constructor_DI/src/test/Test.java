package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
        Student st=(Student) context.getBean("student");
        System.out.println("Student Name:"+ st.getName());
        System.out.println("City Nmae:"+st.getCity().getCityName());
        System.out.println("City Population:"+st.getCity().getPopulation()); 
	}

}
