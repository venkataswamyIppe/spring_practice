package bean;

public class Car {
	
	private String carnames[];

	public void setCarnames(String[] carnames) {
		this.carnames = carnames;
	}
	
	public void show(){
		for(String car:carnames){
			System.out.println(car);
		}
	}

}
