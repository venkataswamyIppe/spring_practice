package bean;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StatesAndCapital {
	
	private Map statesCapitals;

	public void setStatesCapitals(Map statesCapitals) {
		this.statesCapitals = statesCapitals;
	}

	public void printData(){
		Set s=statesCapitals.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()){
			Map.Entry me=(Map.Entry) it.next();
			System.out.println("state :"+me.getKey()+" , capital :"+me.getValue());
		}
	}
}
