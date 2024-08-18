//WAP to find the sum of even and odd no. in an array.Display the sum value


import java.io.*;
class Sum {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array");
		int size = Integer.parseInt(br.readLine());
		int Evensum = 0;
		int Oddsum = 0;

		int arr[] = new int[size];
		System.out.println("Enter the elements of array");

		for(int i=0;i<arr.length;i++) {
			arr[i] =Integer.parseInt(br.readLine());

			if(arr[i]%2==0) {
				Evensum = arr[i] + Evensum;
			}else {
				Oddsum = arr[i] + Oddsum;
			}
		}
		System.out.println("Sum of even no is" +Evensum);
		System.out.println("Sum of Odd no. is" +Oddsum);
	}
}


