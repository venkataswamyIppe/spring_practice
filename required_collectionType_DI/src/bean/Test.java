package bean;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;


public class Test {

	private Vector fruits;
	private TreeSet criketers;
	private  Hashtable countrysCapitals;

	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}

	public void setCriketers(TreeSet criketers) {
		this.criketers = criketers;
	}

	public void setCountrysCapitals(Hashtable countrysCapitals) {
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
			System.out.println("country: "+key+" & capital :"+countrysCapitals.get(key));
		}
	}
}
