//Write a program to create and store data in TreeSet and perform methods of SortedSet interface
//headSet() tailSet() subSet() first() last()


import java.util.*;
class SortedSetDemo {
	public static void main(String[] args) {

		SortedSet ss = new TreeSet();

		ss.add("Karan");
		ss.add("Shankar");
		ss.add("Viraj");
		ss.add("Ashu");
		ss.add("Pratik");

		System.out.println(ss); //[Ashu,Karan,Pratik,Shankar,Viraj]
                
		//Methods of SortedSet Interface

		System.out.println(ss.headSet("Viraj")); //[Ashu,Karan,Pratik,Shankar]
		System.out.println(ss.tailSet("Pratik")); //[Pratik,Shankar,Viraj]
		System.out.println(ss.subSet("Ashu","Shankar")); //[Ashu,Karan,Pratik]
		System.out.println(ss.first()); //[Ashu]
		System.out.println(ss.last()); //[Viraj]
	}
}
