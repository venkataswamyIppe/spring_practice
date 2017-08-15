package bean;

public class TestOne {
	private String name;
	private int age;
	private String email;
	public TestOne(String name, int age, String email) {
		System.out.println("Test name,age,email consructor");
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
public void show(){
		System.out.println("Name :"+name);
		System.out.println("age :"+age);
		System.out.println("email :"+email);
	}
}
