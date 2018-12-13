package com.auribises.threads;

class Employee{
	int eid;
	String name;
	String email;
	String address;
	String salary;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(">> Employee Object Deleted");
	}
}

public class RuntimeAPI {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		Runtime rt = Runtime.getRuntime();
		System.out.println("Free Memory:"+rt.freeMemory());
		System.out.println("Max Memory:"+rt.maxMemory());
		System.out.println("Total Memory:"+rt.totalMemory());
		
		e1 = null;
		e2 = null;
		e3 = null;
		
		//rt.gc(); // execute Garbage Collector
		System.gc();
		
		System.out.println();
		System.out.println("==GC Executed==");
		System.out.println();
		
		System.out.println("Free Memory:"+rt.freeMemory());
		System.out.println("Max Memory:"+rt.maxMemory());
		System.out.println("Total Memory:"+rt.totalMemory());
		
		
		System.out.println(">> App Finished");
	}

}
