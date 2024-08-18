//write a program to implementing comparable interface and use its compareTo method for making user defined data comparable
//public int compareTo(T)

import java.util.*;
class Movies implements Comparable {

	String name = null;
	float totcoll = 0.0f;

	Movies(String name,float totcoll) {
		this.name = name;
		this.totcoll = totcoll;
	}

	public int compareTo(Object obj) {
		return name.compareTo(((Movies)obj).name);

	}

	public String toString() {
		return "{" + name + ":" + totcoll + "}";
	}
}
class TreeSetDemo1 {
	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		ts.add(new Movies("Money Heist",1000000.00f));
		ts.add(new Movies("Stranger Things",7000000.00f));
		ts.add(new Movies("Lucifer",5000000.00f));

	        System.out.println(ts);
	}
}

