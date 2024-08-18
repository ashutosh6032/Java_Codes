//Write a program for sort user defined data in the priority Queue using Comparator Interface

import java.util.*;
class Project {
	String Pname = null;
	int EmpCount = 0;
	int Duration = 0;

	Project(String Pname,int EmpCOunt,int Duration) {
		this.Pname = Pname;
		this.EmpCount = EmpCount;
		this.Duration = Duration;
	}

	public String toString() {
		return "{" + Pname + ":" + EmpCount + ":" + Duration + "}";
	}
}
class SortByPname implements Comparator {
	public int compare(Object obj1,Object obj2) {
		return (((Project)obj1).Pname).compareTo(((Project)obj2).Pname);
	}
}
class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(new SortByPname());

		pq.offer(new Project("Ashutosh",10,80));
		pq.offer(new Project("Viraj",9,90));
		pq.offer(new Project("Saurabh",6,100));
		pq.offer(new Project("Pratik",8,70));

		System.out.println(pq);
	}
}



