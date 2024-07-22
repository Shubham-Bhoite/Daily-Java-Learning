class ExStatic{
	static{
		System.out.println("Hi from SB1");
		m1();
		System.exit(0);
	}
	public static void m1(){
		System.out.println("Hello from m1()");
		ExStatic1.m2();
	}
}

class ExStatic1{
	public static void m2(){
		System.out.println("Hello from m2()");
	}
}