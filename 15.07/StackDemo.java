/*************************************************************************
    > File Name: StackDemo.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Fri 29 Jun 2012 11:29:08 NZST
    > 
 ************************************************************************/
// Demonstrate the Stack class
import java.util.*;

class StackDemo{
	static void showPush(Stack st, int a){
		st.push(new Integer(a));
		System.out.println("Push(" + a + ")");
		System.out.println("stack: " + st);
	}

	static void showPop(Stack st){
		System.out.print("Pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("Stack: " + st);
	}

	public static void main(String args[]){
		Stack st = new Stack();

		System.out.println("stack: " + st);
		showPush(st, 42);
		showPush(st, 66);
		showPush(st, 99);

		showPop(st);
		showPop(st);
		showPop(st);

		try{
			showPop(st);
		} catch (EmptyStackException e){
			System.out.println("Empty stack");
		}
	}
}
