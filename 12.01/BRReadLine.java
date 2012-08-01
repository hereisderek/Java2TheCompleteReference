/*
	write your own code in this file
	
	There are only two kinds of programming languages: those people always bitch about and those nobody uses:
	There are only 10 types of people in the world: those who understand binary, and those who don't.
	
	Derek
	
	basic io operate
	String
*/
import java.io.*;
class BRReadLine{
	public static void main(String[] args) 
		throws IOException{ 
		String c; 
		BufferedReader br = new
			BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, \"quit\" to quit");
		do {
			//c = br.readLine();
			System.out.println( new InputStreamReader(System.in));//c);
		} while (true);//!c.equals("quit"));
	}
 }
/*
class BRReadLine{
	public static void main(String[] args) 
		throws IOException{ 
		String c; 
		BufferedReader br = new
			BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, "quit" tp quit");
		do {
			c = br.readLine();
			System.out.println(c);
		} while (!c.equals("quit"));
	}
 }
 */