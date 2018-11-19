// Method or Function or Procedure or Routine
// 1. Non Static
// 2. Static

public class MethodsDemo {

	void addNumbers(int num1, int num2){
		int num3 = num1 + num2;
		System.out.println("Sum of "+num1+" and "+num2+" is "+num3);
	}
	
	int addNumbersAgain(int num1, int num2){
		int num3 = num1 + num2;
		return num3;
	}
	
	void multiplyNumbers(int num1, int num2){
		int num3 = num1 * num2;
		System.out.println("Multiplication of "+num1+" and "+num2+" is "+num3);
	}
	
	int multiplyNumbersAgain(int num1, int num2){
		int num3 = num1 * num2;
		return num3; // should be the last statement
	}
	
	static void multiplyNumbers1(int num1, int num2){
		int num3 = num1 * num2;
		System.out.println("Multiplication of "+num1+" and "+num2+" is "+num3);
	}
	
	static int multiplyNumbersAgain1(int num1, int num2){ // Primitives
		int num3 = num1 * num2;
		return num3; // should be the last statement
	}
	
	
	static void sayHello(String name){
		System.out.println("Hello Dear, "+name);
	}
	
	void show(){
		System.out.println("Welcome !!");
	}
	
	void printArray(int[] arr){ // Reference Variable
		for(int elm : arr){
			System.out.print(elm+" ");
		}
	}
	
	public static void main(String[] args) {
		
		
		// Execution of Non Static Methods
		MethodsDemo md = new MethodsDemo(); // Object Construction Statement
		md.addNumbers(10, 20); 				// execution of method
		md.addNumbers(100, 120);
		md.addNumbers(130, 1220);
		md.addNumbers(1560, 2320);
		
		int result = md.addNumbersAgain(12, 12);
		System.out.println("Result is: "+result);
		
		if(result % 2 == 0){
			System.out.println("Result is Even");
		}else{
			System.out.println("Result is Odd");
		}
		
		// Pass By Value
		md.multiplyNumbers(1123, 1456);
		result = md.multiplyNumbersAgain(12, 12);
		System.out.println("Result is: "+result);
		
		// Execution of Static Methods
		MethodsDemo.multiplyNumbers1(101, 123);
		result = MethodsDemo.multiplyNumbersAgain1(121, 121);
		System.out.println("Result is: "+result);
		
		md.show();
		MethodsDemo.sayHello("John");
		
		int[] a1 = {10, 20, 30, 40, 50};
		md.printArray(a1); 		// Pass By Reference
		
	}

}
