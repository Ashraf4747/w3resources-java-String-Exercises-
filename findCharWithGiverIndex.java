package String;

public class findCharWithGiverIndex {

	
	public static void FindChar(String word , int index) {
		char ch = word.charAt(index);
		System.out.println( " the word is " + word );
		System.out.println( "the char at index  " + index + " is " + ch);
	}
	
	
	public static void main (String [] args) {
		
		FindChar("Ashraf" , 3);
		
		
		
	}
}
