// Write a program to check wheather a given number is composite number or not.
// composite number: expect prime number


  class Composite {
	  public static void main (String [] args) {
		  int n = 5;
		  int count=0;
		  for(int i=1;i<=10;i++) {
			  if(n%i==0) {
				  count++;
			  }
		  }
		  if(count>2) {
			  System.out.println("Composite number");
		  }else {
	           System.out.println("Not a composite number");
		  }
	  }
  }

