//write a program to call a non static method in main class


 class Demo {
	 int x =10;
	 static int y =20;

	 void fun() {
		 System.out.println("In Function");
		 System.out.println(x);
		 System.out.println(y);
	 }
	 public static void main (String[] args) {
		 Demo obj = new Demo();
		 obj.fun();
	 }
 }
