//Write a program ,take n as input and print its all factors

 class Factor {
	 public static void main(String[]args) {
		 int n = 6;

		 for(int i=1;i<=n;i++) {
			 if(n%i==0) {
				 System.out.println(i);
				 }
		 }
	 }
 }
