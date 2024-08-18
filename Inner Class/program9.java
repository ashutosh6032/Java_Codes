// static is not allowed in the inner class

 class Outer {
	 int a = 10;
	 static int b = 20;
	  
	 class Inner {
		 int c = 30;
		 static int d = 40; //error

	 }
 }

 //Error: Illegal static declaration in Inner class 
 // Outer.Inner   static int d = 40;
