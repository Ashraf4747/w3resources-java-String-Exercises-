package String;

public class creatAcharArrayContainingTHEStingContent {

	public static void creatCharArrayFromStringContent(String str){
	//get String length
		int len = str.length();
		//creat a new char object 
		char ch [] = new char[len];
		//go inside the string by charAt(index) and save the char At index i into char[index i]
		//ch [] = {'A' ,'s','h','r','a' , 'f'};
		for (int i = 0 ; i < len ; i++) {
			ch [i] = str.charAt(i);
		}
		//go inside char Array and output the index 
		for (int a = 0 ; a<ch.length ; a++) {
			System.out.println(ch[a] + "    ");
		}
	}
	
	

	public static void main (String []args)
	{
		
		/*String str = "Ashraf ";
		char ch [] = str.toCharArray();
		for (int i = 0 ; i< ch.length ;i++) {
			System.out.println(ch[i]);
		}*/
		//call the function
		creatCharArrayFromStringContent("Ashraf");
		
	}
}
