// Access Specifiers 

class Core2web11 {
	int coursesno = 8;
	private String favcourse ="Java";
	

	void display() {
		System.out.println(coursesno);
		System.out.println(favcourse);
	}
}
class Student11 {
	public static void main(String[] args) {
		Core2web11 obj = new Core2web11();
		obj.display();
		System.out.println(obj.coursesno);
		//System.out.println(obj.favcourse);  Error:favcourse has private access in Core2web11.
	}
}
