package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Profile;

public class MainApp {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"student.xml");

		Profile profile = (Profile) context.getBean("profile");
		profile.printAge();
		profile.printName();
	}

}
