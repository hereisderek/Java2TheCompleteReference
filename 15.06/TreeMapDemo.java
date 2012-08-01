/*************************************************************************
    > File Name: TreeMapDemo.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Fri 08 Jun 2012 15:23:02 NZST
    > 
 ************************************************************************/
import java.util.*;

class TreeMapDemo{
	public static void main(String[] args){
		// Create a tree map
		TreeMap tm = new TreeMap();

		// Put elements to the map
		tm.put("John Deo", new Double(3344.34));
		tm.put("Tom Smith", new Double(3456.56));
		tm.put("Jane Baker", new Double(5678.78));
		tm.put("Todd Hall", new Double(6789.90));
		tm.put("Ralph Smith", new Double(6728.01));
		
		// Get a set of the entries
		Set set = tm.entrySet();

		// Get an iterator
		Iterator i = set.iterator();

		// Display elements
		while(i.hasNext()){
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + ": " + me.getValue());
		}
		System.out.println();

		// deposit 1000 into John Deo's account
		double balance = ((Double) tm.get("John Deo")).doubleValue();
		tm.put("John Deo", new Double(balance + 10000));
		System.out.println("John Deo's account now is: " + tm.get("John Deo"));
	}
}
