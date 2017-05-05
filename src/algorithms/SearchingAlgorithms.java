package algorithms;

public class SearchingAlgorithms {

	
	//linear serach algortihm 
	static int linearsearch(int[]arr,int key){
		for(int i=0; i<arr.length; i++){
			if(key == arr[i]){
				
				return i;
				
			}
		}
		return -1;
		}
	// binary serach algorithm
	
    static int binarysearch(int[]arrb, int key ){
    	int start =  0;
    	int end= arrb.length-1;
    	
    	while(start <= end){
    		int mid = (start + end)/2;
    		if(key == arrb[mid]){
    		
    			return mid;
    			
    			}
    		if(key < arrb[mid]){
    			end = mid - 1;
    		}
    		else{
    			start = mid +1;
    			
    		}
    	}
    	
    	return -1;
    	  }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={10,20,30,40};
		int key1 =30;
		System.out.println("linear serach"+linearsearch(array, key1));
		System.out.println("binary serrch "+binarysearch(array, key1));

  
	}

}
