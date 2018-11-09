import java.util.Scanner; // Imporintg an API (Application Programming Interfaces)

public class DataTypes {

	// main is known as method - which will be executed at 1st
	// main here is representing main thread
	public static void main(String[] args) {
		// whatever we write in the main method will be executed sequentially !!
		
//		System.out.println("This is my 1st Statement");
//		System.out.println("Hello World");
//		System.out.println("This is my last Statement");
		
		// Data Storage : Single Value Container
		// speed = distance / time
		int speed = 0;  // kmph
		int distance = 0; // kms
		
		// Object Construction of Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the speed ?");
		speed = scanner.nextInt();
		
		System.out.println("What is the distance ?");
		distance = scanner.nextInt();
		
		int time = distance / speed; // distance / speed -> Data Operation
		
		System.out.println("With Speed "+speed+" kms per hour "+distance+" kms will be covered in approx "+time+" hours time");
		
		scanner.close();
		
		
		/*
		 	// SINGLE VALUE CONTAINERS
		 	// Primitive Types : They store value
			   Integral
			 	1. byte    8 bits
			 	2. short   16
			 	3. int     32
			 	4. long    64
			 	
			   Floating Points
			    1. float   32 bits
			    2. double  64	
		 
		 	  Character
		 	  	1. char   16 bits
		 	  
		 	  Logical
		 	  	1. boolean 8 bits
		 */
		
		// Every storage container will have a range
		// byte -> 8 bits -> 2 pow 8 -> 256/2 -> -128 to 0 to 127
		
		// Write Operations
		// age is a single value container of size 8 bits having value 100
		byte age = 100;
		short s = 10000;
		int i = 1000000000;
		long l = 10000000000000l;
		
		float pi = 3.14f;
		double pi1 = 3.14;
		
		char ch = 'A';
		
		boolean isHoliday = true;
		
		// Update Operation
		// Changing existing value in a container
		age = 120;
		ch = 66; // 66 is ASCII Code of B
		ch = '\u20b9'; // Unicode
		

		// Read Operation
		System.out.println("age is: "+age);
		System.out.println("ch is: "+ch);
	}

}
