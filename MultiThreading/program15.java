// Write a program to create a thread group and childThread Group by implementing Runnable Interface

class Mythread implements Runnable {
	
	public void run() {
		System.out.println(Thread.currentThread());

		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie) {
			System.out.println(ie.toString());
		}
	}
}

class ThreadGroup15 {
	public static void main(String[] args) {
		ThreadGroup pthreadGp = new ThreadGroup("India");  //by using ThreadGroup class we can create a group of thread

		Mythread obj1 = new Mythread();
		Mythread obj2 = new Mythread();

		Thread t1 = new Thread(pthreadGp,obj1,"Maharashtra");   //we have to call three parameterized constructor of thread class 
                Thread t2 = new Thread(pthreadGp,obj2,"Goa");

		t1.start();
		t2.start();

		ThreadGroup cthreadGp = new ThreadGroup(pthreadGp,"Pakistan"); //childGroup creation
		
		Mythread obj3 = new Mythread();
		Mythread obj4 = new Mythread();
		
		Thread t3 = new Thread(cthreadGp,obj3,"Karachi");
		Thread t4 = new Thread(cthreadGp,obj4,"Lahore");
		
		t3.start();
		t4.start();

		ThreadGroup cthreadGp2 = new ThreadGroup(pthreadGp,"Bangladesh");

		Mythread obj5 = new Mythread();
		Mythread obj6 = new Mythread();

		Thread t5 = new Thread(cthreadGp2,obj5,"Dhaka");
		Thread t6 = new Thread(cthreadGp2,obj6,"Gazipur");

		t5.start();
		t6.start();

		System.out.println(pthreadGp.activeCount());
		System.out.println(pthreadGp.activeGroupCount());

	}
}




				





