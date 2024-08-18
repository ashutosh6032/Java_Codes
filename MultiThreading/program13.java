// Write a program for create a thread group and that groups child thread and give its name
//we have to write a 2 parameterised constructor (ThreadGroup Tg,String str)
//then in the class We have to create an object of th ThreadGroup class 
//and then we have to create object which in our run method is, and we have to give 2 parameters to that object of thread creation
//new....(ThreadDemo object,"str ");


class Mythread extends Thread {
	Mythread(ThreadGroup tg,String str) {
		super(tg,str);
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo13 {
	public static void main(String[] args) {

		ThreadGroup TG = new ThreadGroup("Core2Web");

		Mythread obj1 = new Mythread(TG,"C");
		Mythread obj2 = new Mythread(TG,"CPP");
		Mythread obj3 = new Mythread(TG,"JAVA");

		obj1.start();
		obj2.start();
		obj3.start();
	}
}

