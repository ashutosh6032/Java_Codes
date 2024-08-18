// Write a yield method and and implement it
// it works same as parameterised join() method
// this method is lessly used in the the multithreading 
//


 class Mythread extends Thread {
	 public void run() {
		 System.out.println(Thread.currentThread().getName());
	 }
 }
 class ThreadDemo10 {
	 public static void main(String[] args) {

		 Mythread obj = new Mythread();
		 obj.start();

		 obj.yield();

		 System.out.println(Thread.currentThread().getName());
	 }
 }

