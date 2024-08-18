//write a program to store elements of array and take input from user using scanner


import java.util.*;
class ArrayDemo {
	public static void main( String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter Elements");

		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}
}
