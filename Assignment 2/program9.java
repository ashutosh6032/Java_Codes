// write a program to check the given number is palindrome or not


class Palindrome {
	public static void main(String [] args) {
		int n =112211;
		int temp = n;
		int rev = 0;

		while(n!=0) {
			int rem = n%10;
			rev = (rev*10)+rem;
			n = n/10;
		}
		if(temp==rev) {
			System.out.println("its a palindrome no.");
		}else {
			System.out.println("it is not Palindrome no.");
		}
	}
}
