
public class MinMaxInArrays {

	public static void main(String[] args) {
		
		int[] arr = {64, 25, 5, 12, 22, 120, 11, 200, 3};
		
		// Find the minimum Element in Array arr
		
		// Let minimum number be arr of 0
		int min = arr[0]; 		// min contains 64
		
		int maxIdx = 0;		 	// max contains 0
		
		for(int i=0;i<arr.length;i++){
			
			// 1st Way -> Comparing Values
			if(arr[i] < min){
				min = arr[i];
			}
			
			// 2nd Way -> Comparing Values on the basis of indexes
			if(arr[i] > arr[maxIdx]){
				maxIdx = i;
			}
			
		}
		
		System.out.println("Minimum Element is "+min);
		System.out.println("Maximum Element is "+arr[maxIdx]);

	}

}
