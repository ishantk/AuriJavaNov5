
public class StringMethods {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE (Which cannot be changed)
		// Modification on Strings will generate  new String
		String str1 = "Hello World";
		System.out.println("str1 is: "+str1);
		
		String str2 = str1.toUpperCase();
		
		System.out.println("str1 now is: "+str1);
		System.out.println("str2 is: "+str2);
		
		String s1 = "Hello";				// Interned Way
		String s2 = new String("HELLO");	// Object Way
		
		// We are comparing references
		if(s1 == s2){
			System.out.println("s1 == s2");
		}else{
			System.out.println("s1 != s2");
		}
		
		// we care comparing the content
		//if(s1.equals(s2)){
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("s1 is equal to s2");
		}else{
			System.out.println("s1 is not equal to s2");
		}
		
		//if(s1.compareTo(s2) == 0){
		if(s1.compareToIgnoreCase(s2) == 0){
			System.out.println("s1 is compared to s2");
		}else{
			System.out.println("s1 is not compared to s2");
		}
		
		String s3 = s2.toLowerCase(); // We are modifying the String
		System.out.println("s2 is: "+s2);
		System.out.println("s3 is: "+s3);
		
		String names = "John, Jennie, Jim, Jack, Joe";
		int l = names.length(); // 28
		System.out.println("Length of names is: "+l);
		
		char ch = names.charAt(0);
		System.out.println("ch is: "+ch);
		ch = names.charAt(l-1);
		System.out.println("ch now is: "+ch);
		
		String s4 = names.substring(5);
		System.out.println("s4 is: "+s4);
		
		String s5 = names.substring(6, 9); // 6 inclusive, 9 exclusive
		System.out.println("s5 is: "+s5);
		
		String[] strArr = names.split(",");
		for(String s : strArr){
			System.out.println(s.trim());
		}
		
		if(names.contains("Jennie")){
			System.out.println("Jennie is existing in names");
		}
		
		String email = "john@example.com";
		if(email.contains("@") && email.endsWith(".com")){
			System.out.println("Its a Valid Email");
		}else{
			System.out.println("Not a Valid Email");
		}
		
		int idx = names.indexOf('J');
		System.out.println("idx of J is: "+idx);
		idx = names.lastIndexOf('J');
		System.out.println("Last idx of J is: "+idx);
		
		idx = names.indexOf("Jennie");
		System.out.println("idx of Jennie is: "+idx);
		
		char[] chArr = names.toCharArray();
		int jCount = 0;
		for(char ch1 : chArr){
			if(ch1 == 'J'){
				jCount++;
			}
			System.out.print(ch1+" ");
		}
		System.out.println();
		System.out.println("Number of J's in names: "+jCount);
		
		String newNames = names.replace('J', 'K');
		System.out.println(names);
		System.out.println(newNames);
	}

}
