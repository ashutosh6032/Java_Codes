//Write a program to store an elements in array and take it from user
 
import java.io.*;

 class ArrayDemo {
	 public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int arr[] = new int[5];

		 for(int i=0;i<5;i++) {
			 System.out.println("enter"+" "+(i+1)+" "+"Element");
			 arr[i] = Integer.parseInt(br.readLine());
		 }
		 for(int i=0;i<5;i++) {
			 System.out.println(arr[i]);
		 }
	 }
 }
