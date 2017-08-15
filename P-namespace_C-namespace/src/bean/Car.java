package bean;

public class Car {

	private String carname;
	private Engine engine;

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public void show() {
		System.out.println("carname :" + carname + " , modelyear:"
				+ engine.getModelYear());
	}
}
