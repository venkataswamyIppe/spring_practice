package bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	private List fruits;
	private Set criketers;
	private Map countrysCapitals;

	public void setFruits(List fruits) {
		this.fruits = fruits;
	}

	public void setCriketers(Set criketers) {
		this.criketers = criketers;
	}

	public void setCountrysCapitals(Map countrysCapitals) {
		this.countrysCapitals = countrysCapitals;
	}

	public void show(){
		System.out.println("..fruits..");
		for(Object fruit:fruits){
			System.out.println(fruit);
		}
		System.out.println("..cricketers..");
		for(Object cricketer:criketers){
			System.out.println(cricketer);
		}
		System.out.println("..countries and capitals..");
		Set keys=countrysCapitals.keySet();
		for(Object key:keys){
			System.out.println("country: "+key+" capital :"+countrysCapitals.get(key));
		}
	}
}
