// Write a program for Interrupted Exception in try and catch


 class Demo7 {
	 public static void main(String [] args)/*here throws Interrupted exception is also works*/ {

		 for(int i= 0;i<10;i++) {
			 System.out.println("In Loop");

			 try {
				 Thread.sleep(5000); //Thread class / sleep fun/ this is sleeps thread for 5 sec between print
			 } catch(Exception obj) {
			 
			 }
		 }
	 }
 }


