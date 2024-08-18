//Write a program for parameterized Lambda function ()->


interface Core2Web {
	void lang(String str);
}

class Students {
	public static void main(String[] args) {
		Core2Web c2w = new Core2Web() {
			public void lang(String str) {
				System.out.println("Core2Web" + ":" +str);
			}
		};
		c2w.lang("Shashi");
	}
}
