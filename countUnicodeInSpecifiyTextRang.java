package String;

public class countUnicodeInSpecifiyTextRang {
	
	public static int countUnicode (String word , int start , int end) {
		int count = word.codePointCount(start, end);
		int unicode = 0 ;
		for (int i = 0 ; i<word.length() ; i++) {
			char ch = word.charAt(i);
			int chUnicode = word.codePointAt(i);
			System.out.println("the char is " + ch + " the unicode for it is " + chUnicode);
			System.out.print(" ");
			
		}
		
		
		System.out.println(count);
		System.out.println(unicode);
		return count;
	}

	public static void main (String [] args) {
		countUnicode("Ashraf mohamed ibrahim" , 1 , 5 );
		
		
	}
}
