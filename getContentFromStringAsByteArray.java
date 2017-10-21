package String;

import java.io.UnsupportedEncodingException;

public class getContentFromStringAsByteArray {

	
	
	
	public static void ByteArray(String str) throws UnsupportedEncodingException
	{
		//GET byte of the str 
		byte b []=str.getBytes("UTF-16BE");
		// creat new string and give it the value of the array byte
		String s = new String (b);
		// for each b[0] save it in d and output the d 
		for (byte d : b) {
		System.out.println(d);
		
		}
	}
	
	public static void main (String []args) throws UnsupportedEncodingException {
		ByteArray("Ashraf");
		
		
	}
}
