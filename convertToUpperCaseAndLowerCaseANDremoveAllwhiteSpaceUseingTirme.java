package String;

public class convertToUpperCaseAndLowerCaseANDremoveAllwhiteSpaceUseingTirme {

	public static void main (String [] args) {
		//initialize a String 
		String str = "ASHRAF";
		//convert str to lowercase
		String lowerCase = str.toLowerCase();
		//output the result
		System.out.println(str + "   " + lowerCase);
		
		// initialize a String 
		String str2 = "ashraf";
		//convert str2 to upperCase 
		String upperCase = str2.toUpperCase();
		//output result 
		System.out.println(str2 +"   " + upperCase);
		
		//initialize a String with taps and white spaces
		String str3 = "  asdhr";
		//removing all the white space from the start and the end of the str3 ;
		String removeWhiteSpace = str3.trim();
		//output result 
		System.out.println( removeWhiteSpace);
	}
}
