class ForLoop2{
	public static void main(String[] args) {
		System.out.println("Upper case A to Z : ");
		for(char ch='A';ch<='Z' ;ch++ ) {
			System.out.println(ch+ " ");
		}
		System.out.println("*********************************************");

		System.out.println("Lower case a to z : ");
		for(char ch='a';ch<='z' ;ch++ ) {
			System.out.println(ch+" ");
		}
		System.out.println("*********************************************");

		System.out.println("Ascending order 0 to 9 :");
		for(int i=0;i<=9 ;i++ ) {
			System.out.println(i+ " ");
		}
		System.out.println("*********************************************");

		System.out.println("Descending order 9 to 0 :");
		for(int i=9;i>=0 ;i-- ) {
			System.out.println(i+ " ");
		}
	}

}