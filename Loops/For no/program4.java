// Write a program to check wheather the number is perfect number or not.
// Perfect no: sum of all factorials without that no. is that no.
// 6: 1+2+3


 class Perfect {
	 public static void main(String[]args) {
		 int n =6;
		 int sum= 0;

		 for(int i=1;i<n;i++) {
			 if(n%i==0) {
				 sum =sum +i;
			 }
		 }
		 if(sum==n) {
			 System.out.println(n+ "is a Perfect number");
		 }else {
			 System.out.println(n+ "is not a perfect number");
		 }
	 }
 }
