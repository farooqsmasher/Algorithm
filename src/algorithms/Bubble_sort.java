/**
 * 
 */
package algorithms;

/**
 * @author farooq
 *
 */
public class Bubble_sort {

	/**
	 * @param bubble sort logic
	 */
	
	
	private static void swapNumbers(int i,int j,int[] array){
		
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	
	private static void bubble_srt(int[] array){
		
		int n = array.length -1;
		int k;
		for(int m =n; m>=0; m--){
			
			for(int i=0;i< n;i++){
				k = i+1;
				if(array[i]>array[k]){
					swapNumbers(i, k, array);
				}
			}
		} printNumbers(array); 
		
	}
	
	public static void printNumbers(int[] input){
		for(int i=0; i<input.length;i++){
			System.out.println(input[i]+",");
			}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {10,50,20,60,30};
		bubble_srt(input);

	}

}
