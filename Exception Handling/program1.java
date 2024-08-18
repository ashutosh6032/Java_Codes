// Default Exception Handler: it is a part of JVM and it comes in picture when exception occures and it gives exception in format 
// Arithmatic Exception 
// It is Runtime Exception
 class Demo {
	 void m1() {
		 System.out.println(10/0);  //Exception comes Here because of its arithmatic exception
	 }

	 void m2() {
		 System.out.println("In m2");
	 }

 }
 
 class Client1 {
	 public static void main(String[] args) {
		 Demo obj = new Demo();
		 obj.m1();
		 obj.m2();
	 }
 }
