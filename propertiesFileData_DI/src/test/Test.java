package test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.ConnectionPooling;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		ConnectionPooling cp= (ConnectionPooling) ac.getBean("cp");
		cp.createConnection();
	}

}
