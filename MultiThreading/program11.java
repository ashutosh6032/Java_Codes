// write a program to set name to the Thread using setName() method


 class Mythread extends Thread {
	 public void run() {
		 System.out.println(getName());
		 System.out.println(Thread.currentThread().getName());
	 }
 }
 class ThreadDemo11 {
	 public static void main(String[] args) {

		 Mythread obj = new Mythread();
		 obj.start();

		 obj.setName("Ashutosh");

		 System.out.println(Thread.currentThread().getName());
	 }
 }
