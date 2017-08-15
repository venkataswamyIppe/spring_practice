package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Autowired
	@Qualifier(value="e1")
	private Engine engine;

	public void show() {
		System.out.println("Engine modelyear :" + engine.getModelYear());
	}

}
