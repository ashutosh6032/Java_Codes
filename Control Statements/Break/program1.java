//write a optimized code for prime number


 class Prime {
	 public static void main(String [] args) {
		 int n = 15;
		 int count = 0;

		 for(int i=1;i<=n;i++) {
			 if (n%i==0) {
				 count++;
			 }
			 if(count>2) {
				 break;
			 }
		 }
	 if(count==2) {
		 System.out.println("it is Prime number");
	 }else{
		 System.out.println("It is Not a Prime number");
	 }
	}
 }

