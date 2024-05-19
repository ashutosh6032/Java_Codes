// Write a java program to skip the number which is divisible by 3 and 5 or 4 upto 50
  

 class Continue {
	 public static void main(String [] args) {
		 int x =50;

		 for(int i=1;i<=x;i++) {
			 if( (i%3==0 && i%5==0) || (i%4==0) ) {
				 continue;
			 }
			 System.out.println(i);
		 }
	 }
 }

