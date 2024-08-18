//WAP to find the number of even and odd integer in a given array of integer 


import java.io.*;
class ArrayDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the Size of Array");
		int size = Integer.parseInt(br.readLine());
		int Evencount=0;
		int Oddcount = 0;

		int arr[] = new int[size];
                System.out.println("Enter the Elements of Array");

		for(int i =0;i<arr.length;i++) {
			arr[i] =Integer.parseInt(br.readLine());

			if(arr[i]%2==0) {
				Evencount++;
			}else {
				Oddcount++;
			}
		}
		System.out.println("Even No. count is: "+Evencount);
		System.out.println("Odd No. count is: " +Oddcount);
	}
}
