// write a program to print number when a number which is divisible by 3 then stop print the number



 class Break {
	 public static void main ( String [] args) {
		 int x = 50;

		 for(int i=1;i<=x;i++) {
			 if(i%3==0) {
				 break;
			 }
			System.out.println(i);
		 }
	 }
 }
