// write a program take a number n and count its factor and print its count of factors


 class Count {
	 public static void main(String[]args) {
		 int n = 7;
		 int count = 0;

		 for(int i=1;i<=n;i++) {
			 if(n%i==0) {
				 count++;
			 }
		 }
		 System.out.println(count);
	 }
 }
