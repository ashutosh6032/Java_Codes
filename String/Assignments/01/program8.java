// write a real life example of your choice for classes and objects and constructor

import java.io.*;
class StringDemo8 {

	void result(float marks) {
		if(marks<35f) {
			System.out.println("Fail");
		}else if(marks>=35f && marks<75f) {
			System.out.println("pass");
		}else if(marks>75f) {
			System.out.println("pass with first class");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your marks");
		float marks = Float.parseFloat(br.readLine());

		StringDemo8 obj = new StringDemo8();

		obj.result(marks);
	}
}

