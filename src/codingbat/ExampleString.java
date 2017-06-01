package codingbat;


/*missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"*/
public class ExampleString {

	public static String test(String str, int n)
	{
		String front = str.substring(0,n);
		
		String back = str.substring(n+1,str.length());
		return front + back;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s1 ="hella";
	System.out.println(test(s1, 2));
	
	}

}
