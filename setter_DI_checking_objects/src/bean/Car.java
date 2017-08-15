package bean;

public class Car {

	private String carname;
	private Engine engine;
	
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void show(){
			System.out.println("car name: "+carname+", modelyear :"+engine.getModelYear());
	}
	
}
