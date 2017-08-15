package bean;

public class Bus {

	private Engine engine;

	// generate setter

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Bus(){
		System.out.println("bus default constructor");
	}
	// generate constructor
	public Bus(Engine engine) {
		System.out.println("bus parameterized constructor");
		this.engine = engine;
	}

	public void show() {
		System.out.println("Engine modelyear :" + engine.getModelYear());
	}
}
