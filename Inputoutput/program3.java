//write a program to take input from user using two buffered class 

 import java.io.*;
 class InputOutput {
	 public static void main(String [] args) throws IOException {
		 BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
	         BufferedReader br2= new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("Enter the Name:");
		 String name= br1.readLine();

		 System.out.println("Enter the Age:");
		 int Age= Integer.parseInt(br2.readLine());

		 System.out.println("Name is : "+name);
		 System.out.println("Age is : "+Age);
	 }
 }
