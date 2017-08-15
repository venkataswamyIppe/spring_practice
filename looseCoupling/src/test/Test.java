package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Traveller;

public class Test {

	public static void main(String[] args) {
		
/*		String[] files=new String[]{"spring.xml","springconfig.xml"};*/
		ApplicationContext ac=new ClassPathXmlApplicationContext("springconfig.xml");
		Traveller t=(Traveller) ac.getBean("t");
		t.startJourney();
		
		
		
		
	}

}
