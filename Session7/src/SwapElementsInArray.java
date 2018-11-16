
public class SwapElementsInArray {

	public static void main(String[] args) {
		
		int[] arr = {64, 25, 500, 12, 22, 120, 11, 200, 3};
		
		// Swap Element at 3(12) with Element at 5(120)
		// {64, 25, 5, 120, 22, 12, 11, 200, 3};
		System.out.println("==Before Swap==");
		for(int elm : arr){
			System.out.print(elm+"  ");
		}
		System.out.println();
		
		int temp = arr[3]; // temp -> 12
		arr[3] = arr[5];   // arr[3] -> 120
		arr[5] = temp;	   // arr[5] -> 12
		
		System.out.println();
		
		System.out.println("==After Swap==");
		for(int elm : arr){
			System.out.print(elm+"  ");
		}
		
		
		// Swap Max Element with Min Element

	}

}
