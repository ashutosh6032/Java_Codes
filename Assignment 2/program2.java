 // Write a program to calculate factorial of the given number
 //  input= 6
 
   class Factorial {
	   public static void main(String[] args) {
		   int n = 6;
		   int i = 1;
		   int fact = 1;

		   while(i<=n) {
			   fact = fact*i;
			   i++;
		   }
		   System.out.println(fact);
	   }
   }


