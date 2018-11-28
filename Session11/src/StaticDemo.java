class Counter{
	
	// Attribute : Property of Object
	int count;
	
	// Attribute : Property of Class
	static int sCount;
	
	// Constructor : Property of Object
	Counter(){
		count = 1;
		sCount = 1;
	}
	
	// Method : Property of Object
	void incrementCount(){
		count++;
		sCount++;
	}
	
	// Method : Property of Object
	void showCount(){
		System.out.println("Count is: "+count+" and sCount is: "+sCount);
	}
	
	// Method : Property of Class
	static void showSCount(){
		//System.out.println("count is: "+count); -> Error
		System.out.println("sCount is: "+sCount);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = c1;
		
		c1.incrementCount(); // 2
		c2.incrementCount(); // 2
		c3.incrementCount(); // 3
		c3.incrementCount(); // 4
		c2.incrementCount(); // 3
		c3.incrementCount(); // 5
		
		Counter.sCount = 101;
		
		c1.showCount();  // Count is: 5 and sCount is: 7
		c2.showCount();  // Count is: 3 and sCount is: 7
		c3.showCount();  // Count is: 5 and sCount is: 7
		
		Counter.showSCount();

	}

}
