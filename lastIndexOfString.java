package String;



	


public class lastIndexOfString {
	
	public static void placeOfTheCharInTheString(String str) {
		char ch [] = new char [str.length()];
		for (int i =0 ; i<str.length(); i++) 
		{
			ch[i] = str.charAt(i);
			
		}
		for (int a = 0 ; a<ch.length-2; a++) {
			int index = str.lastIndexOf(ch[a], str.length());
			System.out.println( ch[a] + " is number " + index + " in the String");
		}
		
		
	}
	
	public static void main (String [] args) {
		placeOfTheCharInTheString("ashraf mohamed");
		
	}
}
