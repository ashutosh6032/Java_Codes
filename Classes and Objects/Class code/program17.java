//Static block is different for each class 


class Demo17 {
	static {
		System.out.println("In Demo Static");
	}
	public static void main(String[] args) {
		System.out.println("in Demo main");
	}
}
class Client17 {
	static {
		System.out.println("In Client Static");
	}
	public static void main(String[] args) {
		System.out.println("In Client main");
	}
}
