
public class Conditions {

	public static void main(String[] args) {

		boolean isInternetConnected = true;
		boolean isGpsEnabled = true;
		
		// Regular if/else
		if(isInternetConnected){
			System.out.println("You Can Access Internet");
		}else{
			System.out.println("Please Enable Internet and Try Again !!");
		}
		
		System.out.println("************");
		
		// Nested if/else
		if(isInternetConnected){
			if(isGpsEnabled){
				System.out.println("You Can Navigate using Google Maps");
			}else{
				System.out.println("Please Enable GPS and Try Agian !!");
			}
		}else{
			System.out.println("Please Enable Internet and Try Again !!");
		}
		
		int num1 = 100;
		int num2 = 100;
		int num3 = 100;
		
		if(num1 > num2){
			if(num1 > num3){
				System.out.println("num1 is greatest");
			}else{
				System.out.println("num3 is greatest");
			}
		}else{
			if(num2 > num3){
				System.out.println("num2 is greatest");
			}else{
				System.out.println("num3 is greatest");
			}
		}
		
		// Ladder if else
		if(num1>num2 && num1>num3){
			System.out.println(">> num1 is greatest");
		}else if(num2>num1 && num2>num3){
			System.out.println(">> num2 is greatest");
		}else if(num3>num1 && num3>num1){
			System.out.println(">> num3 is greatest");
		}else{
			System.out.println(">> Numbers might be Equal");
		}
		
		// 1-> Cash Withdrawl
		// 2-> Pin Change
		// 3-> Transfer
		// 4-> Balance Check
		
		int userChoice = 3;
		
		/*if(userChoice == 1){
			System.out.println("Cash Witdrawl Process Started");
		}else if(userChoice == 2){
			System.out.println("Pin Change Process Started");
		}*/
		
		// Optimized Version
		switch(userChoice){
		
			case 1:
				System.out.println("Cash Withdrawl Process Started");
				break;
				
			case 2:
				System.out.println("Pin Change Process Started");
				break;
				
			case 3:
				System.out.println("Cash Transfer Process Started");
				break;
				
			case 4:
				System.out.println("Balance Check Process Started");
				break;
				
			default:
				System.out.println("Not a Valid Choice");
				break;
				
		}
		
	}

}
