// number format exception
// this exception comes in the example of coming data like we have int but coming data is in the form of stirng then this exception occurs

 import java.io.*;
 class Demo3 {

	 void getmethod() throw IOException {
		 BufferedReader br = new BufferedReader( new InputStreamReader ( System.in) );
		 System.out.println("Enter any number"); //if user enter string then no. format ex. occures
		
		 int data = Integer.parseInt(br.readLine());

		 System.out.println(data);
	 }

	 public static void main( String[] args) throws IOException {

		 Demo3 obj = new Demo3();
		 obj.getmethod();

	 }
 }
