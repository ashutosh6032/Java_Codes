

 class Demo extends Thread {
	 public void run() {
		 System.out.println(Thread.currentThread().getName());
	 }
 }

 class Mythread extends Thread {
	 public void run() {
		 System.out.println(Thread.currentThread().getName());
	 }
 }
 class ThreadDemo5 { 
	 public static void main(String[] args) {

		 System.out.println(Thread.currentThread().getName());

		 Mythread obj = new Mythread();
		 Demo obj2 = new Demo();

		 obj2.start();
		 obj.start();
	 }
 }

