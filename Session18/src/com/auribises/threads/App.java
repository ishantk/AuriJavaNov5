package com.auribises.threads;

/*class PrinitngTask{
	void printDocument(int copies, String docName){
		for(int i=1;i<=copies;i++){
			System.out.println("Printing Copy#"+i+" for ** "+docName);
		}
	}
}*/

class PrinitngTask extends Thread{ // PrinitngTask IS A Thread | // what child thread should do should be written in run method !!
	static int copies;
	static String docName;
	public void run(){
		for(int i=1;i<=copies;i++){
			
			try {
				Thread.sleep(1500); // 1.5 secs
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			System.out.println("Printing Copy#"+i+" for ** "+docName);
		}
	}
}

class CA{
	
}

//class MyTask extends CA, Thread{ error Multiple Inheritance isnt supported in Java
	
class MyTask extends CA implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000); // 1 secs
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println("Printing Copy#"+i+" for @@ News.doc");
		}
	}
}

public class App {

	// main is also referred to as main thread
	// thread is an execution context -> Jobs will be executed in a sequence
	// what main thread should do should be written in main method !!
	public static void main(String[] args) {
		
		//1.
		System.out.println(">> main started");
		
		// PrinitngTask can be a blocker job for the main thread
		PrinitngTask task = new PrinitngTask();
		//task.printDocument(10, "JavaSession1.pdf"); // is the job of main thread
		PrinitngTask.copies = 10;
		PrinitngTask.docName = "JavaSession1.pdf";
		
		
		//Runnable r = new MyTask();
		//Thread th = new Thread(r);
		
		Thread th = new Thread(new MyTask());
		
		task.setPriority(Thread.MAX_PRIORITY); 							// 10
		th.setPriority(Thread.MIN_PRIORITY);  						 	// 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);  		// 5
		
		task.setName("John");
		th.setName("Jennie");
		Thread.currentThread().setName("Jim");
		
		th.start();
		
		try {
			th.join(); // this should be executed immediately after start
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		task.start(); // start method will execute run method internally
		
		//2.
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(500); // .5 secs
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			System.out.println("Printing Copy#"+i+" for ^^ JohnsProfile.pdf");
		}
		
		//3.
		System.out.println(">> main finished");
		
		System.out.println("PrintingTask name is: "+task.getName()+" and Priority is: "+task.getPriority());
		System.out.println("MyTask name is: "+th.getName()+" and Priority is: "+th.getPriority());
		System.out.println("Main name is: "+Thread.currentThread().getName()+" and Priority is: "+Thread.currentThread().getPriority());
	}

}
