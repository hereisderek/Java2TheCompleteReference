/*************************************************************************
    > File Name: AlgorithmsDemo.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Sat 23 Jun 2012 19:37:32 NZST
    > 
 ************************************************************************/
// Demostrate various algorithms.
import java.util.*;

class AlgorithmsDemo{
	public static void main(String args[]){

		// Create and initialize linked list
		LinkedList ll = new LinkedList();
		ll.add(new Integer(-8));
		ll.add(new Integer(-20));
		ll.add(new Integer(20));
		ll.add(new Integer(8));

		// Create a reverse order comparator
		Comparator r = Collections.reverseOrder();

		// Sort list by using the comparator
		Collections.sort(ll, r);
		
		// Get iterator
		Iterator li = ll.iterator();

		System.out.print("List sorted in reverse: ");
		while(li.hasNext()){
			System.out.print(li.next() + " ");
		}
		System.out.println();

		Collections.shuffle(ll);

		// display randomized list
		li = ll.iterator();
		System.out.print("List shuffled: ");
		while(li.hasNext())
			System.out.print(li.next() + " ");
		System.out.println();

		System.out.println("Minimum: " + Collections.min(ll));
		System.out.println("Maximum: " + Collections.max(ll));
	}
}
