//Write a program to create a ThreadGroup and its ChildGroup by Extends Thread Class


class Mythread extends Thread {
	Mythread(ThreadGroup tg,String str) {
		super(tg,str);
	}
	public void run() {
		System.out.println(Thread.currentThread());

		try {
			Thread.sleep(5000);
		}catch(InterruptedException ie) {
			System.out.println(ie.toString());
		}
	}
}
class ThreadGroupDemo16 {
	public static void main(String[] args) {
		ThreadGroup pthreadGp = new ThreadGroup("India"); //creating ThreadGroup and assign name

		Mythread obj1 = new Mythread(pthreadGp,"Maharashtra");// creating Thread in threadGroup
		Mythread obj2 = new Mythread(pthreadGp,"Goa");

		obj1.start();
		obj2.start();

		ThreadGroup cthreadGp = new ThreadGroup(pthreadGp,"Pakistan");//cretae a childGroup and pass the the parent class 

		Mythread obj3 = new Mythread(cthreadGp,"Karachi");
		Mythread obj4 = new Mythread(cthreadGp,"Lahore");

		obj3.start();
		obj4.start();

		ThreadGroup cthreadGp2 = new ThreadGroup(pthreadGp,"Bangladesh");//create 2nd childGroup and pass the parent class

		Mythread obj5 = new Mythread(cthreadGp2,"Dhaka");
		Mythread obj6 = new Mythread(cthreadGp2,"Gazipur");

		obj5.start();
		obj6.start();

		System.out.println(pthreadGp.activeCount()); //this methods of thread class gives active count of running thread
		System.out.println(pthreadGp.activeGroupCount());//this method gives us active group count of threads
	}
}

