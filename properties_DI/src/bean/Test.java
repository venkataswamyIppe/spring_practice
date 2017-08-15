package bean;

import java.util.Properties;
import java.util.Set;

public class Test {

	private Properties drivers;
	
	public void setDrivers(Properties drivers) {
		this.drivers = drivers;
	}

	public void show(){
		Set keys=drivers.keySet();
		for(Object key:keys){
			System.out.println("Key :"+key+" & value:"+drivers.getProperty(key.toString()));
		}
	}
}
