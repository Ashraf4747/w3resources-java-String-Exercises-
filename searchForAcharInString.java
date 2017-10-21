package String;

public class searchForAcharInString {

	
	public static void searchForChar(String word , String ch) {
	boolean result = word.contains(ch);	
	System.out.println(result);
	}
	
	
	
	
	public static void main  (String [] args) {
		searchForChar("Ashraf" , "r");
	}
}
