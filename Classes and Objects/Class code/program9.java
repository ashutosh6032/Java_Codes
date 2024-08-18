//write two classes in program and call the another class method from another class
//


class MD9 {
	int noitem = 5;
	String product = "fries";

	void order() {
		String menu1 = "veg";
		String menu2 = "non-veg";

		System.out.println(noitem);
		System.out.println(product);

	}
}
class User9 {
	public static void main(String[] args) {
		MD9 obj =new MD9();
		obj.order();
	}
}
