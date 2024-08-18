//write aprogram to convert ArrayList to Array
//for this we have to use ....java.lang.object[] toArray(); method


 import java.util.*;

 class ArrayListDemo2 {
	 public static void main(String[] args) {
		 ArrayList al = new ArrayList();

		 al.add(10);
		 al.add(20);
		 al.add("Ashu");

		 Object arr[] = al.toArray();
		 System.out.println(arr); //prints address

		 for(Object data:arr) {
			 System.out.print(data+ " ");
		 }
		 System.out.println();
	 }
 }




