//write a program to user defined exceptions and implement in the program
//#User Defined Exceptions



 import java.util.Scanner;
 class DataOverFlowException extends RuntimeException {
	 DataOverFlowException(String msg) {
		 super(msg);
	 }
 }
 class DataUnderFlowException extends RuntimeException {
	 DataUnderFlowException(String msg) {
		 super(msg);
	 }
 }
 class ArrayDemo {
	 public static void main(String[] args) {
		 int arr[] = new int[5];
		 Scanner sc = new Scanner(System.in);

		 System.out.println("Enter only interger format data");
		 System.out.println("note: 0< element <100 ");

		 for(int i=0;i<arr.length;i++) {
			 int data = sc.nextInt();
			 if(data<0)
				 throw new DataUnderFlowException("Mitra data ha 0 peksha lahan aahe");
			 if(data>100)
				 throw new DataOverFlowException("Mitra data ha 100 peksha mota aahe");
		   arr[i]= data;
		 }
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i] + " ");
		 }
	 }
 }
		 
