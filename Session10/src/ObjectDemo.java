// Textual Representation of User Object
class User{
	// Attributes : Belongs to Object
	String name;
	String phone;
	String email;
	private int age;
	char gender;
	private String address;
	
	// Methods : Belongs to Object
	
	// Setters
	void setAge(int a){
		if(a>18){
			age = a;
		}else{
			System.out.println("Invalid Age");
		}
	}
	
	void setAddress(String adrs){
		if(!adrs.isEmpty()){
			address = adrs;
		}else{
			System.out.println("Invalid Address");
		}
	}
	
	// Getters
	int getAge(){
		return age;
	}
	
	String getAddress(){
		return address;
	}
	
	void showUserDetails(){
		System.out.println("========="+name+"=========");
		System.out.println("Phone:\t"+phone);
		System.out.println("Email:\t"+email);
		System.out.println("========="+age+"=========");
	}
}

public class ObjectDemo {

	// main is the method which executes when we run the app
	public static void main(String[] args) {
		
		// SVC
		int a = 10;
		
		// MVC | Homo
		int[] arr = {10, 20, 30, 40, 50};
		
		// MVC | Hetro | Object
		User uRef1 = new User(); // Object Construction Statement
		User uRef2 = new User(); 
		
		User uRef3 = uRef1; 	// reference copy
		
		System.out.println("a is: "+a);
		System.out.println("arr is: "+arr);
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		
		// Write Operation in Object
		uRef1.name = "John";
		uRef1.phone = "+91 99999 88888";
		uRef3.email = "john@example.com";
		//uRef1.age = 30;
		uRef1.setAge(30);
		uRef3.gender = 'M';
		//uRef1.address = "Redwood Shores";
		uRef1.setAddress("Redwood Shores");
		
		uRef2.name = "Fionna";
		uRef2.phone = "+91 77777 88888";
		uRef2.email = "fionna@example.com";
		//uRef2.age = 32;
		uRef2.setAge(3);
		uRef2.gender = 'F';
		//uRef2.address = "Country Homes";
		uRef2.setAddress("Country Homes");
		
		// Read Operation from Object
		//System.out.println(uRef1.name+" is "+uRef3.age+" years old and lives in "+uRef1.address);
		//System.out.println(uRef2.name+" is "+uRef2.age+" years old and lives in "+uRef2.address);
		
		System.out.println(uRef1.name+" is "+uRef3.getAge()+" years old and lives in "+uRef1.getAddress());
		System.out.println(uRef2.name+" is "+uRef2.getAge()+" years old and lives in "+uRef2.getAddress());
		
		uRef1.showUserDetails();
		uRef2.showUserDetails();
		uRef3.showUserDetails();

	}
	
	/* HW
 		Amazon
		 		Product
		 			id
		 			name
		 			brand
		 			price
		 			color
		 			weight
		 			availability
	 */

}
