//write a program that checks if the given string is palindrome or not


import java.io.*;
class StringDemo4 {
	static boolean palindrome(String str) {
		char arr[] =str.toCharArray();
		int start=0;
		int end= arr.length-1;

		while(start<end){
			int i=str.charAt(start);
			int j=str.charAt(end);

			if(i!=j){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String");
		String str= br.readLine();

		if(palindrome(str)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
	}
}

