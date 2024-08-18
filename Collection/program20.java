// Write a program to perform methods of NavigableSet 
// lower() floor() ceiling() higher() pollFirst() polLast()

import java.util.*;
class NavigableSetDemo {
	public static void main(String[] args) {

		NavigableSet ns = new TreeSet();

		ns.add(10);
		ns.add(20);
		ns.add(30);
		ns.add(40);
		ns.add(50);

		System.out.println(ns);

		//Lower()
		System.out.println(ns.lower(30));//20
		
		//floor()
		System.out.println(ns.floor(30)); //30

		//ceiling()
		System.out.println(ns.ceiling(10)); //10

		//higher()
		System.out.println(ns.higher(20));//30
		
		//pollFirst() 
		System.out.println(ns.pollFirst());//10

		//pollLast()
		System.out.println(ns.pollLast());//50

		//descendingSet()
		System.out.println(ns.descendingSet());

	}
}
