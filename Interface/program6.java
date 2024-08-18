//how to get access to interface variables

 interface A {
	 int x = 10;
 }
 interface B {
	 int x = 10;
 }
 class DemoChild implements A,B {
	 int x = 30;
	 void fun() {
		 System.out.println(x);
		 System.out.println(A.x); //call the variable by name of interface
		 System.out.println(B.x);
	 }
  }
 
 class Client6 {
	 public static void main(String[] args) {
		 DemoChild obj = new DemoChild();
		 obj.fun();
	 }
 }

