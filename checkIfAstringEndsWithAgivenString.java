package String;

public class checkIfAstringEndsWithAgivenString {
	
	public static void Check(String str1 , String str2) {
		System.out.println(str1.endsWith(str2));
	}
	
	
	public static void main (String []args) {
		Check("Ashraf " , "sg");
		Check("Mohamed" , "med");
	}
}
