//Static block initialization


class Demo16 {
	int x = 10;
	static int y =20;

	static{                                       //static block initializes before main method 
		System.out.println("static block 1");
	}
	public static void main(String[] args) {
		Demo16 obj = new Demo16();
		System.out.println(obj.x);
	}
	static {                                      //and staic blocks are executes sequentially
		System.out.println("static block 2");
		System.out.println(y);
	}
}
