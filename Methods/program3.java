//Write a program to call a non static method from main method with return value


class Mdemo {
	void Fun(float x) {
		
	  System.out.println(x);
       	}

	public static void main(String[] args ) {
		Mdemo obj = new Mdemo();
		obj.Fun(10);
	}
}
