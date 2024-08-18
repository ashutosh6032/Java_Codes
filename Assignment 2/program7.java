// Write a program if no. is even print that no. in reverse orderor if no.is odd print the no. in reverse by difference 2
// input:6
// o/p:6 5 4 3 2 1
// input: 7
// o/p: 7 5 3 1


 class Reverse {
	 public static void main (String [] args) {
		 int x = 7;
		 int i = x;

		 while(i>=1) {
			 if(x%2==0) {
				 System.out.println(i);
				 i--;
			 }else {
			       i = i-2;
			      System.out.println(i);
			 }
			 
		 }
	 }
 }
