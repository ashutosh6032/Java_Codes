//Write a progam for BlockingQueue interface 
//it is bounded(limited) interface 
//offer() put() add()


import java.util.*;
import java.util.concurrent.*;
class LinkedBlockingQueueDemo {
	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue bQueue = new LinkedBlockingQueue(3);

		bQueue.put(10);
		bQueue.put(20);
		bQueue.put(30);

		System.out.println(bQueue);
		
		//bQueue.offer(40,5,TimeUnit.SECONDS);
		bQueue.put(40);

		System.out.println(bQueue);
	}
}


