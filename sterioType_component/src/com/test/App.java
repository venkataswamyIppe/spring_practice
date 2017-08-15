package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.customer.CustomerService;



public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-autoScan.xml" });

		CustomerService cust = (CustomerService) context
				.getBean("customerService");
		System.out.println(cust);

	}

}
