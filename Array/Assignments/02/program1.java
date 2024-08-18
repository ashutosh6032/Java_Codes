// WAP to create an array of n integer element
// where n value should be taken from user
// insert the value from user andfind the sum of all element in array


import java.io.*;
class ArryDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array");
		int size = Integer.parseInt(br.readLine());

		int arr[] =new int[size];
		int sum=0;

		System.out.println("Enter Elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());

			sum = sum + arr[i];
		}
		System.out.println("sum of all elements of array: "+sum);
	}
}

