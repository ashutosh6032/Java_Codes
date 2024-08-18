class ArrayDemo {
	void fun(int arr[]) {
		arr[1]= 70;
		arr[2]= 80;
	}
	public static void main(String[] args) {
		ArrayDemo obj = new ArrayDemo();
		int arr[] =new int[]{10,20,30,40};
		obj.fun(arr);
		for(int x:arr) {
			System.out.println(x);
		}
	}
}

