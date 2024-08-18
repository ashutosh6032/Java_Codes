// Write a program for normal inner class 
// There are two parameters to Inner class Constructor 1.Hidden This 2.Outer class
// Outer$Inner(Outer$Inner.This,Outer This$0)
// This$0 is only for knowing object of inner class is called from which Outer class object


 class Outer {

	 class Inner {
		 void fun1() {
			 System.out.println("In fun-Inner");
		 }
	 }

	 void fun() {
		 System.out.println("In fun-Outer");
	 }
 }
 class Client7 {
	 public static void main (String[] args) {

		 Outer obj = new Outer();  //Outer(Obj)
		 obj.fun();

		 Outer.Inner obj1 = obj.new Inner();
		 obj1.fun1();  //Outer$Inner(obj1,obj)

		 Outer.Inner obj2 = new Outer().new Inner();
		 obj2.fun1();  //Outer$Inner(obj2,obj)
	 }
 }

