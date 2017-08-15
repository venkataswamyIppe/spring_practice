package bean;

public class Car {

	private Engine engine;
	private String carName;
	
	public Car(){
		System.out.println("car constructor");
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public void show(){
		System.out.println("car name:"+carName+" and model year :"+engine.getModelYear());
	}
}
