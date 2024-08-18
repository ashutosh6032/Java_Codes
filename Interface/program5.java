//static keyword in interface


 interface Demo {
	 static void fun() {
		 System.out.println("In Static fun");
	 }
 }
 class Demochild implements Demo {
 
 }
 class Client4 {
	 public static void main(String[] args) {
		 Demo obj = new Demochild();
		 obj.fun();  //Error. because of static methid in interface cannot comes in chlid class
		}
 }
