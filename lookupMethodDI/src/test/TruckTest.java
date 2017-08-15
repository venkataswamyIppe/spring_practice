package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Bus;
import bean.Truck;

public class TruckTest {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("truck.xml");
		Truck  tk=(Truck) ac.getBean("t");
		System.out.println("truck concrete class name :"+tk.getClass().getCanonicalName());
		System.out.println("truck  engine name :"+tk.myTruckEngine().getEngineName());

	}

}
