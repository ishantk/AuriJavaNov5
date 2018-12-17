package com.auribises.main;

import java.util.ArrayList;

import com.auribises.db.JDBCHelper;
import com.auribises.model.User;

public class App {

	public static void main(String[] args) {
		
		User uRef1 = new User();
		uRef1.setUid(0);
		uRef1.setName("Kim");
		uRef1.setEmail("kim@example.com");
		uRef1.setAge(32);
		uRef1.setPassword("kim123");
		
		User uRef2 = new User(7, "Harry Watson", "harry@example.com", 55, "harry123");
		
		System.out.println(uRef1);
		System.out.println(uRef2);
		
		// Object contains data and Object is in RAM
		// Hence, data is temporary !!
		// We need to save data !!
		// 1. Files
		// 2. Database

		
		JDBCHelper helper = new JDBCHelper();
		helper.createConenction();
		//helper.insertUserInDB(uRef1);
		//helper.insertUserInDB(uRef2);
		
		//helper.updateUserInDB(uRef2);
		
		//helper.deleteUserFromDB(5);
		//helper.deleteUserFromDB(7);
		
		ArrayList<User> users = helper.fetchUsers();
		
		for(User user : users){
			System.out.println(user);
		}
		
		
		helper.closeConnection();
		
		
	}

}
