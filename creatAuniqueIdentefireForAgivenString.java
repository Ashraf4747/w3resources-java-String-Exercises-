package String;

public class creatAuniqueIdentefireForAgivenString {

	
	
	
	public static void creatUniqueIdentifier(String str) {
		
		int s = str.hashCode();
		System.out.println(s);
		
		
	}
	
	
	
	
	
	public static void main (String [] args) {
		creatUniqueIdentifier("ASHraf");
		
		
	}
}
