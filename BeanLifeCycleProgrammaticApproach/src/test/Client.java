package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Sample;

public class Client {
	
	public static void main(String[] args)  throws Exception{           
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("sample.xml");
        Sample s= (Sample) context.getBean("s");
        s.getData();
       
 }

}
