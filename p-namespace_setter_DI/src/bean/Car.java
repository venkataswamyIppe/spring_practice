package bean;

public class Car {
	
	private String carname;

	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	public void show(){
		System.out.println("car name :"+carname);
	}
}
