//Write a program to compare user defined class as a key using comparable interface and its compareTo method

import java.util.*;
class Demo implements Comparable {
	String str = null;
	int foundyear = 0;
	
	Demo(String str,int foundyear) {
		this.str = str;
		this.foundyear = foundyear;
	}
	public String toString() {
		return "{" + str + ":" + foundyear + "}";
	}
	public int compareTo(Object obj) {
		return (this.foundyear)-((Demo)obj).foundyear;
	}
}
class TreeMapDemo2 {
	public static void main(String[] args) {

		TreeMap tm = new TreeMap();

		tm.put(new Demo("Youtube",2005),"Google");
		tm.put(new Demo("Facebook",2004),"Meta");
		tm.put(new Demo("Instagram",2010),"Meta");
		tm.put(new Demo("ChatGpt",2022),"OpenAI");

		System.out.println(tm);
	}
}

