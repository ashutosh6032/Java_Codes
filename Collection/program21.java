//Write a program  for Hashmap class and use its methods 
//it stores data in key value format 
//in this data key must be unique


import java.util.*;
class HashMapDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("Kanha");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");

		System.out.println(hs);

		HashMap hm = new HashMap();

		hm.put("Kanha","Infosys");
		hm.put("Ashish","Barclays");
		hm.put("Badhe","CarPro");
		hm.put("Rahul","Bmc");

		System.out.println(hm);
	}
}

