//Write program to implement Deque and its method 
//offerFirst() offerLast(0
//pollFirst() pollLast()
//peekFirst() peekLast()
//iterator() descendingIterator()


import java.util.*;
class DequeDemo {
	public static void main(String [] args) {

		Deque dq = new ArrayDeque();

		dq.offer(10);
		dq.offer(40);
		dq.offer(30);
		dq.offer(20);
		
		System.out.println(dq);
	
		//offerFirst() it adds data at first 
	        dq.offerFirst(5);

		//offerLast() it add data at last
		dq.offerLast(50);

		System.out.println(dq);

		//pollFirst() it delete and return first element
		System.out.println(dq.pollFirst()); //5

		//pollLast() it delete and return last element
		System.out.println(dq.pollLast()); //5
		
		//peekFirst() it returns first element
		System.out.println(dq.peekFirst()); //10

		//peekLast() it returns last element
		System.out.println(dq.peekLast()); //20

		Iterator itr = dq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Iterator itr2 = dq.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
			}
	
	}
}
