//WAP to take size of array from user and also take integer elements from user find the minimum elements from the array


import java.io.*;
class MinimumEle {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter teh size of array");
		int size = Integer.parseInt(br.readLine());
		

		int arr[] = new int [size];
		System.out.println("Enter Elements of Array");
		for(int i=0;i<arr.length;i++) {
			arr[i] =Integer.parseInt(br.readLine());
		
		}
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum no. is"+min);
	}
}

