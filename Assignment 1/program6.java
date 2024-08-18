 //Write a java program for finding maximum number betweeen three numbers
   
 class Maximum {
	 public static void main(String[]args) {
		 int num1 = 11;
		 int num2 = 2;
		 int num3 = 11;

	if (num1>num2 & num1>num3) {
		System.out.println(num1+ "is greater than num2 	and num3");
	}else if(num2>num1 & num2>num3) {
		System.out.println(num2+ " is greater than num1 and num3");
	}else if(num3>num1 & num3>num2) {
		System.out.println(num3+ " is greater than num1 and num2");
	}else if(num1==num2<num3){
		System.out.println(num3+ " is greater");
	}else if(num1==num2>num3) {
		System.out.println("num1&num3 is greater");
	}else if(num1==num3>num2) {
		Sytem.out.println( "num1&num3 is greater");
	}else if(num1==num3<num2) {
		System.out.println(num2+ " is greater");
	}else if(num2==num3<num1) {
		System.out.println(num1+ "is greater");
	}else if(num2==num3>num1) {
		System.out.println( "num2&num3 is Greater");
	}
	 }

 }
