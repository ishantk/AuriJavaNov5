
public class MultiDimArrays {

	public static void main(String[] args) {
		
		int[] a1 = {10, 20, 30, 40, 50};
				//   0   1  2   3   4
		
		// Array of Arrays
		int[][] a2 = {
						{10, 20, 30},			//0
						{10, 20, 30, 40},		//1
						{10, 20, 30, 40, 50},	//2
						{10, 20},				//3
						{10}					//4
					 };
		
		System.out.println("a1 is: "+a1+" and length is: "+a1.length);
		System.out.println("a2 is: "+a2+" and length is: "+a2.length);
		System.out.println();
		System.out.println(a1[0]);
		System.out.println(a2[0]);
		System.out.println(a2[0][1]); //20
		
		System.out.println("*****************");
		
		for(int i=0;i<a2.length;i++){ // i: 0, 1, 2, 3 and 4
			for(int j=0;j<a2[i].length;j++){
				System.out.print(a2[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("*****************");
		
		int[][] a3 = new int[3][5];
		// 3 1-D Arrays with each array having 5 elements, and all elements will be 0
		
		System.out.println("*****************");
		
		for(int i=0;i<a3.length;i++){ // i: 0, 1, 2, 3 and 4
			for(int j=0;j<a3[i].length;j++){
				System.out.print(a3[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("*****************");
		
		int[][] a4 = new int[3][];
		a4[0] = new int[3];
		a4[1] = new int[10];
		a4[2] = new int[20];
		
		System.out.println("*****************");
		
		for(int i=0;i<a4.length;i++){ // i: 0, 1, 2, 3 and 4
			for(int j=0;j<a4[i].length;j++){
				System.out.print(a4[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("*****************");
		
		int[][][] a5 = {
							{
								{10, 20, 30},			//0
								{10, 20, 30, 40},		//1
								{10, 20, 30, 40, 50},	//2
								{10, 20},				//3
								{10}					//4
							},
							{
									{10, 20, 30},			//0
									{10, 20, 30, 40},		//1
									{10, 20, 30, 40, 50},	//2
									{10, 20},				//3
									{10}					//4
							 }
					   };
		
		System.out.println(a5[0][1][2]); // 30
		

	}

}
