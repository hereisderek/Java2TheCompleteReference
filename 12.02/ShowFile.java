/*
	to display a text file
	
*/
import java.io.*;
public class ShowFile{
	public static void main(String[] args)
		throws IOException{
		
		int i;
		FileInputStream fin;
		
		try{
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException e){
			System.err.println("File Not Found");
			return;
		} catch (ArrayIndexOutOfBoundsException e){
			System.err.println("input file name as paramters");
			fin = new FileInputStream("ShowFile.java");
			//return;
		}
		
		// read characters until EOF is encountered
		do{
			i = fin.read();
			if(i != -1){
				System.out.print((char) i);
			} 
		} while ( i != -1);
		fin.close();
	}
}