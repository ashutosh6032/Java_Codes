//use ListIterator 
//Listiterator is only used on the List
//it is bidiractional //methods hasNext() hasPrevious() hasRemove()

import java.util.*;
class ListIteratorDemo{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20.5);
		al.add(30.5f);
		al.add("C2w");

		ListIterator litr =al.listIterator();
		System.out.println(litr.getClass().getName());

		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
}
