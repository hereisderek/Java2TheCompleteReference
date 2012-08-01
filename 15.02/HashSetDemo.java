/*************************************************************************
    > File Name: HashSetDemo.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Sat 02 Jun 2012 16:16:40 NZST
    > 
 ************************************************************************/
/**
 *	HashSet extends AbstractSet and implements the Set interface.
 *	creats a collection that uses a hash table for storage.
 *	
 *	constructors:
 *		HashSet()
 *		HashSet(Collection c)
 *		HashSet(int capacity [, float fillRation])
 *
 *	does not guarantee the order of its elements
 *
 *	use e.g. TreeSet to sort storage.
 *
 * */

import java.util.*;

class HashSetDemo{
	public static void main(String args[]){
		// create  a hash set
		HashSet hs = new HashSet();

		// add element to the hash set
		//
		hs.add("B");
		hs.add("C");
		hs.add("E");
		hs.add("F");
		hs.add("A");

		System.out.println(hs);
	}
}
