// write a program for the Treemap() 
// SortedMap() --> NavigableMap() --> TreeMap() class
// it gives key value pair data in the sorted format

import java.util.*;
class TreeMapDemo {
	public static void main(String[] args) {

		TreeMap tm = new TreeMap();

		tm.put("Ind","India");
		tm.put("Pak","Pakistan");
		tm.put("Sl","Sri-lanka");
		tm.put("Aus","Australia");
		tm.put("Ban","Bangaladesh");

		System.out.println(tm);
	}
}
