// write a program to crate a threadPool using ExecutorService and Executors // newSingleThreadExecutor()


import java.util.concurrent.*;

class Mythread implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread());
		dailyTask();
		System.out.println(Thread.currentThread());
	}
	void dailyTask() {
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie) {

		}
	}
}
class ThreadPoolDemo19 {
	public static void main(String[] args) {

		ExecutorService ser = Executors.newSingleThreadExecutor();

		for(int i=0;i<=10;i++) {
			Mythread obj = new Mythread();
			ser.execute(obj);
		}
		ser.shutdown();
	}
}

