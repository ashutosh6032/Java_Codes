//Write a program for interface with method body and its overriding in child class


 interface Demo {
	 void fun();
	 default void gun() {
		 System.out.println("In Fun demo");
	 }
 }
 class Demochild implements Demo {
	 public void fun() {
		 System.out.println("In ChildDemo fun");
	 }
 }
 class Client2 {
	 public static void main(String [] args) {
		 Demo obj = new Demochild(); //parent reference and child object // we does not create object of interface
		 obj.fun();
		 obj.gun();
	 }
 }


