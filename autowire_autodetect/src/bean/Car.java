package bean;

public class Car {

	private Engine engine;

	// generate constructor
	public Car(Engine engine) {
		System.out.println("car parameterized constructor");
		this.engine = engine;
	}

	public void show() {
		System.out.println("Engine modelyear :" + engine.getModelYear());
	}

}
