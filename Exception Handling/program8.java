// write a progam for finally block of exception handling


 class Demo8 {
	 void m1() {
		 System.out.println("In m1");
	 }
	 void m2() {
		 System.out.println("In m2");
	 }

	 public static void main(String[] args) {
		 Demo obj = new Demo();

		 obj.m1();
		
		 obj = null;

		try {
		       	obj.m2();
		} catch(NullPointerException npe) {
			System.out.println(" NullPointerException");
		}finally {
			System.out.println("Connection closed"); //in any condition finally block can get executed it not depend on exception
			}
	 }
 }

