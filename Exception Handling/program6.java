//Write a program for NumberFormat Exception and it is handeled in the try and catch

 import java.io.*;
 class Demo6 {
	 public static void main(String[] args) throws IOException {

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 String str = br.readLine();
		 System.out.println(str);
		 
		 int data = 0; // here we have to declare variables outside the try and catch
		 try {
			  data = Integer.parseInt(br.readLine());
		 } catch(NumberFormatException obj) {
			 System.out.println("Enter Number format Data");
			  data = Integer.parseInt(br.readLine());
		 }

		 System.out.println(data);
	 }
 }
