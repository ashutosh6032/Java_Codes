//Write a program to implement the cocurrency methods of thread class
// 1. sleep 2. join 3.yeild


 class Mythread extends Thread {
	 public void run() {
		 System.out.println(Thread.currentThread());
	 }
 }
 
 class ThreadDemo8 {
	 public static void main(String[] args) throws InterruptedException {

		 System.out.println(Thread.currentThread());

		 Mythread obj = new Mythread();
		 obj.start();

		 Thread.sleep(2000);

		 Thread.currentThread().setName("Navin nav");
		 System.out.println(Thread.currentThread());
	 }
 }

