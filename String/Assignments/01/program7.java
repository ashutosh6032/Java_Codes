//write a method to caculate area of triangle (take required inputs from user)

import java.io.*;
class StringDemo7 {
	static float area(float h,float b) {
		float area = (b*h)/2;
		return area;
	}

	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the height of triangle");
		float h = Float.parseFloat(br.readLine());

		System.out.println("Enter the breadth of triangle");
		float b = Float.parseFloat(br.readLine());

		System.out.println("Area of triangle is:"+area(h,b));
	}
}

