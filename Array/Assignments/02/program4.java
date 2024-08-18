//WAP to search specific element from an array and return its index 


import java.io.*;
class ArrayDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter elements of array: ");

		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("enter Search element");
		int element = Integer.parseInt(br.readLine());

		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				System.out.println("index is "+i);
			}
		}
	}
}
