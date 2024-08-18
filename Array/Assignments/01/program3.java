//WAP to take size of array from user and also take integer elements from userprint product of odd index only

import java.io.*;
class ArrayDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size of Array: " );
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		int multi = 1;

		System.out.println("Enter Elements: " );
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());

			if(i%2==1) {
				multi = multi*arr[i];
			}
		}
		System.out.println("product of odd index is : "+multi);
	}
}
