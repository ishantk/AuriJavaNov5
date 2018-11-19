
public class StringsDemo {

	public static void main(String[] args) {
		
		// char is a single value container
		char ch = 'A';
		System.out.println("ch is: "+ch);
		ch = '\u20b9'; 	// UNICODE
		System.out.println("ch now is: "+ch);
		ch = 68; 		// ASCII
		System.out.println("ch now is: "+ch);
		
		// String is a REFERENCE TYPE
		
		// Interned Way
		String str1 = "Hello";
		String str2 = "Hello";
		
		// Object Way
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);

		System.out.println("str1 with toString() is: "+str1.toString());
		System.out.println("str2 with toString() is: "+str2.toString());
		System.out.println("str3 with toString() is: "+str3.toString());
		System.out.println("str4 with toString() is: "+str4.toString());

		// Proof
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		
	}

}
