// Write a code for run threads simultaneously and make a sleep for thread function for specific time


 class MyThread extends Thread {
	 
	 public void run() {
	 System.out.println(Thread.currentThread().getName());
	 for(int i=0;i<10;i++){
		 System.out.println("In Run");
		try {
		       	Thread.sleep(2000);
		} catch(InterruptedException obj) {

		}
	 }
 }
 }

 class ThreadDemo2 {
	 public static void main(String[] args) throws InterruptedException {
		 MyThread obj = new MyThread();
		 obj.start();

		 System.out.println( Thread.currentThread().getName());

		 for(int i=0;i<10;i++) {
			 System.out.println("In Main");
			 Thread.sleep(2000);
		 }
	 }
 }


