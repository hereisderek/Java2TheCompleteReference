/**
	constructors:
		HashMap() / (Map m) / (int capacity [, float fillRation])
	implements Map extends AbstractMap
	doesn't guarantee the order
*/

import java.util.*;
class HashMapDemo{
	public static void main(String args[]){
		// Create a new HashMap
		HashMap hm = new HashMap();
		
		// Put elements to the map
	hm.put("John Doe", new Double(3434.34));
	hm.put("Tom Smith", new Double(123.22));
	hm.put("Jane Baker", new Double(1378.00));
	
	// get a set of the entries
	Set set = hm.entrySet();
	// get an iterator
	Iterator i = set.iterator();
	// display elements
	while(i.hasNext()){
		Map.Entry me = (Map.Entry) i.next();
		System.out.println(me.getKey() + ": " + me.getValue());
	}
	System.out.println("***********");
	
	//Deposit 1000 into john doe's account
	double balance = ((Double) hm.get("John Doe")).doubleValue();
	hm.put("John Doe", new Double(balance + 1000));
	System.out.println("John Doe's new balance: " + hm.get("John Doe"));
	}
}