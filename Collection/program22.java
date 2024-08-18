//Write a program  for Hashmap class and use its methods 
//it stores data in key value format 
//in this data key must be unique


import java.util.*;
class HashMapDemo {
	public static void main(String[] args) {
		

		HashMap hm = new HashMap();

		hm.put("Kanha","Infosys");
		hm.put("Ashish","Barclays");
		hm.put("Badhe","CarPro");
		hm.put("Rahul","Bmc");
		hm.put("Kanha","XYZ"); //if you give same key then it assign new value to that key

		System.out.println(hm);
	}
}

