// Write a program to check the given number is Strong number or not.
// Strong number:the sum of factorial of each digit is equal to original number


 class Strong {
	 public static void main(String []args) {
		 int n= 145;
		 int sum= 0;
		 int multi = 1;
		 int temp = n;
		 

		 while(n!=0) {
			 int rem = n%10;
			 
			 for(int i=1;i<=rem;i++) {
				 multi =multi*i;
			 }
			 sum = sum + multi;
			 multi = 1;
			 n = n/10;
		 }
		 if(temp==sum) {
			 System.out.println(temp+ " is a Strong Number" );
		 }else {
			 System.out.println(temp+ " is not Strong number" );
		 }
	 }
 }
