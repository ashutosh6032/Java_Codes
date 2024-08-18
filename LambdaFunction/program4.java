//Write a program to parameterized lambda function 

interface Career {
	void Education(String str);
}

class Ashutosh {
	public static void main(String[] args) {

		Career cc = (str)-> {                             //(String str)->,  (str)-> it works
			System.out.println("Education"+":"+str);
		};
		cc.Education("IT Eng");
	}
}

