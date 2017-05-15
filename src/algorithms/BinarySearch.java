package algorithms;

public  class BinarySearch {

	
	public static int binary(int[] arr, int key){
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end){
			int mid = (start + end/2);
			
			if(key == arr[mid]){
				
				return mid;
				}
			if(key < arr[mid]){
				
				end =mid -1;
			}
			else{
					start = mid +1;
				}
		}
		return 0;	
	}
	void BinarSearch(){
		int c =10;
		int d = 20;
		int sum = c-  d;
		System.out.println(sum);
	}
	
	static  int linearsearch(int[] arr1, int key){
         for(int i=0; i<arr1.length;i++)
         {
        	 if(key == arr1[i]){
        		 
        		 System.out.println("-------");
        		 System.out.println("!" + i+ "!");
        		 System.out.println("--------");
        	 
        	 }
         }
		
		return -1;
	}
	
	static int add(int a, int b){
		int sum = a + b;
		return sum;
		
	}
	
public static void main(String[] args){
	
	int array[] = {10,20,30,40};
	int key1 = 40;
	BinarySearch mbs = new BinarySearch();
	
	System.out.println("key found" + key1+"at the position"+mbs.binary(array, key1));
	System.out.println(linearsearch(array, key1));
	System.out.println(add(key1, key1));
	mbs.BinarSearch();
	System.out.println(binary(array, key1));
}

}
