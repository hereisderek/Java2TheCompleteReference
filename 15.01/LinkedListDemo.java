/*************************************************************************
    > File Name: LinkedListDemo.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Sat 02 Jun 2012 15:58:00 NZST
    > 
 ************************************************************************/
import java.util.*;

class LinkedListDemo{
	public static void main(String[] args){
		// create a linked list
		LinkedList ll = new LinkedList();
		// add elements
		ll.add("F");
		ll.add("B");
		ll.add("E");
		ll.add("G");

		ll.addLast("Z");
		ll.addLast("A");

		ll.add(1, "A2");

		System.out.println("Original contents of ll: " + ll);
		
		// remove elements from the linked list
		ll.remove("F");
		ll.remove(2);

		System.out.println("Contents of ll after deletion: " + ll);

		// remove first and last elements
		ll.removeFirst();
		ll.removeLast();

		System.out.println("ll after deletion first and last:" + ll);

		// get and set a value
		Object val = ll.get(2);
		ll.set(2, (String) val + "changed");

		System.out.println("ll after change: " + ll);

	}
}
