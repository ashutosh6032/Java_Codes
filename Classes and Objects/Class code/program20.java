// write a program to print sequence of the static block and instance block


class Demo20 {
	int x = 10;
	static int y = 20;
	Demo20() {
		System.out.println("In Constructor");
	}
	static {
		System.out.println("In Static block 1");
	}

	{
		System.out.println("In Instance block1 ");
	}
	
	public static void main(String [] args) {
		Demo20 obj = new Demo20();

	}
	static {
		System.out.println("In static block 2");
	}

	{
		System.out.println("In instance Block2");
	}
}


