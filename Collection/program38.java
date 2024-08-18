//write a program to implrment a queue by using priorityQueue class and use its method


import java.util.*;
class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();

		pq.offer(20);
		pq.offer(10);
		pq.offer(50);
		pq.offer(30);
		pq.offer(40);

		System.out.println(pq); //[10,20,50,30,40] it internally use heapdata Structure for sequence of storing
	
	}
}
