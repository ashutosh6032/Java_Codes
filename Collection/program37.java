//Write a program to implemnt Queue Data Structure and its method
//poll() remove() peek() element()


import java.util.*;
class QueueDemo {
	public static void main(String[] args) {
		Queue que = new LinkedList();

		que.offer(10);
		que.offer(20);
		que.offer(50);
		que.offer(30);
		que.offer(40);

		System.out.println(que);

		// poll()
		System.out.println(que.poll());

		//Remove()  same as a poll but it throws exception if no object is present there
		System.out.println(que.remove());

		//peek()
		System.out.println(que.peek());

		//element()  
		System.out.println(que.element());

		System.out.println(que);
	}
}

