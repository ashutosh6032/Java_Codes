//Write a program to reverse a string 
//


import java.io.*;
class StringDemo1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String: " );
		String str = br.readLine();

		StringBuffer sb = new StringBuffer(str);

		str = sb.reverse().toString();

		System.out.println(str);
	}
}

