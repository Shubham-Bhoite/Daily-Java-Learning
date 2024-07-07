class MethodEx7
{
	public static void main(String[] args) {
		System.out.println("HELLO from main()");
		m1();
		System.out.println("BYE from main()");
	}

	public static void m1()
	{
		System.out.println("HII from m1()");
		String[] args = {"arjun", "varad"};
		main(args);
		System.out.println("Byee from m1()");
	}
}