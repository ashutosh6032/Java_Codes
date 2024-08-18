// use enumeration cursor 
// its is works on only vector and stack
// methods //hasMoreElement() nextElement() 

import java.util.*;
class EnumarationDemo {
	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);

		System.out.println(v);

		Enumeration cursor = v.elements();

		while(cursor.hasMoreElements()) {
			System.out.println(cursor.nextElement());
		}
	}
}
