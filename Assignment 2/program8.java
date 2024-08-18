// Write a program to reverse the given number
// input:942111423
// o/p:324111249
 

 class Reverse {
         public static void main(String [] args ) {
		 int n =942111423;
		 int rev=0;

		 while(n!=0) {
			 int rem = n%10;
			 rev = (rev*10)+rem;
			 n=n/10;
		 }
		 System.out.println(rev);
	 }
 }

