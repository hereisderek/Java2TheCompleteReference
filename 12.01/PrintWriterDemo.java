import java.io.*;
public class PrintWriterDemo{
	public static void main(String[] args){
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("my first sentence printed by printWriter");
		int i = 7;
		pw.println(i);
		//i =  i + 0.001;
		pw.println((double)i);
		//pw.println(new Rectangle(100,200,50,50));
	}
}