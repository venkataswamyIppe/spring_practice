package bean;

import javax.annotation.Resource;
import javax.inject.Named;

@Named
public class Car {
	
	@Resource
	private Engine engine;
	
	public void show(){
		System.out.println("car engine modelYear :"+engine.getModelYear());
	}

}
