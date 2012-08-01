// demostrate avarious vector operations
import java.util.*;
class VectorDemo{
	public static void main(String args[]){
		// initial size is 3, increment is 2
		Vector v = new Vector(3, 2);
		
		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());

		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		v.addElement(new Integer(5));

		System.out.println("Capacity after five additions: " + v.capacity());

		v.addElement(new Double(4.5));
		v.addElement(new Integer(7));

		System.out.println("Capacity after five additions: " + v.capacity());

		// enumerate the elements in the vector
		Enumeration vEnum = v.elements();

		System.out.println("\nElements in vector:");
		while(vEnum.hasMoreElements()){
			System.out.print(vEnum.nextElement() + " ");
		}
		System.out.println();

		// use iterator to display
		Iterator vItr = v.iterator();

		System.out.println("\nElements in vector: ");
		while(vItr.hasNext()){
			System.out.print(vItr.next() + " ");
		}
		System.out.println();
	}
}
