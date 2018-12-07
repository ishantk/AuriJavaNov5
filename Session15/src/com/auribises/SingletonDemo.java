package com.auribises;

class Connection{
	
	static private Connection con = new Connection();
	
	private Connection(){
		
	}
	
	public static Connection getConnection(){
		return con;
	}
	
}

// Singelton Design Pattern | Google them
public class SingletonDemo {

	public static void main(String[] args) {
		
		//Connection con1 = new Connection();  error
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		
		System.out.println(con1);
		System.out.println(con2);
	}

}
