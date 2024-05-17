Class VariableShadowing
{
	int a=20;
	public static void main(String[] args) {
		VariableShadowing obj = new VariableShadowing();
		obj.m1();
	}
	public void m1()
	{
		int a= 200;
		System.out.println(a);
	}
}