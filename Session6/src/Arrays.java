
public class Arrays {

	public static void main(String[] args) {
		
		// a1 is name of container (single value), int is the type with size 32 bits
		// 10 is the data residing in the container
		// Write Operation
		int a1 = 10;
		// Read Operation
		System.out.println("a1 is: "+a1);
		
		int a2 = 10;
		
		// a1 and a2 are primitive variables
		
		// Multi Value Container : Array
		// Arrays are homogeneous in nature
		
		// Implicit Syntax
		int[] a3 = {10, 20, 30, 40, 50};  // Write Operation
		System.out.println("a3 is: "+a3); // Not a Read Operation for Array Elements
		
		// Explcit Syntax
		int[] a4 = new int[]{10, 20, 30, 40, 50, 60};   // Write Operation
		System.out.println("a4 is: "+a4); 			// Not a Read Operation for Array Elements
		
		// a3 and a4 are called reference variables
		
		// Read Operation
		System.out.println(a3[0]);
		System.out.println(a4[2]);

		// Update Operation
		a3[1] = 123;
		a4[2] = 567;
		
		// Read Operation on Array Elements
		System.out.println("a3[1] is: "+a3[1]);
		System.out.println("a4[2] is: "+a4[2]);
		
		// Read All
		System.out.println("a3 length is: "+a3.length);
		System.out.println("a4 length is: "+a4.length);
		
		//1. For Loop
		for(int i=0;i<a3.length;i++){ // i: 0, 1, 2, 3 and 4 i.e. less than 5 (length of array a3)
			System.out.print(a3[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<a4.length;i++){ // i: 0, 1, 2, 3, 4 and 5 i.e. less than 6 (length of array a4)
			System.out.print(a4[i]+"  ");
		}
		System.out.println();
		System.out.println("*******Enhanced For Loop*******");
		//2. Enhanced For Loop or For-Each Loop -> Work with Arrays as of now
		for(int elm : a3){
			System.out.print(elm+"  ");
		}
		System.out.println();
		for(int num : a4){
			System.out.print(num+"  ");
		}
		System.out.println();
		
		//Creating an Array with 10 elements having all values as 0 by default
		int[] a5 = new int[10];
		System.out.println("a5 is: "+a5);
		a5[1] = 456;
		a5[9] = 987;
		for(int num : a5){
			System.out.print(num+"  ");
		}
		System.out.println();
		
		int[] a6, a7;
		a6 = new int[5];
		a7 = new int[10];
		
		int a8[], a9;
		a8 = new int[5]; // ref var
		a9 = 100; 		 // normal integer
		
	}

}
