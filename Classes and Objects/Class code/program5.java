class ConstructDemo5 {
	ConstructDemo5() {
		System.out.println("In Constructor");
	}

	void fun() {
		ConstructDemo5 obj = new ConstructDemo5();
	}

	public static void main(String[] args) {

		ConstructDemo5 obj1 = new ConstructDemo5();
		ConstructDemo5 obj2 = new ConstructDemo5();

		obj1.fun();
	}
}
