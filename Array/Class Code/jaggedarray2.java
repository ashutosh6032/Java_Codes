// WAP to methods of intitialization of jagged array


class JaggedArray2 {
	public static void main(String[] args) {
		//First method of initialization
		int arr[][] = new int[3][];
		arr[0] =new int[]{10,20,30};
		arr[1] =new int[]{40,50};
		arr[2] =new int[]{60};

		//Second method of initialization
		int arr2[][] ={{10,20,30},{40,50},{60}};
	       
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" " );
			}
			System.out.println();
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}


