
public class BreakContinue {

	public static void main(String[] args) {
		
		int userChoice = 5;
		for(int elevator=1;elevator<=10;elevator++){
			System.out.println("Elevator is on Level: "+elevator);
			if(userChoice == elevator){
				break; // Terminate the Loop
			}
		}
		
		for(int i=1;i<=10;i++){
			if(i<=5){
				continue; // skip the iteration and move it to another iteration
			}
			System.out.println("i is: "+i);
		}

		// Practical:
		/*
		 1
		 1 1
		 1 1 1
		 1 1 1 1
		 1 1 1 1 1
		 
		 1
		 2
		 2 4
		 2 4 6
		 2 4 6 8
		 2 4 6 8 10
		 
		 
		 */
		
	}

}
