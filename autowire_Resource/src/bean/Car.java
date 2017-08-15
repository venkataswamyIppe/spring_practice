package bean;

import javax.annotation.Resource;



public class Car {

	@Resource
	private Engine engine;

	public void show() {
		System.out.println("Car engine modelYear : " + engine.getModelYear());
	}

}
