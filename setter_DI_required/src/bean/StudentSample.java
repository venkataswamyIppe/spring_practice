package bean;

import org.springframework.beans.factory.annotation.Required;

public class StudentSample {

	private int age;
	private String name;

	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setAge(int age) {
		this.age = age;
	}

	public void show(){
		System.out.println("studentName : " +name+" , Age:"+age);
	}
}
