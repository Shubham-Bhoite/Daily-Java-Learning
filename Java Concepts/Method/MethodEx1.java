class MethodEx1
{
	public static void main(String[] args) {
		System.out.println("Execution Starts");

		myMethod();
		checkEvenOdd(10);
		checkEvenOdd(33);
		System.out.println("Execution Ends");
	}
	public static void myMethod()
	{
		System.out.println("Hello from myMethod()");
	}
	public static void checkEvenOdd(int num){
		if(num%2==0)
		{
			System.out.println(num + " is even");
		}else{
			System.out.println(num + " is odd");
		}
	}
}