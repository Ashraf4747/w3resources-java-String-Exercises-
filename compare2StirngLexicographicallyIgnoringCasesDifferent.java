package String;

public class compare2StirngLexicographicallyIgnoringCasesDifferent {

	
	public static void compareIgnorCase (String str1 , String str2) {
		int comparesion = str1.compareToIgnoreCase(str2);
		System.out.println(comparesion);
		if (comparesion>0) {
			System.out.println(str1 + "is greater than" + str2 );
		}
		else if (comparesion < 0 ) {
			System.out.println(str1 + "is less than " + str2);
		}
		else {
			System.out.println(str1 + " is equal to " + str2);
		}
	}
	
	// comparing 2 Stirng this function made by me :U
	/*public static void compareTo(String str1 , String str2) {
		int totalUnicodeStr1 = 0 ;
		int totalUnicodeStr2 = 0 ;
		int result;
		for (int i = 0 ; i<str1.length()|| i<str2.length() ; i++) {
			 totalUnicodeStr1 += str1.codePointAt(i);
			 totalUnicodeStr2 += str2.codePointAt(i);
		}
		result = totalUnicodeStr1 - totalUnicodeStr2 ;
		System.out.println(totalUnicodeStr1);
		System.out.println(totalUnicodeStr2);
		System.out.println(result);
	}
	*/
	public static void main (String [] args) {
		compareIgnorCase("ASHRAF" , "ashraf");
	}
}
