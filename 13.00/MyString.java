class MyString{
	//Rectangle static myNewRec ;
	private static String myString = new String("hello world\n");
	public static void main(String[] args){
		String[] str = new String[30];
		//
		str[0] = new String("hello");
		str[1] = "world";
		str[2] = str[0] + " " + str[1];
		str[3] = ("the length is: " + str[2].length());
		str[4] = "valueOf() 100: " + String.valueOf(100);
		//Rectangle myNewRec = new Rectangle(100, 100, 20, 30);
		//str[5] = "valueOf() Rectangle(100, 100, 20, 30): " + String.valueOf(myNewRec);
		
		Object myObject = new Object();
		str[5] = myObject.toString();
		
		/* 	charAt();
			getBytes();
			toCharArray();
		*/
		//str[6] = (String) str[2].charAt(3);
		
		//"this is a string".charAt(3));
		//str[6] = new (Char)("this is a string").charAt(3);
		
		str[7] = myString.getChars(3);
		str[8] = "hello";
		
		/*
			equals();
			equalsIgnoreCase();
		*/
		
		/*
			reginMatches();
			startsWith();
			endsWith();
		*/
		/*
			compareTo();
			a string is less than anotuer if it comes before the other in dictionart order
		*/
		/*
			Search Strings:
			indexOf();
				search for the first occurrence of a character or substring
			lastIndexOf();
				search for the last occurrence of a character or substring
		*/
		/*
			Modifying a string
			1. String substring(int startIndex(, int endInex));
				startIndex: the index at which the substring will begin
				endIndex: 	the stopping point,NOT include the ending index
			
			2. String concat(String str);
				create a new object that invoking string with the contents of str appended to the end, just like " + "
				
			3. String replace(char original, char replacement);
				replace the character original with replacement
				Ex. String s = "hello".replace('l', 'w');
					get "Hewwo" in s
			
			4. String trim()
				returns a copy of the incoking string from which any leading and trailing whitespace has been removed
				
				Ex:	String s = "   hello world    ".trim();
				s:	"hello world"
		*/
		/**
			Data Conversion Using valueOf()
				old stuff,fuck it!
		*/
		/**
			Changing the case of characters within a string
			1.	String toLowerCase()
			2.	String toUpperCase()
			
				return a String object that contains the uppercase or lowercase equivalent of the invoking String
		*/
		
		/**
			#### String Buffer!!!
			1. StringBuffer () or (int size) or (String str)
				1> reserves room for 16 characters whithout reallocation.
				2> acceprs an integer argument that 
				3> accept a string argument that sets the initial contents of the StringBuffer object and reserces room for 16 more characters without reallocation
			
			2.	int length(); 
					length of current StringBuffer
				int capacity();
					total allocated capacity 
					
			3.	void ensurCapacity(int capacity)
					preallocate room for a certain number of characters after a StringBuffer has been constructed, use it to set the size of the buffer
				
			4.	void setLength(int len)
					set the length of the buffer within a StringBuffer object.
					len: the length of the buffer, must be nonnegatice
					
			5.	char charAt(int where)
				void setCharAt(int where, char ch)
				
			6.	void getChars(int sourceStart, int sourceEnd, char target[], int targetStart)
					sourceStart: the index of the begining of the substring
					sourceEnd:   the index that is one pasr the end of the desired substring
					
			7.	StringBuffer append	(String str) / (int num) / (Object obj)
					concratenates the string representation of any other type of data to the end of the incoking StringBuffer object. 
			8.	StringBuffer insert(int insec, (String str) / (char ch) / (Object obj))
			
			9.	StringBuffer reserve()
			
			10.	StringBuffer delete(int startIndex, int endIndex)
				StringBuffer deleteChar(int loc)
				
			11.	StringBuffer replace(int startIndex, int endIndex, String sttr)
			
			12.	String subString(int startIndex (, endIndex))
			
			13. String concat(String str)
			
			14. String replace(char original, char replacement)
			
			15. String trim()
				return a copy of the invoking string from which any leading and trailing whitespace has been removed
		*/
		
		/**
			Data Conversion Using valueOf()
			
			the calueOf() method converts data from its internal format into a human-readable form. it is a static method that is ocerloaded within String for all of java's built-in types, so that each type can be converted properly into s string. calueOf() is also overloaded for type Object, so an object of any class type you create can also be used as an argument.
			
				static String valueOf( nearly everything)
		*/
		/**
			change the case of characters within a string
			
				String toLowerCase()
				String toUpperCase()
		*/
		
		/**
			
		*/
		
		for (int i = 0; i < str.length; i++){
			//System.out.print(); 
			System.out.println("str[" + i + "]: " + str[i]);
		}
		
	}
}