package com.auribises;

import java.io.IOException;

// User Defined CHECKED EXCEPTION
class MyBankingException extends Exception{
	MyBankingException(String message){
		super(message);
	}
}

//User Defined UNCHECKED EXCEPTION
class YourBankingException extends RuntimeException{
	YourBankingException(String message){
		super(message);
	}
}

class Banking{
	
	int accountBalance = 10000;
	int minBalance = 2000;
	int attempts = 0;
	
	void withdraw(int amount){
		
		accountBalance = accountBalance - amount;
		
		if(accountBalance <= minBalance){
			accountBalance = accountBalance + amount;
			System.out.println(">> Withdrawl Failed. Balance is LOW: \u20b9"+accountBalance);
			attempts++;
		}else{
			System.out.println(">> Withdrawl Processed. New Balance is \u20b9"+accountBalance);
		}
		
		if(attempts == 3){
			// UNCHECKED EXCEPTION
			ArithmeticException aRef = new ArithmeticException("Illegal Attempts");
			throw aRef; // throw keyword is used to throw exception explicitly by developer
		}
	}
	
	void withdrawAgain(int amount) throws IOException, MyBankingException{
		
		accountBalance = accountBalance - amount;
		
		if(accountBalance <= minBalance){
			accountBalance = accountBalance + amount;
			System.out.println(">> Withdrawl Failed. Balance is LOW: \u20b9"+accountBalance);
			attempts++;
		}else{
			System.out.println(">> Withdrawl Processed. New Balance is \u20b9"+accountBalance);
		}
		
		if(attempts == 3){
			// CHECKED EXCEPTION
			//IOException iRef = new IOException("Illegal Attempts");
			//throw iRef; // throw keyword is used to throw exception explicitly by developer
			
			MyBankingException mRef = new MyBankingException("Illegal Attempts !!");
			throw mRef;
		}
	}
	
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		System.out.println(">> Banking Started");

		Banking bRef = new Banking();
		
		/*for(int i=1;i<=5000;i++){
			bRef.withdraw(3000);
		}*/
		
		try{
			for(int i=1;i<=5000;i++){
				bRef.withdrawAgain(3000);
			}
		}catch(Exception e){
			System.out.println("Some Exception: "+e);
		}
		
		
		System.out.println(">> Banking Finished");
	}

}
