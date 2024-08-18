//Write a program to print the square of even digit of given number
//intput: 942111423
//o/p: 4 16 4 16
 
  class Even{
	  public static void main(String[] args) {
		  int n= 942111423;

		  while(n!=0) {
			 int rem = n%10;
			 if(rem%2==0) {
				 System.out.println(rem*rem);
			 }
			 n=n/10;
		  }
	  }
  }

