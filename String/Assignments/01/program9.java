//Write a method that checks whether all the character in a given string are vowels(a,e,i,o,u)  or not 


import java.io.*;
class StringDemo9 {
        static boolean vowels(String str) {
		char arr[]= str.toCharArray();
		int i=0;

		while(i<arr.length) {

			if(arr[i]!='a'&&arr[i]!='e'&&arr[i]!='i'&&arr[i]!='o'&&arr[i]!='u'&&arr[i]!='A'&&arr[i]!='E'&&arr[i]!='I'&&arr[i]!='O'&&arr[i]!='U'){
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args ) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string :");
		String str= br.readLine();

		System.out.println(vowels(str));
	}
}
