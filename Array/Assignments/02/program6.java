//WAP to take size of aaray from user and also take integer elements from user find the maximum element from array


import java.io.*;
class MaximunEle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		System.out.println("Enter size of an Array");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int [size];

		System.out.println("Enter the Elements of Array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("The maximum Element of Array: "+max);
	}
}

