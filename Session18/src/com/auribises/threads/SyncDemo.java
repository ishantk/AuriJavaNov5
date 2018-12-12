package com.auribises.threads;

class Teacher{
	
	
	//synchronized void answerQuestion(String que){
	void answerQuestion(String que){
		for(int i=1;i<=10;i++){
			System.out.println(">> Answering "+que+" with line#"+i);
		}
	}
	
	void fun(){
		System.out.println("This is fun");
	}
}

class Student extends Thread{
	
	Teacher tRef;
	String que;
	
	Student(Teacher t, String q){
		tRef = t;
		que = q;
	}
	
	public void run(){
		synchronized (tRef) {
			tRef.answerQuestion(que);
			tRef.fun();
		}
	}
	
}

public class SyncDemo {

	public static void main(String[] args) {

		Teacher tRef = new Teacher();
		
		Student s1 = new Student(tRef," ==Why Java?== ");
		Student s2 = new Student(tRef, " ^^What is Synchrnization?^^ ");
		
		// 2 different student threads are pointing to the same Teacher !!
		// Threads work parallely i.e. asynchronously
		// When Multiple Thread access the same single object, it is a problem !! Hence, we need Synchronization !!
		s1.start();
		s2.start();
		
	}

}
