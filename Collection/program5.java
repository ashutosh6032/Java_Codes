//use of cursors in the collection for performing opertions on collection there are four types of cursors
//1.Iterator 2.ListIterator 3.Enumeration 4.Splitrator
//1.Iterator= it is a universal cursor 
//it moves in only one direction in collection // 3 methods hasNaxt() next() remove()


import java.util.*;
class Iterator1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add("Ashutosh");
		al.add("shankar");
		al.add("Viraj");
		al.add("pratik");
		
		Iterator itr = al.iterator();
			while(itr.hasNext()) {
				if("viraj".equals(itr.next()));
				itr.remove();
				System.out.println(itr.next());
			}
			System.out.println(al);
		
	}
}

