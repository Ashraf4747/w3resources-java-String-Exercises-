package String;



public class compareAstringWithStringBuffer {
	
	public static void compare (String word , String buffer) {
		System.out.println(word.contentEquals(buffer));
	}
	
	public static void main (String [] args) {
		compare("Ashraf" , "Ashraf");
	}
}
