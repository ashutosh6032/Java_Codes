 //Write a program which count the numbers in given number
 
 class Count {
	 public static void main (String []args) {
		 int N = 942111423;
		 int count = 0;

	     while (N!=0) {
		     int rem = N%10;
		     count++;
		     N = N/10;
	     }
	     System.out.println(count);
	 }
 }
 
