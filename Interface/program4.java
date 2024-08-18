//write a program for the variables of variables of inteface
//they are by default public static final ....


 interface Demo {
	 int x = 10;
	 void fun();
 }
 class Demochild implements Demo {
	 public void fun() {
		 System.out.println(x);
		 System.out.println(Demo.x); //we access the variables of interface using the name of interface
	}
 }
 class Client4 {
	 public static void main(String[] args) {
		 Demo obj = new Demochild();
		 obj.fun();
	 }
 }
