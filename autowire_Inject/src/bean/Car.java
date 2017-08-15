package bean;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	
	@Inject
	@Qualifier(value="e2")
	private Engine engine;
	
	public void show() {
		System.out.println("Car engine modelYear : " + engine.getModelYear());
	}
}
