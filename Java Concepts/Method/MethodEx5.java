class MethodEx5
{
	public static void main(String[] args) // calling method
	{
		System.out.println("MAIN start");
		vaibhav();
		System.out.println("MAIN ends");
		
	}

	public static void vaibhav() //called method
	{
		System.out.println("vaibhav start");
		arjun();
		System.out.println("vaibhav ends");
	}

	public static void arjun()
	{
		System.out.println("arjun start");
		sham();
		System.out.println("arjun ends");
	}

	public static void sham()
	{
		System.out.println("sham start");
		System.out.println("sham ends");
	}


}