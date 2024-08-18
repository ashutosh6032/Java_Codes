//Write a progam for BlockingQueue interface 
//it is bounded(limited) interface 
//offer() put() add()


import java.util.*;
import java.util.concurrent.*;
class BlockingQueueDemo {
	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue bQueue = new ArrayBlockingQueue(3);

		bQueue.offer(10);
		bQueue.offer(20);
		bQueue.offer(30);

		System.out.println(bQueue);
		
		bQueue.offer(40,5,TimeUnit.SECONDS);

		System.out.println(bQueue);

		//take() it delets first element 
		bQueue.take();
		System.out.println(bQueue);

		ArrayList al = new ArrayList();
		System.out.println("ArrayList: "+al);

		//drainto() it coverts take dta from queue and store in list 
		bQueue.drainTo(al);
		System.out.println(al);

		System.out.println(bQueue);
	}
}


