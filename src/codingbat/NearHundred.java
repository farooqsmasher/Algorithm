package codingbat;
//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) 
//computes the absolute value of a number.
public class NearHundred {
	
	public static boolean nearHundred(int n) {
		return((Math.abs(100 - n)<=10) || (Math.abs(200 - n)<=10));
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(nearHundred(90));
	}

}
