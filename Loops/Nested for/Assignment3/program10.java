//Write a program for print following pattern
//1 2 3 4
//4 5 6 
//6 7
//7


  class Pattern {
	  public static void main (String [] args) {
		  int n =4;
		  int x =1;


		  for(int i=1;i<=n;i++) {

			  for(int j=1;j<=n-i+1;j++) {
				  System.out.print(x++ +" ");
			  }
			  x--;
			  System.out.println();
		  }
	  }
  }

