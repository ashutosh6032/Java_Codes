// Write program to access outer class methods and variables from inner class


 class Outer {
	 int x = 10;
	 static int y =20;

	  class Inner {

		  void fun() {
			  System.out.println("fun-inner");
			  System.out.println(x);
			  System.out.println(y);
			  fun1();
		  }
	  }

	  void fun1() {
		  System.out.println("In fun-Outer");
	  }

 }
 class Client8 {
	 public static void main(String[]args) {
		 Outer obj = new Outer();
		 Outer.Inner obj1 = obj.new Inner();
		 obj1.fun();
	 }
 }
