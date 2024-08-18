// write a program to sort the arraylist user defined data with the comparator interface and overrride its compare method()
// implements Comparator
// public int compare()

import java.util.*;
class Employee {
	String empname = null;
	float sal = 0.0f;

	Employee(String empname,float sal) {
		this.empname = empname;
		this.sal = sal;
	}
	public String toString() {
		return "{" + empname + ":" + sal + "}";
	}
}

class Sortbyname implements Comparator<Employee> {
	public int compare(Employee obj1,Employee obj2) {
		return (obj1.empname).compareTo(obj2.empname);
	}
}

class Sortbysal implements Comparator<Employee> {
	public int compare(Employee obj1,Employee obj2) {
		return(int)((obj1.sal)-(obj2.sal));
	}
}

class SortListDemo {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
	
		al.add(new Employee("Ashutosh",2000000.0f));
		al.add(new Employee("Shankar",1500000.0f));
		al.add(new Employee("Viraj",1400000.0f));
		al.add(new Employee("Pratik",1300000.0f));
		
		System.out.println(al);

		Collections.sort(al,new Sortbyname());
		System.out.println(al);
		
		Collections.sort(al,new Sortbysal());
		System.out.println(al);
	}
}


