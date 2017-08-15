package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.CompanyEx;


public class SpringDemo {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("company.xml");
		CompanyEx c=(CompanyEx) ac.getBean("c");
		System.out.println("company name:"+c.getName());
		System.out.println("company location:"+c.getLocation());

	}
}
