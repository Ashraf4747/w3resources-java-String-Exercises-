package String;

import java.util.Vector;

public class getAllIndexOfAllCharInAlphabet {
	static int [] arr ;
	public static void getIndex(String str) {
		
		int len = str.length();
		int index = 0 ;
		for (int i = 0 ; i<len ;i++) {
			index = str.indexOf(str.charAt(i) , 0);
			System.out.println("index of " + str.charAt(i) + " is : "  + index);
		}
		
	}
	
	
	public static void main (String []args) {
		
		getIndex("The quick brown fox jumps over the lazy dog");
		
		/*String s = "The quick brown fox jumps over the lazy dog";
		int index = s.indexOf("a" , 0 );
		System.out.println(index);*/
	}
}
