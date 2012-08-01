// Demostrate StringTokenizer

import java.util.StringTokenizer;
class STDemo{
	static String in = "title = Java:Reference;" +
		"author = Schildt;" +
		"publisher = Osborn/McGraw-Hill;" +
		"copyright = 2011";
	public static void main(String args[]){
		StringTokenizer st = new StringTokenizer(in, "=;");
		while(st.hasMoreTokens()){
			String key = st.nextToken();
			String val = st.nextToken();
			System.out.println(key + "\t" + val);
		}
	}
}
