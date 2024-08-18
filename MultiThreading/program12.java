// write a program to give name to child Thread to at time of its creates
// second way of give name to the thread without using setname()
//


class Mythread extends Thread {

	Mythread(String str) {
		super(str); // this call to thread class Cons. and this str parameter give name to the newly created thread
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo12 {
	public static void main(String[] args) {

		Mythread obj = new Mythread("Ashutosh");
		obj.start();

		System.out.println(Thread.currentThread().getName());

	}
}

