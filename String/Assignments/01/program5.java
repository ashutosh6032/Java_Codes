// write a program to print non repeating char in the string


import java.io.*;
class StringDemo5 {
	static void nrepeating(String str) {
		char arr[] = str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			int x = arr[i];
			for(int j=0;j<arr.length;j++) {

				if(x==arr[j]){
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string:");
		String str = br.readLine();

		nrepeating(str);
	}
}
