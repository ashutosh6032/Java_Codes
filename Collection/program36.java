//Write a program for sort user defined data in the priority Queue using Comparable Interface

import java.util.*;
class Demo1 implements Comparable {
	String Pname = null;
	int EmpCount = 0;
	int Duration = 0;

	Demo1(String Pname,int EmpCount,int Duration) {
		this.Pname = Pname;
		this.EmpCount = EmpCount;
		this.Duration = Duration;
	}

	public String toString() {
		return "{" + Pname + ":" + EmpCount + ":" + Duration +"}";
	}

	public int compareTo(Object obj) {
		//return Pname.compareTo(((Demo1)obj).Pname);
		return Duration - (((Demo1)obj).Duration);

	}
}
class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();

		pq.offer(new Demo1("Ashutosh",8,70));
		pq.offer(new Demo1("Pratik",9,90));
		pq.offer(new Demo1("Saurabh",7,50));
		pq.offer(new Demo1("Viraj",9,65));
		pq.offer(new Demo1("Akash",8,75));

		System.out.println(pq);
	}
}



