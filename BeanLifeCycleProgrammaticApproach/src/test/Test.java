package test;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Student;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ConfigurableApplicationContext ca = new ClassPathXmlApplicationContext(
				"spring.xml");
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.println("Plz Enter 1 for Save and 2 for Close");
			int key = s.nextInt();
			switch (key) {
			case 1:
				Student st = (Student) ca.getBean("s");
				System.out.println("Plz Enter Id");
				int id = s.nextInt();
				System.out.println("Plz Enter Name");
				String name = s.next();
				System.out.println("Plz Enter Address");
				String address = s.next();
				st.save(id, name, address);
				break;
			default:
				ca.close();
				break;
			}

		}

	}

}
