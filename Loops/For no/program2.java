 //Writw a program to check wheather the number is Automorphic or not.
 //Automorphic Number: the last number of  square of number is thst number
 //eg. 5 : 25 
 //25: 625
 

 class Automorphic {
	 public static void main( String [] args) {
		 int n =25;
		 int count =0;
		 int square=n*n;
                 int temp1= square;
		 int temp2=n;
		 int rev=0;
		 int reverse=0;

		 while(n!=0) {
			 count++;
			 n= n/10;
		 }
		 for(int i=1;i<=count;i++) {
			 int rem= temp1 % 10;
			 rev = (rev*10)+ rem;
			 temp1 = temp1/10;
		 }
		 while(rev!=0) {
			 int rem = rev % 10;
			 reverse = (reverse*10)+ rem;
			 rev = rev/10;
		 }
		 if(reverse==temp2) {
			 System.out.println("it is Automorphic number");
		 }else {
			 System.out.println("it is not Automorphic");

		}
	 }
 }

