//write a program to give input from user

 import java.io.*;
 class InputDemo {
	 public static void main( String[] args) throws IOException {
		 BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
               
		 BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Enter Name" );
		String name1 = br1.readLine();

		br1.close();
		
		System.out.println( "Enter name" );
		String name2 = br2.readLine();
	 }
 }


