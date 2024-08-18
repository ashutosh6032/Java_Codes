//initialization of string


class StringDemo {
	public static void main(String[] args) {
		String str1 = "Ashutosh"; //SCP
		String str2 = new String("Ashutosh"); //heap
		char str3[] = {'A','s','h','u'}; //Heap

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
