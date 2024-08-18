// Defining static in classes of parent child relationship


 class Parent {
	 int x = 10;
	 static int y = 20;

	 void m1() {
		 System.out.println("In Parent");
	 }
	 static void m2() {
		 System.out.println("In Parent");
	 }
 }
 class Child extends Parent {
	 int a = 50;
	 static int b = 60;

	 void m1() {
		 System.out.println("In Child");
	 }
	 static void m3() {
		 System.out.println("In Child");
	 }
 }
 class Client6 {
	 public static void main (String[] args) {
		 Parent obj = new Child();
		 obj.m1();
		 obj.m2();
		 
		 Child obj1 = new Child();
		 obj1.m1();
		 obj1.m2();
		 obj1.m3();
		 
		 Parent obj2 = new Parent();
		 obj2.m1();
		 obj2.m2();

	 }
 }
