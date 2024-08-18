//Write a program for print following pattern
//F
//E F
//D E F
//C D E F
//B C D E F
//A B C D E F


   class Pattern {
	   public static void main(String[] args) {
		   int n= 6;
		   char ch ='F';
		   char temp = ch;

		   for(int i=1;i<=n;i++) {

			   for(int j=1;j<=i;j++) {
				   System.out.print(ch++ +" ");
			   }
			   temp--;
			   ch=temp;
			   System.out.println();
		   }
	   }
   }
