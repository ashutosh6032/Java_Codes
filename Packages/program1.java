// write a program to import our user defined package ashu and call its add() method

import java.io.*;
import ashu.Addition;
import ashu.Multiplication;

class Addition1 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first no.");
		int x = Integer.parseInt(br.readLine());

		System.out.println("Enter second No.");
		int y = Integer.parseInt(br.readLine());

		Addition obj = new Addition(x,y);
		obj.add();

		Multiplication obj2 = new Multiplication(x,y);
		obj2.multi();
	}
}

		


