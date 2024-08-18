// Writw a program for creating a threadPool by using executor interface and Executors interface


import java.util.concurrent.*;
class Mythread implements Runnable {
	int num;
	Mythread(int num) {
		this.num = num;
	}
	public void run() {
		System.out.println(Thread.currentThread() +"Start Thread"+ num);
		dailyTask();
		System.out.println(Thread.currentThread()+ "End Thread" + num);
	}
	void dailyTask() {
		try {
			Thread.sleep(8000);
		}catch(InterruptedException ie) {
		}
	}
}

class ThreadPoolDemo17 {
	public static void main(String[] args) {

		ExecutorService ser = Executors.newFixedThreadPool(5);

		for(int i=1;i<=6;i++) {
			Mythread obj =new Mythread(i);
			ser.execute(obj);
		}
		ser.shutdown();
	}
}
