class StaticBlock2{
	static{
		System.out.println("Hello from SB2");
	}
	public static void main(String[] args) {
		System.out.println("Hi from main");
		StaticBlock3.m1();
	}
	static{
		System.out.println("Hello from SB3");
	}
}

class StaticBlock3{
	static{
		System.out.println("Hello from SB");
	}
	public static void m1(){
		System.out.println("Hi from m1()");
	}
}