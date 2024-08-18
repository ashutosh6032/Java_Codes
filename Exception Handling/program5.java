//Write a program for the Exception handling method using try and catch


 class Demo5 {
	 public static void main(String[] args) {
		 System.out.println("Start main");

		 try {
			 System.out.println(10/0);
		 } catch(ArithmeticException obj) {
			 System.out.println("Exception occuerd");
		 }

		 System.out.println("End main");
	 }
 }

