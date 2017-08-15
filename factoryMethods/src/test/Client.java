package test;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Test;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Test t=(Test) ac.getBean("t");
		Calendar c=(Calendar) ac.getBean("c");
		System.out.println("calendar implementation class object :"+c.getCalendarType());

	}

}
