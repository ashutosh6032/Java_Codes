// Write a program to create a threadpool using Executor interface and executors interface

import java.util.concurrent.*;
class Mythread implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread());
		dailyTask();
		System.out.println(Thread.currentThread());
	}
	void dailyTask() {
		try {
			Thread.sleep(8000);
		}catch(InterruptedException ie) {
		}
	}
}
class ThreadPoolDemo18 {
	public static void main(String[] args) {

		ExecutorService ser = Executors.newCachedThreadPool();

		for(int i=0;i<=10;i++) {
			Mythread obj = new Mythread();
			ser.execute(obj);
		}
		ser.shutdown();
	}
}
