//write a program to print this type of pattern
//3 3 3
//4 4 4
//5 5 5



  class Pattern { 
	  public static void main(String[] args) {
		  int x= 3;

		  for(int i=1;i<=3;i++) {
			  for(int j=1;j<=3;j++) {
				  System.out.print(x +" ");
			  }
			  x++;
			  System.out.println();

		  }
	  }
  }
