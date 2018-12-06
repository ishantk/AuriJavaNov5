package com.auribises;

interface College{
	void attendance();
}

interface Traffic{
	void seatBelt();
}

interface Teacher{
	void attendance();
	void assignments();
}

// Multiple Inheritance : Interface to Interface
interface Inf extends College, Traffic, Teacher{
	
	int i=10; // public static final int i = 10;
	
}

// This is not Multiple Inheritence !! This is Multiple Implementation !!
class Student implements Inf{//College, Traffic, Teacher{
	public void attendance(){
		System.out.println("I will score 90ercent attendance !!");
	}
	
	public void seatBelt(){
		System.out.println("I will wear seat belt before i drive !!");
	}
	
	public void assignments(){
		System.out.println("I will submitAssignments by end of day !!");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		
		College cRef = new Student();
		cRef.attendance();
		//cRef.seatBelt();    err
		//cRef.assignments(); err
		
		System.out.println();
		
		Traffic tRef = new Student();
		//tRef.attendance(); err
		tRef.seatBelt();
		//tRef.assignments(); err
		
		System.out.println();
		
		Teacher teacher = new Student();
		teacher.attendance();
		teacher.assignments();
		//teacher.seatBelt(); err
		
		System.out.println();
		
		Inf iRef = new Student();
		iRef.attendance(); 
		iRef.seatBelt();
		iRef.assignments(); 
		
		//Inf.i = 100; // error
		System.out.println(Inf.i);
	}

}
