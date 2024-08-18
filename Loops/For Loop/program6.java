//write a program, Take n as input and print wheather its prime or not.
// note: Prime number means the no. which have exactly 2 factors

 class Prime { 
	 public static void main(String [] args) {
		 int n = 11;
		 int count = 0;

		 for(int i=1;i<=n;i++) {
			 if(n%i==0) {
				 count++;
			 }
		 }
		 if(count==2) {
			 System.out.println("it is Prime Number");
		 }else {
			 System.out.println("it is not Prime Number");
		 }
	 }
 }
  
