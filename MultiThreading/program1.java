// Write a program for creating a new thread in the program using Thread class
//we have to extens The thread class in our class and when we create a obj of that class in other class then the Thread class is automatically creates a new thread


 class MyThread extends Thread {
	 public void run() {
		 for(int i=0;i<10;i++) {
			 System.out.println("In Run");
		 }
	 }
 }
 
 class ThreadDemo {
	 public static void main(String[] args) {
		 MyThread obj = new MyThread();  // this line is very imp for thread creation
		 obj.start();  //this is function of Thread class responsible for start run the thread
	        
		 for(int i=0;i<10;i++) {
			 System.out.println("In MaIn");
		 }
	 }
	 
 }

