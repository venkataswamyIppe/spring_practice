package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.CustomLifeCycleMethodBean;

public class TestCustomMethodLifeCycleBean {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		CustomLifeCycleMethodBean bean = (CustomLifeCycleMethodBean) context
				.getBean("customLifeCycleMethodBean");
		bean.show();
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
