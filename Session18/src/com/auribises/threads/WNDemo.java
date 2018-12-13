package com.auribises.threads;

class Message{
	
	String message;
	
	Message(){
		message = "No Message Available";
	}
	
	void readMessage(){
		System.out.println(">> Message is: "+message);
	}
	
	void writeMessage(){
		message = "Search the Candle rather than cursing the darkness !!";
		System.out.println(">> Message Written");
	}
}

class ReaderThread extends Thread{
	
	Message mRef;
	
	ReaderThread(Message m){
		mRef = m;
	}
	
	public void run() {
		
		System.out.println("rt1 state 3 "+getState());
		
		synchronized (mRef) {
			
			try {
				mRef.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
					
			mRef.readMessage();
		}
	}
}

class WriterThread extends Thread{
	
	Message mRef;
	
	WriterThread(Message m){
		mRef = m;
	}
	
	public void run() {
		synchronized (mRef) {
			mRef.writeMessage();
			//mRef.notify();
			mRef.notifyAll();
		}
	}
}

public class WNDemo {

	public static void main(String[] args) {
		
		Message mRef = new Message();
		
		ReaderThread rt1 = new ReaderThread(mRef);
		ReaderThread rt2 = new ReaderThread(mRef);
		WriterThread wt = new WriterThread(mRef);
		
		System.out.println("rt1 state 1 "+rt1.getState());
		
		rt1.start();		
		rt2.start();
		wt.start();
		
		
		// Threads have states
		//Thread.State.NEW
		
		//if(rt1.getState().equals(Thread.State.RUNNABLE)){
			
		//}
	}

}
