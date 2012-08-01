/*************************************************************************
    > File Name: CompDemo.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Fri 08 Jun 2012 15:52:52 NZST
    > 
 ************************************************************************/
import java.util.*;

// A reverse comparator for strings.
class MyComp implements Comparator{
	public int compare(Object a, Object b){
		String aStr, bStr;

		aStr = (String) a;
		bStr = (String) b;

		// reverse the comparison
		return bStr.compareTo(aStr);
	}
}
class CompDemo{
	public static void main(String[] args){
		// Create a new TreeSet
		TreeSet ts = new TreeSet(new MyComp());

		// Add elements to the tree set
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("D");
		ts.add("G");
		ts.add("F");

		// Get an iterator
		Iterator i = ts.iterator();

		//Display elements
		while(i.hasNext()){
			Object element = i.next();
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
