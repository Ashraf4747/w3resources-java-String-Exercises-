package String;

public class compareTwoStringLEXICOGRAPHICALLY {

	public static void Compare(String str1 , String str2) {
		int strUnicode = str1.compareTo(str2);
		System.out.println(strUnicode);
		if (strUnicode>0) {
			System.out.println(str1 + " is greater than " + str2 );
		}
		else if (strUnicode < 0 ) {
			System.out.println(str1 + " is less than " + str2);
		}
		else {
			System.out.println(str1 + " is equal to " + str2);
		}
	}
	
	
	
	
	
	
	
	public static void main (String [] args) {
		Compare("ashraf" , "ASHRAF");
	}
}
