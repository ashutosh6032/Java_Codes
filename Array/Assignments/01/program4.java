// Write a program take 7 character as in input print only vowels from the array


import java.io.*;
class ArrayDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter Characters");
		int size = Integer.parseInt(br.readLine());

		char arr[] = new char[size];

		System.out.println("Enter characters");
		for(int i=0;i<arr.length;i++) {
			arr[i] = (char) br.read();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a'){
				System.out.println(arr[i]);
			}else if(arr[i]=='e'){
				System.out.println(arr[i]);
			}else if(arr[i]=='i'){
				System.out.println(arr[i]);
			}else if(arr[i]=='o'){
				System.out.println(arr[i]);
			}else if(arr[i]=='u'){
				System.out.println(arr[i]);
			}
		}

	}
}
