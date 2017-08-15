package bean;

public class Car {

	private Engine engine;

	// generate setter

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void show() {
		System.out.println("Engine modelyear :" + engine.getModelYear());
	}

}
