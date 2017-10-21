package String;

public class newStringObjectWithArrayOfCharacters {

	
	/*public static void CreatAstring() {
		char arr [] = {'a' , 's' , 'h' , 'r' , 'a' ,'f' , ' ' , 'm','h','a','m' , 'd'};
		String str = new String(arr); 
		System.out.println(str);
	}*/
	public static void CreatAstring2(String newString , char seqChar[]) {
		System.out.print(newString.copyValueOf(seqChar));
	}
	
	public static void main (String [] args) {
		//CreatAstring();
		 char seq [] = {'a' , 's','h','r','a' , 'f' , 'g'};
		CreatAstring2("" ,seq);
	}
}
