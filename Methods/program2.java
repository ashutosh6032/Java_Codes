//Write a program to call the method from main method and pass the argument to mathod parameters


 class MethodDemo {
	 void fun(int x){
		 System.out.println("In Fun");
		 System.out.println(x);
	 }
	 public static void main(String [] args ) {
		 MethodDemo obj = new MethodDemo();
		 obj.fun(10);
	 }
 }
