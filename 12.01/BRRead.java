/*
	write your own code in this file
	
	There are only two kinds of programming languages: those people always bitch about and those nobody uses:
	There are only 10 types of people in the world: those who understand binary, and those who don't.
	
	Derek
	
	basic io operate
	char
*/
import java.io.*;
class BRRead{
	public static void main(String[] args) 
		throws IOException{ 
		char c; 
		BufferedReader br = new
			BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'q' tp quit");
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != 'q');
	}
 }
