//WAP to print hashcodes of strings


class StringDemo1 {
	public static void main(String[] args) {
		String str1 = "Ashutosh";
		String str2 = new String("Ashutosh");
		char str3[] = {'A','s','h','u'};

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}

