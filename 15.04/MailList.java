import java.util.*;

class Address{
	private String name, street, city, state, code;
	
	Address(String n, String s, String c,
		String st, String cd){
	
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
	}
	
	public String toString(){
		return name + "\n" + street + "\n" + 
			city + " " + state + " " + code;
	}
}

class MailList{
	public static void main(String args[]){
		LinkedList ml = new LinkedList();
		
		// add elements to the linked list
		ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "456789"));
		ml.add(new Address("Ralph", "1142 Maple Lane", "Mahomet", "IL", "456790"));
		ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "456700"));
					
		Iterator itr = ml.iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();		
	}
}