package bean;

public class Car {

	private static String carname;
	
	public static void setCarname(String carname){
		Car.carname=carname;
		
	}
	
	public void show(){
		System.out.println("car name :"+carname);
	}
}
