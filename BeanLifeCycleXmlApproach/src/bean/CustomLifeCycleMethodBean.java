package bean;

public class CustomLifeCycleMethodBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CustomLifeCycleMethodBean() {
		System.out.println("Constructor of  bean is called !! ");
	}

	public void customDestroy() throws Exception {

		System.out.println("custom destroy method of  bean is called !! ");
	}

	public void customInit() throws Exception {
		System.out.println("custom Init  method of  bean is called !! ");
	}

	public void show(){
		System.out.println("your name :"+getName());
	}
}
