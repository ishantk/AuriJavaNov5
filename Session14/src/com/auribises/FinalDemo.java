package com.auribises;

final class CA{ // we cannot inherit from it
	final void show(){ // We cannot Override
		
	}
}

class CB{// extends CA{
	/*void show(){
		
	}*/
}

public class FinalDemo {

	public static void main(String[] args) {
		
		int i = 10;
		
		final int j = 10;
		
		i = 100;
		//j = 100; // error

	}

}
