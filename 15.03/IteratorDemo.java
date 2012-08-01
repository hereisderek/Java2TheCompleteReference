import java.util.*;

class IteratorDemo{
	public static void main(String args[]){
		// create a array list
		ArrayList al = new ArrayList();
		
		// add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		// use iterator to 
		System.out.println("Original contents of al: ");
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		// modify
		ListIterator litr = al.listIterator();
		while(litr.hasNext()){
			Object element = litr.next();
			litr.set(element + "+");
		}
		
		System.out.println("Modified contents of al: ");
		itr = al.iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		// display the list backwards
		System.out.print("modified list backwards: ");
		while(litr.hasPrevious()){
			Object element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();
	}
}