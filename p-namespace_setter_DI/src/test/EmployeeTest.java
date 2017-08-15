package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;
import bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
			ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
			Employee employee=(Employee)ac.getBean("emp");
		    System.out.println("EmpName:"+employee.getEmpName());	     
		    System.out.println("EmpCompany:"+employee.getCompany().getName());
	}

}
