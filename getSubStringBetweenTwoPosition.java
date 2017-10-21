package String;

public class getSubStringBetweenTwoPosition {

public static void substring(String str ,int Start , int Ends) {
	int len = Ends  - Start ;
	char sub []= new char [len];
	if (Ends > str.length() || Ends < str.length() || Start > str.length() || Start < str.length()) {
		System.out.println("out of String");
		
	}
	for (int i = Start ; i<Ends ; i++) {
		sub[i] = str.charAt(i);
		System.out.print(sub[i]);
	}
	
}
	
	
	
	
	
	
	
	public static void main (String [] args) {
		/*String str = "Ashraf";
		String subString = str.substring(0, 4);
		System.out.println(subString);*/
		substring("Ashraf" , 0 , 8);
	}
}
