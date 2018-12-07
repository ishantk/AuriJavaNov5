package com.auribises;

public class WrapperDemo {

	public static void main(String[] args) {
		
		// Wrapper Class -> Primitives into References
		
		// Primitive Type
		int i = 10; 
		
		// Reference Type
		Integer iRef = new Integer(i); 
		// BOXING : Converted Primitive Type into a Reference Type
		
		// UNBOXING : Extracting Primitive from an Object
		int j = iRef.intValue();
		
		
		char ch = 'A';
		Character cRef = new Character(ch);
		char ch1 = cRef.charValue();
		
		double d = 2.2;
		Double dRef = new Double(d);
		double e = dRef.doubleValue();
		
		short s = 10;
		Short sRef = s; // AUTO-BOXING 		| Short sRef = new Short(s);
		short t = sRef; // AUTO-UNBOXING	| short t = sRef.shortValue();
				

	}

}
