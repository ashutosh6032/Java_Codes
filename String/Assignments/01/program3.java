//Write a program to number of vowels in the string


import java.io.*;
class StringDemo3 {

	static int vowelcount(String str) {
		char arr[] = str.toCharArray();
		int count =0;
		int x =0;
		
		while(x<arr.length) {
			
			if(arr[x]=='a'||arr[x]=='e'||arr[x]=='i'||arr[x]=='o'||arr[x]=='u'||arr[x]=='A'||arr[x]=='E'||arr[x]=='I'||arr[x]=='O'||arr[x]=='U'){
				count++;
			}
			x++;
		}
		  return count;
	}

	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = br.readLine();

		System.out.println("the count of vowels are:"+vowelcount(str));
	}
}

