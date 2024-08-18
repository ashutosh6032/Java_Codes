//forEach() method of Iterable Interface(parent of collection) 

import java.util.*;
class ForEachDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(30);
		al.add(40);
		al.add(20);

		System.out.println(al);  //[10,30,40,20]

		al.forEach((data)->System.out.println(data));//10
							     //30
							     //40
							     //20
	}
}
