class StringDemo6 {
	int x =18;
	void vote(int age) {
		if(age>=x) {
			System.out.println("Eligible");
		}else {
			System.out.println("not Eligible");
		}
	}
	public static void main(String[] args) {
		int age =19;
		StringDemo6 obj =new StringDemo6();

		obj.vote(age);
	}
}

		
