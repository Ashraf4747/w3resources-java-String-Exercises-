package String;

public class compareGiverStrwithAspecificSquanceOFcharacters {
	
	public static void compare(String word , String SquanceOfChar) {
		System.out.println(word.contentEquals(SquanceOfChar));
	}
	
	public static void main (String [] args) {
		compare("Ashraf" , "Ashra");
	}

}
