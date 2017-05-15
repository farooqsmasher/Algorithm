package algorithms;

public class Buble_Srt {

	static void swapNumbers(int i,int j, int[] array){
		int temp;
		
		temp = array[i];
		array[i]=array[j];
		array[j]= temp;
		
	}
	
	static void bubleSort(int[]array){
		
		int n = array.length-1;
		int k;
		for(int m =n;m>=0;m--){
			for(int i=0 ; i< n;i++){
				k = i+1;
				if(array[i]>array[k]){
					swapNumbers(i, k, array);
				}
			}
		}printNumbers(array);
	}
	static void printNumbers(int []input){
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]+",");
		}
		System.out.println("\n");
	}

	public static void main(String[] args){
	
	
		int[] input={20,60,10,30,5,12,1};
		bubleSort(input);
	}
	
}
