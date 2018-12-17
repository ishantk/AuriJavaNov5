package com.auribises.model;

/*
 SQL:
 create table User(
	uid integer primary key auto_increment,
    name varchar(256),
    email varchar(256),
    age integer,
    password varchar(256)
 )
 
 insert into user values(0,'George','george@example.com',33,'george123')
 
 
 */

// POJO (Plain Old Java Object) | Model | Bean -> Structure of Object
public class User {
	
	// Attributes
	public int uid;
	public String name;
	public String email;
	public int age;
	public String password;
	
	public User() {
	
	}

	public User(int uid, String name, String email, int age, String password) {
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.age = age;
		this.password = password;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", age=" + age + ", password=" + password
				+ "]";
	}

}
