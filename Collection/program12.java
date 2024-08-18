//Write a program to create a hashset and for not storing duplicate data

import java.util.*;
class HashDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(10); // this internal call of predefined classes is same as (new Integer(10)) so there are duplication
			    // so only 10 and 20 will be store
		hs.add(20);
		hs.add(new Integer(10));
		hs.add(new Integer(20));

		System.out.println(hs);
	}
}

