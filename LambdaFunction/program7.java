//Lamda function with Comaprator Interface 


import java.util.*;
class Employee {
	int Empid = 0;
	String Empname = null;

	Employee(int Empid,String Empname) {
		this.Empid = Empid;
		this.Empname = Empname;
	}
	public String toString() {
		return "{" + Empid + ":" + Empname + "}";
	}
}
class Sortbyname implements Comparator{
	public int compare(Object obj1,Object obj2) {
		return ((Employee)obj1).Empname.compareTo(((Employee)obj2).Empname);
	}
}
class Client {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(new Employee(10,"Shankar"));
		al.add(new Employee(11,"Pratik"));
		al.add(new Employee(5,"Viraj"));
		al.add(new Employee(24,"Ashutosh"));

		Collections.sort(al,new Sortbyname());
		System.out.println(al);
	}
}
