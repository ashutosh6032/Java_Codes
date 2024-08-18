// Write a program to print sum of all even numbers and multiplication of odd numbers between 1 to 10
// o/p:sum of all even no. between 1 to 10 =30 
//    :multiplication of all odd no. between 1 to 10 = 945


 class Between {
	 public static void main(String [] args) {
		 int i = 1;
		 int n = 10;
		 int sum = 0;
		 int multi = 1;

		 while(i<=n) {
			 if(i%2==0) {
				 sum = sum + i;
			 }else {
				 multi = multi *i;
			 }
			 i++;
			}
	 System.out.println("Sum of all even no. between 1 to 10  = "+sum);
	 System.out.println("Multiplication of all odd no. between 1 to 10 = " +multi);
	 }
 }

		 

