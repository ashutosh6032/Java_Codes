//call static content by directly using class name

class Demo {

	static int x = 10;
	static int y = 20;
	
      static void fun() {
		System.out.println(x);
		System.out.println(y);
      }
}
class ClassDemo13 {
	public static void main(String[]args) {
		System.out.println(Demo.x);
		System.out.println(Demo.y);
	       
		Demo.fun();
	}
}

