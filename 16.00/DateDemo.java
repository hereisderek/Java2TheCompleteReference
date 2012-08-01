/*************************************************************************
    > File Name: DateDemo.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Sat 07 Jul 2012 17:41:51 NZST
    > 
 ************************************************************************/
// show data and time using only date methods
import java.util.Date;

class DateDemo{
	public static void main(String args[]){
		// Instantiate a date object
		Date date = new Date();
	
		// display time and date using toString()
		System.out.println(date);

		// Display number of milliseconds since midnight, January 1, 1970 GMT
		long msec = date.getTime();
		System.out.println("Milliseconds since jan. 1, 1970 GMT = " + msec);
	}
}
