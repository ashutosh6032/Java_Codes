// Write a program TO call constructor to another constructor in one class


class Demo23 {
	int x = 10;
	Demo23() {
		this(0);

		System.out.println("In no argument constructor");

	}

	Demo23(int x) {
		System.out.println("In parameterised Constructor");
	}

	public static void main(String [] args) {
		Demo23 obj = new Demo23();
	}
}

