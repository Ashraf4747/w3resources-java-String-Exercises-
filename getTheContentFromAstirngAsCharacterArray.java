package String;

public class getTheContentFromAstirngAsCharacterArray {

	
	
	
	public static String getCharAsArray(String str) 
	{
		
		int len = str.length ();
		if (str == null) {
			return null ;
		}
		Character [] ch = new Character[len];
		
		for (int i = 0 ; i<len ; i++) {
			 ch [i] = new Character(str.charAt(i));
		}
		System.out.println(str+ "\n"+ ch);
	
	return ch + " ";
	}
	
	
	
	
	public static void main(String [] args) {
		getCharAsArray("Ashraf");
		
		
	}
}
