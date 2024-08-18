// write a multithreading code by using the runnable interface
// we have to implements the runnable class
// and in the client or user class we have to create two objects one of that class and other of threadclass and we have to pass the obj of that class
// as parameter in the object of the class which we have implements



 class MyThread implements Runnable {
	 public void run() {
		 System.out.println("In run");
		 System.out.println(Thread.currentThread().getName());
	 }
 }

 class ThreadDemo6 {
	 public static void main(String[] args) {
		 System.out.println(Thread.currentThread().getName());

		 MyThread obj = new MyThread();
		 Thread t = new Thread(obj); // we have to call the parameterised construtor of the thread class for the creating a thread
		 t.start();
	 }
 }
