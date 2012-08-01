// A Simple example that uses a natice method 
// Error:NativeDemo.dll: Can't load IA 32-bit .dll on a AMD 64-bit platform
public class NativeDemo{
	int i;
	public static void main (String[] args){
		NativeDemo ob = new NativeDemo();
		ob.i = 10;
		System.out.println("This is ob.i before the natice method: " + ob.i);
		ob.test();
		System.out.println("This is ob.i after the natice method: " + ob.i);
	}
	// declare natice method, nobady here
	public native void test();
	
	// load DLL that contains static method
	static {
		System.loadLibrary("NativeDemo");
	}
}