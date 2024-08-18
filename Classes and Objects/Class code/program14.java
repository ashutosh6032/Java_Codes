//call static and non static content 


class Demo {
	int x = 10;
	static int y = 20;

	void fun1() {
		System.out.println(x);
		System.out.println(y);
	}
	static void fun2() {
		System.out.println(y); //non static variables are not accessed by static method without creating object

	}
}
class ClassDemo14 {
	public static void main(String[] args) {

		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(Demo.y);

		obj.fun1();
		obj.fun2();
		Demo.fun2();
	}
}
