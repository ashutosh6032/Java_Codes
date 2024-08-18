//Write a program for IdentityHAshMap 
//it Stores data with Duplicate keys


import java.util.*;
class IdentitHashMapDemo {
	public static void main(String[] args) {
		IdentityHashMap idm = new IdentityHashMap();

		idm.put(10,"Kanha");
		idm.put(10,"Rahul");
		idm.put(10,"Badhe");

		System.out.println(idm);
	}
}

