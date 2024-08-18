//Write a program to take input from user user using bufferedReader and print following pattern
//
//D4 C3 B2 A1
//A1 B2 C3 D4 
//D4 C3 B2 A1
//A1 B2 C3 D4


 import java.io.*;
 class Pattern {
	 public static void main(String [] args)throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter number Of Rows");
		 int row = Integer.parseInt(br.readLine());

		 for(int i=1;i<=row;i++) {

			 for(int j=1;j<=row;j++) {
				 if(i%2==1) {
					 char ch =(char)( 64 + row);
					 int x = row;
					 System.out.print(ch + " "+x);
					 ch--;
					 x--;
				 }else {
					 char c = 'A';
					 int y = i;
					 System.out.print(ch + " " +x);
					 c++;
					 y++;
				 }
			 }
			 System.out.println();
		 }
	 }
 }

