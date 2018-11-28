class Point{
	
	// Attributes
	int x;
	int y;
	
	// Constructor
	
	// Special Member of Object which initializes data in object !!
	// It is executed automatically and is executed when object is created in memory !!
	// Default Constructor
	Point(){
		x = 10;
		y = 20;
	}
	
	// Non Default Constructors (They will contain some input(s))
	// this is a reference variable which will hold the reference(hashcode) to current object
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// Method
	void showPoint(){
		System.out.println("Point is: "+x+" : "+y);
		
	}
}

public class ConstrcutorDemo {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point(11,12);
		
		p1.showPoint();
		p2.showPoint();

	}

}
