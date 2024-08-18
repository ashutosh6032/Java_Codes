// write a program to run iterator on Map 
// interator does not work directly on map
// so we have to covert map into set and then apply iterator on it

import java.util.*;
class IteratorMapDemo {
	public static void main(String[] args) {
		SortedMap sm = new TreeMap();
        
		sm.put("Ind","India");
                sm.put("Pak","Pakistan");
                sm.put("Sl","Shri-Lanka");
		sm.put("Aus","Austalia");
                sm.put("Ban","Bangladesh");

		System.out.println(sm);

		Set<Map.Entry>data = sm.entrySet();
		Iterator<Map.Entry>itr = data.iterator();

		while(itr.hasNext()) {
			//1st way
		//	System.out.println(itr.next());
			
			//2nd way() 
			Map.Entry abc = itr.next();
			System.out.println(abc.getKey() +":"+ abc.getValue());
		}
	}
}





  
