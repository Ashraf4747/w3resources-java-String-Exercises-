package String;

public class findCharUnicodeBe4SpecialIndex {
	
	
	
	public static void findCharUnicodeB4SpecialIndex(String word , int index) {
		int unicode = word.charAt(index - 1 ) ;
		System.out.println(unicode);
		int ch =word.codePointAt(index-1);
		System.out.println(ch);
	}

public static void main (String [] args) {
	findCharUnicodeB4SpecialIndex("Ashraf" , 3 );
	
}

}
