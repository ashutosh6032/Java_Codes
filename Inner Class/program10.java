// Annonymous Inner class Implementation
// annonymous inner class is also called one time use class
// if we create a new object then it create a new class
// In this type of Innner class we done basically Overrriding of method

 class Demo {
	 void marry() {
		 System.out.println("Kriti Sanon");
	 }
 }
 class Client10 {
	 public static void main(String[] args) {

		 Demo obj = new Demo() {
			
				 void marry() {
					 System.out.println("Disha Patni");
				 }
			  };

		 obj.marry();
	 }
 }

