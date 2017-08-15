package bean;

public class Car {

	private String carname;
	private Engine engine[];

	
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}
	
	public void show(){
		for(Engine engines:engine){
			System.out.println("car name: "+carname+", modelyear :"+engines.getModelYear());
		}
	}
}
