// Write a program to implement of join() method of thread class


 class Mythread extends Thread {
	 public void run() {
		 
		 for(int i=1;i<=10;i++) {
			 System.out.println("In Mythread");
		 }
	 }
 }

 class ThreadDemo9 {
	 public static void main(String[] args) throws InterruptedException {

		 Mythread obj = new Mythread();
		 obj.start();

		 obj.join();  //this method gives all priority to the new thread it cannot runs until the new thread cannot complete its execution

		 for(int i=0;i<=10;i++) {
			 System.out.println("In Main");
		 }
	 }
 }

