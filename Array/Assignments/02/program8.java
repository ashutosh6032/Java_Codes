//WAP to find the uncommon elements between two arrays

import java.io.*;
class ArrayDemo8 {
         public static void main(String[] args) throws IOException{
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     System.out.println("Enter the size of First array");
	    int size = Integer.parseInt(br.readLine());

	    int arr1[] = new int[size];
	    int arr2[] = new int[size];

	    System.out.println("enter the Elements of first Array");
	    for(int i=0;i<arr1.length;i++) {
		    arr1[i] = Integer.parseInt(br.readLine());
	    }
	    System.out.println("Enter elements of second Array");
	    for(int i=0;i<arr1.length;i++) {
		    arr2[i] = Integer.parseInt(br.readLine());
	    }
	    int flag=0;
	    System.out.println("uncommon Elements of between two arrays");
	    for(int i=0;i<arr1.length;i++) {
		    for(int j=0;j<arr2.length;j++) {
			    if(arr1[i]==arr2[j]) {
				    flag=1;
			    }
		    }
		    if(flag==0) {
			    System.out.println(arr1[i]);
		    }
		    flag=0;
	    }
	    flag=0;
	    for(int i=0;i<arr2.length;i++) {
		    for(int j =0;j<arr1.length;j++) {
			if(arr2[i]==arr1[j]) {
				flag=1;
			}
		    }
		    if (flag==0) {
			    System.out.println(arr2[i]);
		    }
	    }

	 }
}
