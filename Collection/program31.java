//implement the SortedMap and its Methods 

import java.util.*;
class SortedMapDemo {
	public static void main(String[] args) {
		SortedMap sm = new TreeMap();
		
		sm.put("Ind","India");
		sm.put("Pak","Pakistan");
		sm.put("Sl","Shri-Lanka");
		sm.put("Aus","Austalia");
		sm.put("Ban","Bangladesh");
		
		System.out.println(sm); //{Aus=Austalia, Ban=Bangladesh, Ind=India, Pak=Pakistan, Sl=Shri-Lanka}

		//subMap(k.K)
		System.out.println(sm.subMap("Aus","Pak"));//{Aus=Austalia, Ban=Bangladesh, Ind=India}

	       //headMap(k)
	       System.out.println(sm.headMap("Pak"));//{Aus=Austalia, Ban=Bangladesh, Ind=India}

	       //tailMap(k)
	       System.out.println(sm.tailMap("Pak"));//{Pak=Pakistan, Sl=Shri-Lanka}

	       //firstKey() 
	       System.out.println(sm.firstKey()); //Aus

	       //lastKey()
	       System.out.println(sm.lastKey());//Sl

	       //keySet()
	       System.out.println(sm.keySet());//[Aus,Ban,Ind,Pak,Sl]
	       
	       //values()
	       System.out.println(sm.values());//[Australia,Bangladesh,India,pakistan,Srilanka]
	      
	       //entrySet()
	       System.out.println(sm.entrySet());//[Aus=Austalia, Ban=Bangladesh, Ind=India, Pak=Pakistan, Sl=Shri-Lanka]
	}
}

