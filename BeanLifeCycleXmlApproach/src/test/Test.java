package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.CustomGlobalLifeCycleMehodBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		CustomGlobalLifeCycleMehodBean bean = (CustomGlobalLifeCycleMehodBean) context
				.getBean("demoBean");
		((AbstractApplicationContext) context).close();
		

	}

}