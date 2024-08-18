// Write a program for the annonymous inner class
// in this type of inner class the class is annonymous(no name)

 class Demo {
	 void fun() {
		 System.out.println("In Fun-Demo");
	 }
 }
 class Client5 {
	 public static void main(String[] args) {
		 Demo obj = new Demo() {
			 void fun() {
				 System.out.println("In Fun-inner");
			 }
			 obj.fun();
		 };
	 }
 }
