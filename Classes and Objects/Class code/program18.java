//instance block concept


class Demo18 {
	Demo18() {
		System.out.println("Constructor");
	}

	{
		System.out.println("Instance Block1");//instance block is a part of constructor and its executes before constructor
	}

	public static void main(String [] args) {
		Demo18 obj = new Demo18();
		System.out.println("In main");
	}

	{
		System.out.println("Instanance Block2");
	}
}
