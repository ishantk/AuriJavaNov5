package com.auribises;

class CA{// extends Object{
	
	public String toString(){
		return "This is Awesome";
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		CA cRef = new CA();
		System.out.println("cRef is: "+cRef);
		System.out.println("cRef.toString() is: "+cRef.toString());
		System.out.println("cRef hashCode is: "+cRef.hashCode());
		System.out.println("cRef class is: "+cRef.getClass());
		System.out.println("cRef class is: "+cRef.getClass().getName());
		System.out.println("cRef class is: "+cRef.getClass().getSimpleName());
		
		Object oRef;
		oRef = new CA();
		oRef = new String();
	}

}
