// Write a program to check if two string anagram or not(An anagram of a string of a string is another string that contains the same characters only the order of character
// can be different for ex. alekh and leakh are an anagram of each other

import java.io.*;
class StringDemo2 {
           static boolean anagram(String str1,String str2) {
		   char arr1[] = str1.toCharArray();
		   char arr2[] = str2.toCharArray();

		   if(arr1.length!=arr2.length) {
			   return false;
		   }

		   for(int i=0;i<arr1.length;i++) {
			   int x=arr1[i];
			   for(int j=0;j<arr2.length;j++) {
				   if(x!=arr1[j]) {
					   return false;
				   }
			   }
		   }
		       return true;
	   }



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the first String:");
		String str1 = br.readLine();
		System.out.println("Enter the Second String:");
		String str2 = br.readLine();

		

		if(anagram(str1,str2) {
			System.out.println("strings are anagram");
		}else {
			System.out.println("Strings are not anagram");
		}
	}
}
