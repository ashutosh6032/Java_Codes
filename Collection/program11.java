//write a program to cretae LinkedHashset and and print its elements and perform various operations using its methods
//it can store and print data in the insertion order


import java.util.*;
class LinkedHashSetDemo {
	public static void main(String[] args) {

		LinkedHashSet lh = new LinkedHashSet();

		lh.add(10);
		lh.add(20);
		lh.add(30);
		lh.add(40);
		lh.add(10);
		lh.add(20);

		System.out.println(lh);
	}
}
