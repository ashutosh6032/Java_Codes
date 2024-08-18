//ArrayList is child class Of List Interface 
//it can store a hetrogeneous data in the arraylist
//it has no fix size
//it can store or initialize data by the sequence of insertion of data
//it can allow duplicate data


import java.util.*;

class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		//add(Element)
		al.add(10);
		al.add(20.5f);
		al.add("Ashu");
		al.add(10);
		al.add(20.5f);

		System.out.println(al);

		//viod add(int,E)
		al.add(3,"Core2web");
		System.out.println(al);

		//int size()
		System.out.println(al.size());
		
		//boolean contains(obj)
		System.out.println(al.contains("Ashu"));

		//int indexOF(obj)
		System.out.println(al.indexOf(10));

		//int lastIndexOf(obj)
		System.out.println(al.lastIndexOf(20.5f));

		//E get(int)
		System.out.println(al.get(3));

		//E set(int,E)
		System.out.println(al.set(3,"Ashutosh"));
		System.out.println(al);

		ArrayList al2 = new ArrayList();
		al2.add("Pratik");
		al2.add("Shubham");
		al2.add("Sagar");

		//boolean addAll(Collection)
		al.addAll(al2);
		System.out.println(al);

		//boolean addAll(int,Collection)
		al.addAll(3,al2);
		System.out.println(al);

		//E remove(int)
		System.out.println(al.remove(3));
		System.out.println(al);

		//boolean remove(obj)
		//sop(al.remove("Shubham")

		//void clear()
		//al.clear();

	}
}
