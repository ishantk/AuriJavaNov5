package com.auribises;

class Product{
	
	int pid;
	String name;
	String brand;
	int price;
	
	static String companyName;
	
	Product() {
		brand = "Apple";
		System.out.println(">> Product Object Constructed");
	}
	
	void setProductDetails(int pid, String name, String brand, int price){
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	void showProductDetails(){
		System.out.println("====="+pid+"=====");
		System.out.println("Name:"+name);
		System.out.println("Brand:"+brand);
		System.out.println("Price:\u20b9"+price);
		System.out.println("=================");
	}
	
	static void showCompanyName(){
		System.out.println("==="+companyName+"===");
	}
	
}

// MobilePhone IS-A Product
class MobilePhone extends Product{
	
	int memory;
	int ram;
	String os;
	
	MobilePhone(){
		System.out.println(">> MobilePhone Object Constructed");
	}
	
	// Method Overloading  :  In the same object we can have same method name with unique inputs
	// Re-Defining the method again with unique inputs
	void setProductDetails(int pid, String name, String brand, int price, int memory, int ram, String os){
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.memory = memory;
		this.ram = ram;
		this.os = os;
	}
	
	void setProductDetails(int pid, String name){
		this.pid = pid;
		this.name = name;
	}
	
	// Method Overriding : ReDefining Parent's Method again with same inputs in the Child
	void showProductDetails(){
		System.out.println("====="+pid+"=====");
		System.out.println("Name:"+name);
		System.out.println("Brand:"+brand);
		System.out.println("Memory:"+memory);
		System.out.println("RAM:"+ram);
		System.out.println("OS:"+os);
		System.out.println("Price:\u20b9"+price);
		System.out.println("=================");
	}
	
	// Method Hiding
	static void showCompanyName(){
		System.out.println("****"+companyName+"****");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		/*Product pRef = new Product();
		pRef.setProductDetails(101, "iPhoneX", "Apple", 80000);
		pRef.showProductDetails();*/
		
		MobilePhone mRef = new MobilePhone();
		//mRef.setProductDetails(101, "iPhoneX", "Apple", 80000, 32, 4, "iOS");
		mRef.setProductDetails(101, "iPhoneX");
		mRef.showProductDetails();

		MobilePhone.companyName = "Amazon";
		MobilePhone.showCompanyName();
		
	}

}
