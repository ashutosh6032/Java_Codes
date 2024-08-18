 //Write a program in java to accept three numbers and check whether they are pythagororean triplet or not 
 //a=3,b=4,c=5
 //if a*a+b*b=c*c then its pythagorean else not 
 
   class Pythagoras {
	   public static void main(String[] args) {
		   int a = 3;
		   int b = 4;
		   int c = 5;

		   if(a*a + b*b==c*c) {
			   System.out.println("its pythagorean");
		   }else if(a*a + c*c==b*b) {
			   System.out.println("its Pythagorean");
		   }else if (b*b + c*c==a*a) {
			   System.out.println("its Pythagorean");
		   }else {
			   System.out.println("its not Pythagorean");
		   }
	   }
   }

