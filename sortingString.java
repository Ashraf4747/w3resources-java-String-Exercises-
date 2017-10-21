package String;

public class sortingString {
	
	
	//this project is to sort a String by converting it to upper case and compare between the codePoint
	// not finshed yet
	public static void sort (String str)
	{
		int len = str.length();
		String strUpperCase = str.toUpperCase();
	
		String strLowerCase = str.toLowerCase();
		
		int sortingUpperCase [] = new int [len];
		int sortingLowerCase [] = new int [len];
		
		int indexUpperCase [] = new int [len];
		int	indexLowerCase [] = new int [len];
		char ch [] =  new char [len];
		for (int i = 0 ; i<len ; i++) 
		 {
			indexUpperCase [i] = strUpperCase.codePointAt(i);
			indexLowerCase [i] = strLowerCase.codePointAt(i);
			
			
		 }
		//sorting uppercase in indexUpperCase unicode
		for (int a = 0 ; a<len ; a++)
		
		{
			if (indexUpperCase [a] == 65  ||indexUpperCase [a] == 66 ||indexUpperCase [a] == 67 || indexUpperCase [a] == 68)
			
			{
				sortingUpperCase[a+a] = indexUpperCase[a];
				System.out.println(sortingUpperCase[a]);
			}
			
		}
		
		
		
		
	}
	
	
	public static void main (String []args) {
		sort("DCBA");
	}
}
