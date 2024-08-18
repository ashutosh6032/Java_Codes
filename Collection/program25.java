//GArbage Collector Working


class Demo {
	String str = null;
	
	Demo(String str) {
		this.str = str;
	}
     	public String toString() {
		return str;
	}
	public void finalize() {
		System.out.println("Notify");
	}
}
class GCDemo {
	public static void main(String[] args) {

		Demo obj1 = new Demo("Core2Web");
		Demo obj2 = new Demo("Incubator");
		Demo obj3 = new Demo("Biencaps");

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		obj2 = null;
		
		System.gc();

		System.out.println(obj2);
		
	}
}

