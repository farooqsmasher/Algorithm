package algorithms;

public class LinearSearch {

	
	public static int myserach(int[] arr, int key){
		
		
	
		for(int i=0;i<arr.length;i++ ){
			if (arr[i] == key){
				
			return i;
			
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr1[] ={10,20,30,40};
		int searchKey = 30;
		
		System.out.println("key "+ searchKey+"found"+myserach(arr1,searchKey));
	}

}
