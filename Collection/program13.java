//store and print the data in the linkedList of userDefined classes

import java.util.*;
class CricPlayer {
	String name = null;
	int jerNo = 0;
	CricPlayer(String name,int jerNo) {
		this.name = name;
		this.jerNo = jerNo;
	}
	public String toString() { //this method is for printing data of class without this method user can only print address
		return "{" + name + ":" + jerNo +"}";
	}
}
class SetDemo {
	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();

		hs.add(new CricPlayer("Virat",18));
		hs.add(new CricPlayer("Dhoni",7));
		hs.add(new CricPlayer("Rohit",45));
		hs.add(new CricPlayer("Dhoni",7)); // in the scenario of user defined class they cosider each object is 
						   // different because each call of class is new
	        
	       System.out.println(hs);
	}
}


		
