//this reference for parameterized and no argument constructor


class Demo21 {
	int x = 10;

	Demo21() {
		System.out.println("In no Argument constructor");
	}
	Demo21(int x) {
		System.out.println("In Parameterised Constructor");
	}
	public static void main(String[] args) {
		Demo21 obj = new Demo21();
		Demo21 obj2 = new Demo21(10);
	}
}

