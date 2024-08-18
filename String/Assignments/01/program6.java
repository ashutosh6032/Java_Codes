//Write a java method to check whether a string is a valid password( return true if password length is greater than 8 it containa atleast one alphabet and number)

import java.io.*;
class StringDemo6 {
	static boolean password(String str) {
		char arr[] = str.toCharArray();
		int i=0;
		if(arr.length>0){
			while(i<arr.length) {

				if((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z')&&(arr.length>=8)) {
					return true;
				}else 
					return false;
				}
			}
			return false;
		}
	

		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the String");
			String str= br.readLine();

			if(password(str)) {
				System.out.println("valid password");
			}else {
				System.out.println("Invalid password");
			}
		}
	}

