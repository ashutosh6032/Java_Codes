//using a collections class perform sorting of arraylist data
//collection.sort() 
//in this data must be in comparable form


import java.util.*;
class ArrayListDemoc {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		al.add("Shankar");
		al.add("Viraj");
		al.add("Pratik");
		al.add("karan");
		al.add("Ashu");
		al.add("Shankar");

		System.out.println(al);

		Collections.sort(al);
		System.out.println(al);
	}
}

