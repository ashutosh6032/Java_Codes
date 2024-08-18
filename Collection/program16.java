//implementing comaparble interface and and use its compareTo() method in TreeSet for user defined object

import java.util.*;
class Myclass implements Comparable {

	String str = null;

	Myclass(String str) {
		this.str = str;
	}

	public int compareTo(Object obj) {
		return str.compareTo(((Myclass)obj).str);
	}
	public String toString() {
		return str;
	}
}
class TreeSetDemo3 {
	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		ts.add("Shankar");
		ts.add("Karan");
		ts.add("Viraj");
		ts.add("Ashu");

		System.out.println(ts);
	}
}


