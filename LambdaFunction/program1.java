//Write a program to implement lambda function 
// ()->
// it works on only on the functional Interface(Only one method in the Interface)
// it doesn't create a new class 
// it reduce the length of code 



interface Core2Web {
	 void lang();
}
class Year2023 {
	public static void main(String[] args) {

		Core2Web c2w = new Core2Web() {
			public void lang() {
				System.out.println("Bootcamp/Java/Python/Dart");
			}
		};
		c2w.lang();
	}
}
