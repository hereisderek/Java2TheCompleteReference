import java.util.*;

class ArrayListDemo {
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		
		System.out.println("initial size of al: " + al.size());
		
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("A");
		al.add("B");
		al.add("F");
		al.add(1, "Z");
		
		System.out.println("Size of al after sdditions: " + al.size());
		
		// display the array list
		
		System.out.println("Contents of al: " + al);
		
		// Remove elements from the array list
		al.remove("F");
		al.remove(2);
		
		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);
		/**
		 *	void ensureCapacity(int cap)
		 *		increase the capacity of an arraylist object
		 *
		 *	void trimToSize()
		 *		reduce the size of the array
		 * */

		// toArray()
		Object[] newChar = al.toArray();
		
		for ( Object a: newChar){
			System.out.println(a.toString());
		}


	}
}
