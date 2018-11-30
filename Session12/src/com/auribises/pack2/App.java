package com.auribises.pack2;

import com.auribises.pack1.One;
//import com.auribises.pack1.Two;

// Inheritance Across Package
// Only public and protected is inherited. But protected after inheritance behaves like private
// private and default is not inherited
class CA extends One{ // Inheritance
	
	void show(){
		protShow();
	}
	
}

public class App {

	public static void main(String[] args) {
			
		//One oRef = new One();
		//oRef.pvtShow();
		
		//oRef.defShow();
		//oRef.protShow();
		
		//oRef.pubShow();
		
		CA cRef = new CA();
		cRef.pubShow();
		//cRef.protShow();
		cRef.show();
		
	}

}
