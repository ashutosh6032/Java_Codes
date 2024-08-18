//Write a program to give all input in one line and prints separeate outputs using stringtokenizer class 
//stringTokenizer class is in util package

 import java.util.*;
 import java.io.*;
 
 class InputOutput {
	 public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		 System.out.println("Enter name age fees");
		 String info = br.readLine();

		 StringTokenizer obj = new StringTokenizer(info," ");

		 String token1= obj.nextToken();
		 String token2= obj.nextToken();
		 String token3= obj.nextToken();

		 System.out.println("Name is :" +token1);
		 System.out.println("Age is :" +token2);
		 System.out.println("Fees are:" +token3);
	 }
 }

