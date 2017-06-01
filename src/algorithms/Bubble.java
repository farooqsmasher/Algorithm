package algorithms;

public class Bubble {

	
	//logic to sort the numbers
	
	static void bubbleSort(int[] arr){
		int n= arr.length;
		int k;
		for(int m =n;m>0;m--){
			for(int i=0;i<n-1;i++){
				k= i+1;
				if(arr[i]> arr[k]){
					swapNumbers(i, k, arr);
				}
			}
		}printNumber(arr);
		
	}
	
	static void swapNumbers(int i,int j,int[] arr){
		
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
		
	}
	
	
	static void printNumber(int [] input){
		for(int i=0;i<input.length;i++)
		{
			System.out.print("---");
			System.out.print("/"+input[i]+"/");
			System.out.print("---");
		}
	}
	
	public static void main(String[] args){
		int[] input ={10,20,5,40,3,90,1};
		bubbleSort(input);
	}
}
