package com.auribises;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		// (head)10 9 8 7 6 5 4 3 2 1 (tail) -> what we added
		// (head)1 2 3 4 5 6 7 8 9 10 (tail) -> real storage
		
		/*System.out.println("Size of Queue is: "+queue.size());
		System.out.println("Head of Queue is: "+queue.peek());
		queue.poll(); // remove head of queue
		System.out.println("Size of Queue is: "+queue.size());
		System.out.println("Head of Queue is: "+queue.peek());*/
		
		for(int i=0;i<queue.size();i++){
			System.out.println("Head is: "+queue.peek());
			queue.poll();
		}

	}

}
