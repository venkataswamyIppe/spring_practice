package bean;

public class TestThree {
	private String name;
	private int age;
	private String email;
	
	public TestThree(String name,String email,int age) {
		System.out.println("Test name,email,age consructor");
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public void show() {
		System.out.println("Name :" + name);
		System.out.println("email :" + email);
		System.out.println("age :" + age);
	}
}
