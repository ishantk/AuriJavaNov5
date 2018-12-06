package com.auribises;

/*class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	void bookCab(){
		System.out.println(">> Cab Booked !! Arriving Soon !!");
	}
}*/

// Refining RTP
// A class for which you cannot create objects !!
/*abstract class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	// abstract Method can be created in abstract class and cannot have definition !!
	// Rule created by parent
	abstract void bookCab();
	
	void show(){
		System.out.println("This is show");
	}
}*/

//Refining RTP to the Best Possible Way !!
// Neither we nor JVM can create Objects of interface !!
interface Cab{
	
	/*Cab(){
		System.out.println(">> Cab Object Constructed");
	}*/
	
	// abstract Method can be created in interface and cannot have definition !!
	// Rule created by interface
	void bookCab(); // -> public abstract void bookCab();
	
	// we cannot have methods with definitions
	/*void show(){
		System.out.println("This is show");
	}*/
}

class UberGo implements Cab{//extends Cab{ // UberGo IS-A Cab
	
	UberGo(){
		System.out.println(">> UberGo Object Constructed");
	}
	
	// Overriding
	public void bookCab(){
		System.out.println(">> UberGo Booked !! Arriving Soon !!");
	}
	
}

class UberX implements Cab{//extends Cab{ // UberX IS-A Cab
	
	UberX(){
		System.out.println(">> UberX Object Constructed");
	}
	
	// Overriding
	public void bookCab(){
		System.out.println(">> UberX Booked !! Arriving Soon !!");
	}
	
}

class UberMoto implements Cab{//extends Cab{ // UberMoto IS-A Cab
	
	UberMoto(){
		System.out.println(">> UberMoto Object Constructed");
	}
	
	// Overriding
	public void bookCab(){
		System.out.println(">> UberMoto Booked !! Arriving Soon !!");
	}
	
	void sayHello(){
		System.out.println("Hello, Customer !!");
	}
	
}

public class RTPDemo {

	public static void main(String[] args) {
		
		/*Cab cRef;
		cRef = new Cab(); // When Object is Constructed Constructor is Executed !!
		cRef.bookCab();*/
		
		 // When Child Object is Constructed Parent is Constructed First and than Child !!
		//UberGo uRef = new UberGo();
		//uRef.bookCab();
		
		// Polymorphic Statement: Parent's Ref Var is pointing to Object of Child
		//						  Interface Ref Var is pointing to Object which implements it !!			
		Cab cRef;
		cRef = new UberGo(); 
		cRef.bookCab();

		System.out.println();
		
		cRef = new UberX();
		cRef.bookCab();
		
		System.out.println();
		
		cRef = new UberMoto();
		cRef.bookCab();
		// cRef.sayHello(); // error
		
		System.out.println();
		
		//cRef = new Cab();
		//cRef.bookCab();
				
	}

}
