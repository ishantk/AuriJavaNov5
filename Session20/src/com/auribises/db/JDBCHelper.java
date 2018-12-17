package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.auribises.model.User;

/*

 JDBC Procedure:
 	1. Load the Driver
 		1.1 Download a .jar (collection of bytecodes(.class) ) file for Type 4 Driver and Configure the Build Path in Eclipse
 		1.2 Use API Class.forname to load the Driver Class
 		
 	2. Create Connection with DataBase
 		2.1 url to db
 		2.2 username and password
 		2.3 Use API's Connection and DriverManager
 		
 	3. Write SQL Statement	
 		String sql = "insert into user values(0,'George','george@example.com',33,'george123')";
 		String sql = "update User set name = 'new name', age = 11 where uid = 5";
 		String sql = "delete from User where uid = 5";
 		
 	4. Execute SQL Statement on Connection
 		Use Statement or PreparedStatement API
 		
 	5. Close the Connection
 		execute close() method on Connection API
 		
 	PS: Everything should be done in a try catch block	
 	    All Imports from java.sql package
 
 */

public class JDBCHelper {
	
	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	
	//1. Load the Driver
	public JDBCHelper() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(">> Driver Loaded !!");
		} catch (Exception e) {
			System.out.println("Some Exception "+e);
		}
	}
	
	//2. Create the Connection
	public void createConenction(){
		try {
			
			String url = "jdbc:mysql://localhost/GW2018AI";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println(">> Connection Created !!");
		} catch (Exception e) {
			System.out.println("Some Exception "+e);
		}
	}
	
	//3. and 4.
	public void insertUserInDB(User uRef){
		try {
			
			//3. Write SQL Statement	
	 		//String sql = "insert into user values(0,'"+uRef.getName()+"','"+uRef.getEmail()+"',"+uRef.getAge()+",'"+uRef.getPassword()+"')";
	 		String sql = "insert into user values(0, ?, ?, ?, ?)";
			
	 		//4. Execute SQL Statement
	 		//stmt = con.createStatement();
	 		//int i = stmt.executeUpdate(sql);
	 		
	 		pStmt = con.prepareStatement(sql);
	 		pStmt.setString(1, uRef.getName());
	 		pStmt.setString(2, uRef.getEmail());
	 		pStmt.setInt(3, uRef.getAge());
	 		pStmt.setString(4, uRef.getPassword());
	 		
	 		int i = pStmt.executeUpdate();
	 		
	 		if(i>0){
	 			System.out.println(">> "+uRef.getName()+" Inserted !!");
	 		}else{
	 			System.out.println(">> "+uRef.getName()+" Not Inserted !!");
	 		}
	 		
		} catch (Exception e) {
			System.out.println("Some Exception "+e);
		}
	}
	
	public void updateUserInDB(User uRef){
		try {
			
	 		
	 		String sql = "update User set name = ?, age = ? where uid = ?";
			
	 		
	 		pStmt = con.prepareStatement(sql);
	 		pStmt.setString(1, uRef.getName());
	 		pStmt.setInt(2, uRef.getAge());
	 		pStmt.setInt(3, uRef.getUid());
	 		
	 		int i = pStmt.executeUpdate();
	 		
	 		if(i>0){
	 			System.out.println(">> "+uRef.getName()+" Updated !!");
	 		}else{
	 			System.out.println(">> "+uRef.getName()+" Not Updated !!");
	 		}
	 		
		} catch (Exception e) {
			System.out.println("Some Exception "+e);
		}
	}
	
	public void deleteUserFromDB(int uid){
		try {
			
	 		
	 		String sql = "delete from User where uid = ?";
			
	 		
	 		pStmt = con.prepareStatement(sql);
	 		pStmt.setInt(1, uid);
	 		
	 		int i = pStmt.executeUpdate();
	 		
	 		if(i>0){
	 			System.out.println(">> "+uid+" Deleted !!");
	 		}else{
	 			System.out.println(">> "+uid+" Not Deleted !!");
	 		}
	 		
		} catch (Exception e) {
			System.out.println("Some Exception "+e);
		}
	}
	
	public ArrayList<User> fetchUsers(){
		
		ArrayList<User> users = new ArrayList<User>();
		
		try {
			
	 		
	 		String sql = "select * from User";
			
	 		
	 		pStmt = con.prepareStatement(sql);

	 		
	 		ResultSet rs = pStmt.executeQuery();
	 		
	 		while(rs.next()){
	 			User user = new User();
	 			user.uid = rs.getInt(1);
	 			user.name = rs.getString(2);
	 			user.email = rs.getString(3);
	 			user.age = rs.getInt(4);
	 			user.password = rs.getString(5);
	 			
	 			users.add(user);
	 			
	 			//System.out.println(user);
	 		}
	 		
	 		rs.close(); // Release Memory Resources
	 		
		} catch (Exception e) {
			System.out.println("Some Exception "+e);
		}
		
		return users;
	}
	
	//5. Close the Connection
	public void closeConnection(){
		try {
			con.close();
			System.out.println(">> Connection Closed !!");
		} catch (Exception e) {
			System.out.println("Some Exception "+e);
		}
	}
	
}
