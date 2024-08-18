// Write a program to call inner class method or class


 class Outer {

	 class Inner {
		 void fun() {
			 System.out.println("In Inner-fun");
		 }
	 }
	 void fun() {
		 System.out.println("In outer-fun");
	 }
 }
 class Client2 {
	 public static void main (String[] args) {
		 Outer.Inner obj = new Outer().new Inner();
		 obj.fun();
	 }
 }
