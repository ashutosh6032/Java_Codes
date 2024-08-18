//Write a program  for Hashmap class and use its methods 
//it stores data in key value format 
//in this data key must be unique
//get() keySet() values() entrySet()


import java.util.*;
class HashMapDemo {
	public static void main(String[] args) {
		

		HashMap hm = new HashMap();

		hm.put("Java",".java");
		hm.put("Python",".py");
		hm.put("Dart",".dart");

		System.out.println(hm);

		//get(k)  it prints value for key 
		System.out.println(hm.get("Java")); //.java

	       //keyset() it prints all keys of hashmap
	        System.out.println(hm.keySet()); // [Java,Python,Dart]
		
		//values() it prints all values of hashmap
		System.out.println(hm.values()); //[.java,.py,.dart]

		//entrySet() it convert all data in the set 
		System.out.println(hm.entrySet()); //[Java=.java,Python=.py,Dart=.dart]

	}
}

