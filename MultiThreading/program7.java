// Write a code for see priority and by using of setpriority() method how to set priority of thread


 class Mythread extends Thread {
	  public void run() {
		  Thread t = Thread.currentThread();
		  System.out.println(t.getPriority());
	  }
 }
 class ThreadDemo7 {
	 public static void main(String [] args) {
		 Thread t = Thread.currentThread();
		 System.out.println(t.getPriority());

		 Mythread obj1 = new Mythread();
		 obj1.start();

		 t.setPriority(7);   // this method has set the priority to the particular thread

		 Mythread obj2 = new Mythread();
		 obj2.start();
	 }
 }
