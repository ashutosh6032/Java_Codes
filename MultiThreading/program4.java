//write a program to create a multiple threads from thread class


 class Demo extends Thread {
	 public void run() {
	 System.out.println( Thread.currentThread().getName());
	 }
 }
 
 class MyThread extends Thread{
	 public void run() {
		 System.out.println( Thread.currentThread().getName());

		 Demo obj = new Demo();
		 obj.start();

	 }
 }

 class ThreadDemo4 {
	 public static void main( String[] args) {
		 System.out.println(Thread.currentThread().getName());

		 MyThread obj2 = new MyThread();
		 obj2.start();

	 }
 }

