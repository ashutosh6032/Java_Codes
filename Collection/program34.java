//Write a program to implement Dictionary interface in a Hashtable and implement its method
// key() elements() get(obj) remove(obj) 
 
import java.util.*;
class DictionaryDemo {
	public static void main(String[] args) {
		Dictionary dc = new Hashtable();

		dc.put(10,"Sachin");
		dc.put(7,"Msd");
		dc.put(18,"Virat");
		dc.put(1,"KLRahul");
		dc.put(45,"Rohit");

		System.out.println(dc);

		//keys() 
		Enumeration itr = dc.keys();
		while(itr.hasMoreElements()) {
			System.out.println(itr.nextElement());
		}

		//elements() 
		Enumeration itr2 = dc.elements();
		while(itr2.hasMoreElements()) {
			System.out.println(itr2.nextElement());

	        //get()
		System.out.println(dc.get(10));

		//remove()
		System.out.println(dc.remove(1));
	
		}
	}
}


