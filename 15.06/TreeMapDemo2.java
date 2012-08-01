/*************************************************************************
    > File Name: TreeDemo2.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Sat 09 Jun 2012 20:51:16 NZST
    > 
 ************************************************************************/
import java.util.*;

class TComp implements Comparator{
	public int compare(Object a, Object b){
		int i, j, k;
		aStr = (String ) a;
		bStr = (String) b;

		// find index of beginning of last name
		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');

		k = aStr.substring(i).compareTo(bStr.substring(j));
		if (k == 0){
			// last name match, check entire name
			return aStr.compareTo(bStr);
		} else {
			return k;
		}
		// no need to override equals
	}
}

class TreeMapDemo2{
	public static void main(String[] args){
		// Create a new treemap
		TreeMap tm = new TreeMap(new TComp());

		// put elements to the map
		tm.put("")
	}
}
