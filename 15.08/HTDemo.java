/*************************************************************************
    > File Name: HTDemo.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Fri 29 Jun 2012 11:45:23 NZST
    > 
 ************************************************************************/
/**
 * Dictionary:
 *	is an abstract class that represents a kry/value storage repository and 
 *	operates much like Map
 * HashTable:
 *	was part of the original java.tuil and is a concrete implementation of a 
 *	Dictionary. However, java 2 reengineered Hashtable so that it also implements
 *	the Map interface.so it is now integrated into the collextions framework
 *
 * combine both of version 1 & 2
 * */
import java.util.*;

class HTDemo{
	public static void main(String args[]){
		Hashtable balance = new Hashtable();
		Enumeration names;
		String str;
		double bal;

		balance.put("John Deo", new Double(3434.34));
		balance.put("Tom Smith", new Double(123.22));
		balance.put("Jane Baker", new Double(1378.00));
		balance.put("Todd Hall", new Double(99.22));
		balance.put("Ralph Smith", new Double(-19.89));

		//show all balances in hash table
		names = balance.keys();
		while(names.hasMoreElements()){
			str = (String) names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();

		// Deposit 1,000 into john deo's account
		bal = ((Double) balance.get("John Deo")).doubleValue();
		balance.put("John Deo", new Double(bal + 1000));
		System.out.println("John Deo's new balance: " + balance.get("John Deo"));
		
		System.out.println("-----=========   version 2, use iterator   =========------");
		// start of version 2, use iterator
		
		Set set = balance.keySet(); // get set-view of the keys
		
		// get iterator
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			str = (String) itr.next();
			System.out.println(str + ": " + balance.get(str));
		}

		// Deposite 1,000 tinto john's account
		bal = ((Double) balance.get("John Deo")).doubleValue();
		balance.put("John Deo", new Double(bal + 1000));
		System.out.println("John Deo's new balance: " + balance.get("John Deo"));
	}
}
