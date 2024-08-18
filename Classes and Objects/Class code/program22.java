//write a program to call constructor to another constructor


class Demo22 {
	int x =10;

	Demo22() {
		System.out.println("In no argument Constructor");
	}

	Demo22(int x) {
		this();  //call to Demo22() this line should be first in otw error
		System.out.println("In parameterised Constructor");
	}

	public static void main(string [] args) {

		Demo22 obj = new Demo22(10);
	}
}





