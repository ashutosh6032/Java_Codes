//Write a program to take input from the user to enter society name wing char and flat no.


 import java.io.*;
 class InputOutput{
	 public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		 
		 System.out.println("Enter Society Name: ");
		 String name= br.readLine();
                 
		 System.out.println("Enter wing :" );
		 char wing = (char) br.read();
		 br.skip(1);

		 System.out.println("Enter Flat No. : ");
		 int flat = Integer.parseInt(br.readLine());

		 System.out.println("Society Name is : "+name);
		 System.out.println("Wing : " +wing);
		 System.out.println("Flat no. is : "+flat);
	 }
 }
