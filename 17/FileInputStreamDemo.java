/*************************************************************************
    > File Name: FileInputStreamDemo.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Fri 20 Jul 2012 11:33:57 NZST
    > 
 ************************************************************************/
// demostrate fileinpit stream
import java.io.*;

class FileInputStreamDemo{
	public static void main(String args[]) throws Exception{
		int size;
		InputStream f = new FileInputStream("FileInputStreamDemo.java");
		System.out.println("Total Available Bytes: " + (size = f.available()));
		int n = size / 40;
		System.out.println("First " + n + " bytes of the file one read() at a time");
		for (int i = 0; i < n; i ++){
			System.out.print((char) f.read());
		}
		System.out.println();
		System.out.println("Still available:" + f.available());
		System.out.println("Reading the next " + n + " with  one read(b[])" );
		byte b[] = new byte[n];
		if (f.read(b) != n){
			System.err.println("Could not read " + n + " bytes.");
		}
		System.out.println(new String(b, 0, n));
		System.out.println("Still available: " + (size = f.available()));
		System.out.println("Skipping half of remaining bytes with skip()");
		f.skip(size / 2);
		System.out.println("Still avai+lable: " + f.available());
		System.out.println("Reading " + n/2 + " into the end of array");
		if (f.read(b, n/2, n/2) != n/2){
			System.err.println("Could not read " + n/2 + " bytes.");
		}
		System.out.println(new String(b, 0, b.length));
		System.out.println();
		System.out.println("Still available: " + f.available());
		f.close();
	}
}
