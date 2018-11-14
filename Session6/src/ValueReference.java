
public class ValueReference {

	public static void main(String[] args) {
		
		int a1 = 10;
		int a2 = a1; 	// Value Copy
		
		int[] a3 = {10, 20, 30, 40, 50};
		int[] a4 = a3; 	// Reference Copy
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		System.out.println("a3 is: "+a3);
		System.out.println("a4 is: "+a4);

		a4[2] = 222;
		a4[3] = 321;
		
		for(int elm : a3){
			System.out.print(elm+"  ");
		}
		
	}

}
