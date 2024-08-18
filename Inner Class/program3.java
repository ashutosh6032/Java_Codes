// Write a program for method local inner class 
// in this type of inner class, class is defined in the method


 class Outer {
	  
	 void fun() {
		 System.out.println("In Fun outer");

		 class Inner {
			 void fun() {
				 System.out.println("In Fun-inner");
			 }
		 }
		Inner obj = new Inner();
		obj.fun();
	 }
	 void fun2() {
		 System.out.println("In Fun2 Outer");
	 }
 }
 class Client3 {
	 public static void main(String[] args) {
		 Outer obj = new Outer();
		 obj.fun();
		 obj.fun2();
	 }
 }

