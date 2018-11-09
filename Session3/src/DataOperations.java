
public class DataOperations {

	public static void main(String[] args) {
		
		// Arithmetic Operations:
		/*
		 +, -, *, /, %
		 */
		
		int a = 10; // WO
		a = 12;		// UO
		
		int b = 15;
		
		int c = a + b; // Data Operation
		
		System.out.println("c is: "+c); // RO
		
		c = (a*a)+(b*b)+(2*a*b);
		System.out.println("c now is: "+c); // RO
		
		// 729
		int d = c % 2;
		System.out.println("d is: "+d);
		
		// Assignment Operations:
		// +=, -= , *=, /=, %=, =
		
		int x = 10;
		x+=100; // x = x + 100;
		System.out.println("x is: "+x);
		x%=3; // x = 110 % 3
		System.out.println("x is: "+x);
		
		// Conditional Operations
		// >, <, >=, <=, ==, !=
		
		int p = 10;
		int q = 20;
		boolean result = p<q;
		System.out.println(p+q);
		System.out.println(result);
		
		// Increment and Decrement
		// ++ and --
		int i = 10;
		i++; // i = i+1;
		++i; // i = i+1;
		i--;
		i++;
		--i;
		System.out.println("i is: "+i); // Read Operation on i
		
		// i = 11
		//int j = i++;
		int j = ++i;
		System.out.println("i is: "+i+" and j is: "+j);
		
		// Logical Operations
		// && || !
		int num1 = 10;
		int num2 = 20;
		int num3 = 15;
		
		//result = (num3>num1) && (num3>num2);
		result = (num3>num1) || (num3>num2);
		System.out.println("result is: "+!result);

		// Bitwise Operators
		// &, |, ^
		num1 = 8; 			// 1 0 0 0
		num2 = 4; 			// 0 1 0 0
		num3 = num1 ^ num2; // 1 1 0 0
		System.out.println("num3 is: "+num3);
		
		// Shift Operations
		// >> and << and >>>
		num1 = 12;   			// 1 1 0 0
		num2 = 3;               // 0 0 0 1 
		num3 = num1 >> num2;    
		System.out.println("num3 is: "+num3);
		
		// Misc Operators
		// ?: (if/else operator)
		num1 = 10;
		num2 = 100;
		result = (num2>num1)?true:false;
		System.out.println("result is: "+result);
		
		// Assignments:
		// 1. Split a number into digits and add them : 123 1+2+3 = 6
		// 2. Tell me my lucky number -> 10 1 1990
			           //  1+0+1+1+9+9+0 = 21 -> 2+1 -> 3 
	}

}
