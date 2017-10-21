package String;

public class UnicodeForAlphaAndNumbers {

	
	public static void AlphaAndNumberUnicode(String alpha) {
		int  totalUnicode = 0 ;
		for (int i = 0 ; i<alpha.length() ;i++) {
			System.out.println(alpha.charAt(i) + "  :  " + alpha.codePointAt(i));
			
			
			System.out.println("  ");
			for (int a = 0 ; a<alpha.length() ; a++) {
				totalUnicode += alpha.codePointAt(a);
			}
			
		}
		System.out.print(totalUnicode);
	}
	public static void main (String [] args) {
			
		AlphaAndNumberUnicode("ABCDEFGHIGKLMNOPQRSTUVWXYZ");
		AlphaAndNumberUnicode("abcdefghijklmnopqrstuvwxyz");
	}
}
