package bean;

public class DemoBean {

	private String message;
	private String uname;
	private String pass;
	
	public DemoBean(String message){
		this.message = message;
	}
	
	public DemoBean(String uname, String pass) {
		this.uname = uname;
		this.pass = pass;
	}
	
	public void show(){
		System.out.println("message :"+message);
		System.out.println("username :"+uname+" , password :"+pass);
	}
	
}
