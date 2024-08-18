//sequence of execution of Static and instance block


class Demo19 {

	Demo19() {
		System.out.println("In Constructor");
	}

	static {
		System.out.println("In Static block1");
	}

	{
		System.out.println("In Instatance Block1");
	}

	public static void main(String[] args ) {
		Demo19 obj = new Demo19();
		System.out.println("In Main");
	}
	static {
		System.out.println("In Static block2");
	}

	{
		System.out.println("In Instanance Block2");
	}
}
