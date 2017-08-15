package bean;

import org.springframework.beans.factory.annotation.Required;

public class Student {

	private int age;
	private String name;

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void show(){
		System.out.println("Name : " +name+" , Age:"+age);
	}

}
