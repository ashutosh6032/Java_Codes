// Null Pointer Exception
// it is Runtime Exception


 class Demo {
	 void m1() {
		 System.out.println("In M1");
	 }

	 void m2() {
		 System.out.println("In m2");
	 }
 }
 class Client2 {
	 public static void main (String[] args) {
		 Demo obj = new Demo();
		 obj.m1();

		 obj = null;  // Exception comes here because of we assign value for obj is null so further calls geting stopped 

		 obj.m2();
		 System.out.println("main end");
	 }
 }
