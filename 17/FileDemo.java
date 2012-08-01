/*************************************************************************
    > File Name: FileDemo.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Mon 09 Jul 2012 12:55:37 NZST
    > 
 ************************************************************************/
// Demostrate File
import java.io.File;

class FileDemo{
	static void p(String s){
		System.out.println(s);
	}
	public static void main(String srgs[]){
		File f1 = new File("./FileDemo.java");
		p("File name: " + f1.getName());
		p("Path: " + f1.getPath());
		p("Abs Path: " + f1.getAbsolutePath());
		p("Parent: " + f1.getParent());
		p("Exist? " + (f1.exists() ? "Yes" : "No"));
		p("Can write? " + (f1.canWrite() ? "Yes" : "No"));
		p("Can read? " + (f1.canRead() ? "Yes" : "No"));
		p("is " + (f1.isDirectory() ? "" : "Not") + " a directory");
		p(f1.isFile() ? "is a normal file" : "Might be a named pipe");
		p(f1.isAbsolute() ? "is absolute" : "not absolute");
		p("File last modified: " + f1.lastModified());
		p("File Size: " + f1.length() + " Byte");
	}
}
