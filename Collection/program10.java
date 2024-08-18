//write a program to create a Hashset collection and store and prints its data and perform the operations using its methods
//it cannot store duplicate data

import java.util.*;
class HashsetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add("Kanha");
		hs.add("Rahul");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");
		hs.add("Ashish");

		System.out.println(hs);
	}
}
