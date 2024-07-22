class StaticVar4{
	static String vr = "Hii, I am a global ";
	public static void main(String[] args) {
		String ve = "Hii, I am a local";
		System.out.println(vr);
		
		m1();
	}
	public static void m1(){
		System.out.println(vr);
	}
}