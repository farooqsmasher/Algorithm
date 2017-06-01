package algorithms;

public class Linear {
	
	static int search(int[] arr, int key){
		
		int size = arr.length;
		//iterating the values
		for(int i=0;i<size;i++){
			//finding the position of the array
			if (arr[i] == key ){
				return i;
			}
		}
		return 0;
	}
	
	public static void main(String[] args){
		
		int array[] = {10,20,30,40};
		int key1 = 30;
		System.out.println("found "+ key1+ "at index"+search(array, key1));
	}
	

}
