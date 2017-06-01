package codingbat;
//In this example, the aIsBigger() method should return true if the int parameter a is larger than b by 2 or more. 
//This code uses an if with && ("and") to return true if the condition is met. Alternately, 
//the run falls through to the return-false at the bottom. This is a pretty simple way to do it. 
public class IfBooleanLogic {

	static boolean ifLogic(int a, int b){
		if ( a > b && (a-b) >=2){
			return true;
		}else{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(ifLogic(2, 0));
	}

}
