//Write a program for following pattern
//10 10 10 10
//11 11 11
//12 12 
//13


 class Pattern {
	 public static void main( String [] args) {
		 int n =4;
		 int x =10;

		 for(int i=1;i<=n;i++) {

			 for(int j=1;j<=n-i+1;j++) {
				 System.out.print(x +" ");
			 }
			 x+=1;
			 System.out.println();
		 }
	 }
 }
			 
