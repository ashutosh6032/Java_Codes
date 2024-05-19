// Write a program to print numbers and stop the printing when we nuber get which is divisible by 3 and 5



 class Break {
	 public static void main(String[] args) {
		 int x = 50;

		 for(int i=1;i<=x;i++) {
			 if(i%3==0 && i%5==0) {
				 break;
			 }
			 System.out.println(i);
		 }
	 }
 }
