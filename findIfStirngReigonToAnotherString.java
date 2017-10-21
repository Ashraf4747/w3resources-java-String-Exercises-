package String;

public class findIfStirngReigonToAnotherString {

	static void findReigonString (String str1 , String str2 ) {
		// find if the str1 and str2 are reigons
		//                 refinoMatches               start(str1)     theCompareString   start(str2)   lengthof the comparesion part(mohamed  7)
		boolean b = str1.regionMatches                 (   7   ,              str2            ,  6  ,                     7  );
		System.out.println(str1 + " in the specifice " + str2 + " is : " + b);
	}
	
	public static void main (String [] args) {
		findReigonString("Ashraf mohamed" , "Ahmed mohamed");
		
	}
}
