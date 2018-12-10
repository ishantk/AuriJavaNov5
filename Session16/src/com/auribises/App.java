package com.auribises;

// Exception:  Error at runtime !!

public class App {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		int[] arr = {10, 20, 30, 40, 50};
		int a=10,b=2,c=0;
		try{
			System.out.println(">> arr[1] is: "+arr[1]);
			c = a/b;
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			//System.out.println(">> OOPS !! Something went wrong !!"); // release purpose
			System.out.println(">> Some Exception: "+aRef);
			//aRef.printStackTrace(); // is for development purpose
		}catch(ArithmeticException aRef){
			System.out.println(">> OOPS !! Something went wrong !!"); // release purpose
			//System.out.println(">> Some Exception: "+aRef);
			//aRef.printStackTrace(); // is for development purpose
		}*/
		catch(Exception e){ // Polymorphic Statement: Ref Variable of Parent can point to object of any child
			System.out.println(">> OOPS !! Something went wrong !!"); // release purpose
			//System.out.println(">> Some Exception: "+e);
			//e.printStackTrace(); // is for development purpose
		}
		finally{
			System.out.println(">> This must be executed");
		}
		
		System.out.println(">> c is: "+c);
		
		System.out.println(">> App Finsihed");

	}
	
	/*
	 	try{
	 	
	 	}catch(){
	 	
	 	}
	 	
	 	try{
	 	
	 	}finally{
	 	
	 	}
	 	
	 	try{
	 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
	 	
	 	try{
	 		try{
	 	
		 	}catch(){
		 	
		 	}finally{
		 	
		 	}
	 	}catch(){
		 	try{
		 	
		 	}catch(){
		 	
		 	}finally{
		 	
		 	}
	 	}finally{
		 	try{
		 	
		 	}catch(){
		 	
		 	}finally{
		 	
		 	}
	 	}
	 	
	 	Throwable
	 		-> Exception
	 			-> RuntimeException (UNCHECKED EXCEPTIONS) -> Only RuntimeException & its children are UNCHECKED rest everyone is CHECKED
	 				  -> NullPointerException
	 				  -> ArrayIndexOutOfboundsException
	 				  -> ArithmeticException
	 				  -> SecurityException
	 				  .
	 				  ..
	 				  ...
	 			-> IOException  (CHECKED)
	 			-> SQLException (CHECKED)
	 			.
	 			..
	 			...	  
	 				  
	 	
	 */

}
