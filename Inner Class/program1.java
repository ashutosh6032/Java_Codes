// write a program to call a method of inner class

 class Outer {

	 class Inner {
		 void fun() {
			 System.out.println("In Inner-Fun");
		 }
	 }
	 void fun1() {
		 System.out.println("In Outer-Fun");
	 }
 }
 
 class Client1 {
	 public static void main(String[] args) {
		 Outer obj = new Outer();
		 obj.fun1();

		 Outer.Inner obj1 = obj.new Inner();
		 obj1.fun();
	 }
 }
