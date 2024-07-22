class StaticVar1{
	static String str = "Hi , I am a static variable";
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(str);
		m1();
	}
	static void m1(){
		System.out.println(str);
	}
}