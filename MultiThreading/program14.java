// create a child thread group in the threadGroup



class Mythread extends Thread {
	
	Mythread(ThreadGroup TG,String str) {
		super(TG,str);
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());
	}
}

class ThreadDemo14 {
	public static void main(String[] args) {
	
		ThreadGroup TG = new ThreadGroup("Core2Web");

		Mythread obj1 = new Mythread(TG,"C");
		Mythread obj2 = new Mythread(TG,"cpp");
		Mythread obj3 = new Mythread(TG,"JAVA");

		ThreadGroup CG = new ThreadGroup(TG,"Sinhgad");

		Mythread obj4 = new Mythread(CG,"Flutter");
		Mythread obj5 = new Mythread(CG,"DART");
		Mythread obj6 = new Mythread(CG,"App Development");
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
		obj6.start();


		System.out.println(Thread.currentThread());
		
	}
}


