package String;

public class findCharWithUnicode {

	public static void FindCharUnicodeWithIndex (String word , int index) {
		double unicode = word.charAt(index);
		System.out.println(unicode);
	}
	
	
	public static void main (String [] args) {
		FindCharUnicodeWithIndex("Ashraf" , 3);
	}
}
