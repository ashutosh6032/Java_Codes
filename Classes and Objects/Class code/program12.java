

class Demo12 {
	int x =10;
	private int y = 20;
	static int z = 30;

	void disp() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
class Client12 {
	public static void main(String[] args) {
		Demo12 obj1 = new Demo12();
		Demo12 obj2 = new Demo12();

		obj1.disp();

		obj1.x =100;
		obj2.x =300;

		obj1.disp();
		obj2.disp();
	}
}
