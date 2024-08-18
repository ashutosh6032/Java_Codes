//WAP to take size of array from user and also take integer elements from user print product of even elements only

import java.io.*;
class ArrayDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of Array: " );
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int multi =1;

		System.out.println("Enter Elements Of Array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] =Integer.parseInt(br.readLine());

			if(arr[i]%2==0) {
				multi = multi*arr[i];
			}
		}
		System.out.println("product of Even no. is "+multi);
	}
}

