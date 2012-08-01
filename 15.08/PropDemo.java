/*************************************************************************
    > File Name: PropDemo.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Fri 29 Jun 2012 12:17:02 NZST
    > 
 ************************************************************************/
/***
 * Properties:
 *	is a subclass of Hashtable, used to maintain lists of values in which the key
 *	is a String and the value is also a string. The Properties class is used by 
 *	many other Java class.
 */

//demonstrate a Property list
import java.util.*;

class PropDemo{
	public static void main(String args[]){
		Properties capitals = new Properties();
		Set states;
		String str;

		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washionton", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");

		// show all states and capitals in hashtable
		states = capitals.keySet(); //get set-view of keys
		Iterator itr = states.iterator();

		while(itr.hasNext()){
			str = (String) itr.next();
			System.out.println("The capital of " + str + " is " + capitals.getProperty(str) + ".");
		}
		System.out.println();

		// look nfor states not in list -- specify default
		str = capitals.getProperty("Florida", "Not Found");
		System.out.println("The capital of Florida is " + capitals.getProperty(str) + ".");
	}
}
