//WAP to find the comman elements between two arrays

import java.io.*;
class ArrayDemo7 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of First array");

		int size = Integer.parseInt(br.readLine());

		int arr1[] = new int[size];
		int arr2[] = new int[size];

		for(int i=0;i<arr1.length;i++) {
			arr1[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter the size of Second Array");

		for(int i=0;i<arr2.length;i++){
			arr2[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("same Elements of arrays are : ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
