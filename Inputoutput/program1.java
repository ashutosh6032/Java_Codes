//Write a program to give input from user using bufferedReader


 import java.io.*;
 class Cricket {
	 public static void main(String[]args) throws IOException {
		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("Enter Batsman Name: ");
		 String name = br.readLine();

		 System.out.println("Enter Boller Name: ");
	         String name1 = br.readLine();

		 System.out.println("Batsman name is : "+name);
		 System.out.println("Boller Name is : " +name1);
	 }
 }


