// in the program of multithreading we not havr to override the start() method of Thread class otherwise we can change his work or behaviour because of start()
// call run function and then child thread or newly created thread can start to run

 class MyThread extends Thread {
	 public void run() {
		 System.out.println("In Run");
		 System.out.println(Thread.currentThread().getName());
	 }
	 public void start() {
		 System.out.println("In MyThread start");
	 }
 }
 class ThreadDemo {
	 public static void main(String[] args) {
		 MyThread obj = new MyThread();
		 obj.start();
		 System.out.println(Thread.currentThread().getName());
	 }
 }
