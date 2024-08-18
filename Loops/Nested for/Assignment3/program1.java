// write a program for following pattern
// c2W
// C2w c2w 
// c2w c2w c2w
// c2w c2w c2w c2w


 class Pattern {
	 public static void main(String [] args) {

		int n = 4;

		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("c2w ");
			}
		System.out.println();
		}
	 }
 }
