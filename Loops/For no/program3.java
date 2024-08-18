// write a program to check the number is Armstrong number or not.
// Armstrong Number:The sum of square of all digits is that number
// 153=3 digit= sum of cube of each digit= 153
// 25= 2 digit= sum of square of each digit
 

 class Armstrong {
	 public static void main(String[]args) {
		 int n = 153;
		 int count = 0;
		 int multi =1;
		 int sum = 0;
		 int temp= n;
		 int temp1=n;

		 while(n!=0) {
			 count++;
			 n = n/10;
		 }
		 while(temp!=0) {
			 int rem =temp%10;
			  for(int i=1;i<=count;i++) {
				  multi=multi*rem;
			  }
			  sum =sum +multi;
			  multi=1;
			  temp= temp/10;
		 }
	      if(temp1==sum) {
		      System.out.println(temp1+"is a Armstrong no.");
	      }else {
		      System.out.println(temp1+"not armstrong number");
	      }
	 }
 }

