//Write a program for static nested or static inner class 
//in this type of inner class inner class can be defined as static 


 class Outer {
	 void fun() {
		 System.out.println("In FUn-Outer");
	 }

	static class Inner {
		 void fun() {
			 System.out.println("In Inner-fun");
		 }
	}
 }
 class Client4 {
	 public static void main(String[] args) {
		 Outer obj = new Outer();
		 obj.fun();
	 }
 }


//in this type of inner class we dont have to create a object of inner class
