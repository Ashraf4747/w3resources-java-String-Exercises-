package String;

public class getTheconicalRepresentationofGivenString {

	
	static void TheConicalRepresentation () {
		String str1 = "Ashraf mohamed";
		String str2 = new StringBuffer("Ashraf").append(" mohamed").toString();
		String str3 = str1.intern();
		
		
		System.out.println("is " + str1 + " == " + str2 + " " + str1 == str2);
		System.out.println("is"+ str1+" equal " + str2 + " " + str1.equals(str2));
		System.out.println("is " +  str1 +"=="+ str3  + "  " + str1 == str3);
		System.out.println("is "+ str1 +" equal " + str3+ "  " + str1.equals(str3));
		System.out.println("is "+str2 + " == "+ str3+ "  " + str2 == str3) ;
		System.out.println("is "+str2 +" equals " +str3 +" " + str2.equals(str3));
	}
	public static void main (String []args) {
		TheConicalRepresentation();
	}
}
