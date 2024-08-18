//Write a program for following pattern
//A 1 B 2
//A 1 B 2
//A 1 B 2


 class Pattern {
	 public static void main(String[] args) {

		 for(int i=1;i<=3;i++) {
			 char ch = 'A';
			 int x = 1;
			 for(int j=1;j<=4;j++) {
				 if(j%2==1) { 	 //this condition for first row
					System.out.print(ch++ +" ");
				 }else {        //this codition for 2,4 6 ... row position i%2==0
					System.out.print(x++ +" ");
				 }
			
			 } 
			 System.out.println();

		 }
	 }
 }


