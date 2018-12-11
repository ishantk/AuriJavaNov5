package com.auribises.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

class Student{
	
	// Attributes
	int roll;
	String name;
	String address;
	
	public String toString() {
		return roll+","+name+","+address+"\n";
	}
	
}

public class App {
	
	void writeInFile(String data){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/mystudents.csv");
			/*if(file.exists()){
				System.out.println(file.getName()+" Exists !!");
			}else{
				System.out.println(file.getName()+" does not Exists !!");
			}*/
			/*if(file.isDirectory()){
				
			}
			
			if(file.isFile()){
				
			}*/
			
			// To write the data in file.
			// FileOutputStream writes the data in the form of bytes
			// FileOutputStream outputStream = new FileOutputStream(file);
			
			/*FileOutputStream outputStream = new FileOutputStream(file,true); // true -> append mode enabled
			outputStream.write(data.getBytes());
			outputStream.close();*/
			
			
			// FileWriter writes the data in the form of text
			// FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file,true);
			writer.write(data);
			writer.close();
			
			System.out.println(">> Data Written in "+file.getName());
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}

	
	void readFromFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/mystudents.csv");
			
			// FileInputStream read file in the form of bytes
			/*FileInputStream inputStream = new FileInputStream(file);
			int i = 0;
			while( (i = inputStream.read()) != -1){ // -1 is end of file
				char ch = (char)i;
				System.out.print(ch);
			}
			inputStream.close();*/
			
			
			// FileReader read file in the form of text
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader); // BufferedReader reads line by line
			String line = "";
			
			while((line = buffer.readLine()) != null){
				System.out.println(line);
			}
			
			buffer.close();
			reader.close();

		}catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	
	public static void main(String[] args) {
		
		/*Student s1 = new Student();
		s1.roll = 301;
		s1.name = "Jackson";
		s1.address = "Redwood Shores";
		
		Student s2 = new Student();
		s2.roll = 401;
		s2.name = "Sia";
		s2.address = "Pristine Magnum";*/
		
		//System.out.println(s1);
		//System.out.println(s2);
		
		// Data in Objects is Temporary !!
		// We must Persist(Save) the Data !!
		// 1. Files
		
		App app = new App();
		//String data = s2.toString();
		//app.writeInFile(data);
		
		app.readFromFile();
		
		// File file = new File("/Users/ishantkumar/Downloads/MyProg.java");
		// Assignment: 1. Read a Java Program and count number of braces
		//				  even or odd
		//			   2. Read a Java Program and count how many objects are created in the program	
		//             PS: Commented Code should not be considered
	}

}
