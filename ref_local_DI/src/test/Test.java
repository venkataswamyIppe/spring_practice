package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.ExampleBean;
import bean.SampleBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		SampleBean sb=(SampleBean) ac.getBean("sb");
		sb.show();
		
		ExampleBean eb=(ExampleBean) ac.getBean("eb");
		eb.show();
		
		
		
	}

}
