//WAP to take size of array from user and also take integer elements from user print sum of odd elements only

import java.io.*;
class ArrayDemo {
	public static void main(String[] args ) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int sum = 0;

		System.out.println("Enter the Elements: ");

		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i]%2==1) {
				sum = sum + arr[i];
			}
		}
		System.out.println("sum of odd number is = "+sum);
	}
}
	
