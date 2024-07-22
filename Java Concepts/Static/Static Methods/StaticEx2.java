class StaticEx2{
	public static void m1(){
		System.out.println("Hello from m1()");
	}
	public static void main(String[] args) {
		m1();
		StaticEx2.m1();
		m2("m2()");
		StaticEx2.m2("m2()");
	}
	public static void m2(String name){
		System.out.println("Hello from " + name);
	}
}