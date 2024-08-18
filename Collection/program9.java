//create a stack collection and store and print data and procees data using its method
//methods // push() pop() peek() search()

import java.util.*;
class StackDemo {
	public static void main(String[] args) {

		Stack s = new Stack();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		System.out.println(s); //it prints data by insertion order

		System.out.println(s.search(40)); // retuen index
		System.out.println(s.peek());
		s.pop();
		System.out.println(s);

	}
}
