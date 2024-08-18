//write a interface with method body //this allows in only after version 1.8



 interface One {
	 static void fun() {
		 System.out.println("In fun Demo");
	 }
	 default void gun() {
		 System.out.println("In gun Demo");
	 }
 }
