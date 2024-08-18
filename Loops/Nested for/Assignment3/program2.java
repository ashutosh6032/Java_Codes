// write a porgram to print following pattern
// 1
// 2 3
// 4 5 6 
// 7 8 9 10


 class Pattern {
	 public static void main(String[] args) {
		 int n =4;
		 int x =1;

		 for(int i=1;i<=n;i++) {

			 for(int j=1;j<=i;j++) {
				 System.out.print(x++ +" ");
			 }
		   System.out.println();
		 }
	 }
 }
