/**
 * 
 */
package codingbat;

/**
 * @QUestion The parameter weekday is true if it is a weekday, 
 * and the parameter vacation is true if we are on vacation. 
 * We sleep in if it is not a weekday or we're on vacation. 
 * Return true if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 *
 */
public class SleepIn {

	/**
	 * @param args
	 * 
	 */
	public static  int sum(int a, int b){
		
		
		
		return 1;
		
	}
	
	public static  boolean sleepIn(boolean weekday, boolean hours){
		if(!weekday || hours){
			return true;
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sleepIn(false, true));

	}

}
