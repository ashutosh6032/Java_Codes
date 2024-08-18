//GArbage Collector Working On WeakHashMap
//it is used for autodeleting the null data present in hte hashmap
//because garbage collector not works on HashMap

import java.util.*;
class Demo {
	String str = null;
	
	Demo(String str) {
		this.str = str;
	}
     	public String toString() {
		return str;
	}
	public void fianlize() {
		System.out.println("Notify");
	}
}
class GCDemo {
	public static void main(String[] args) {

		Demo obj1 = new Demo("Core2Web");
		Demo obj2 = new Demo("Incubator");
		Demo obj3 = new Demo("Biencaps");

		WeakHashMap wm = new WeakHashMap();
		wm.put(obj1,2016);
		wm.put(obj2,2019);
		wm.put(obj3,2023);

		System.out.println(wm);
		
		obj2 = null;
		obj3 = null;

		System.gc(); //call to Garbage Collector
		
		System.out.println(wm);
	}
}

		
	


