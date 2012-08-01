/*************************************************************************
    > File Name: BitSetDemo.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Sat 07 Jul 2012 17:15:36 NZST
    > 
 ************************************************************************/

// BitSet Demostration
import java.util.BitSet;

class BitSetDemo{
	public static void main(String args[]){
		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(16);

		//set some bits
		for (int i = 0; i < 16; i++){
			if((i%2) == 0) bits1.set(i);
			if((i%5) != 0) bits2.set(i);
		}
		System.out.println("Initial pattern in bits1: " + bits1);
		System.out.println("Initial pattern in bits2: " + bits2);

		// AND bits
		bits2.and(bits1);
		System.out.println("AND: " + bits2);
		// OR bits
		bits2.or(bits1);
		System.out.println("OR: " + bits2);
		// XOR bits
		bits2.xor(bits1);
		System.out.println("XOR: " + bits2);
	}
}
