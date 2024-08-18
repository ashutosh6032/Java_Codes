//constructor initialization


 class Clsobj1 {
	 int y =20;  //Global nonstatic/instance variable

	 static void fun() {
		 int z=30; //local variable
	          System.out.println(z);
	 }

	 public static void main(String[] args) {
		 int x=10;  //local variable
	        fun();
	 }
 }
