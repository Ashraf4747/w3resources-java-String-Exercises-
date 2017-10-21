package String;

public class checkWhetherTwoStringObjectsContainTheSameData {

	public static void compare (String str1 , String str2) {
		System.out.println(str1.equals(str2));
	}
	public static void compareIgnorCase(String s1 , String s2) {
		System.out.println(s1.equalsIgnoreCase(s2));
	}
	
	public static void main(String [] args) {
		compare("Ashraf" , "ashraf");
		compare("Ashraf" , "Ashraf");
		compareIgnorCase("ashraf" , "ASHRAF");
	}
}
