class Parent
{
	String str = "HI FROM PARENT CLASS";
	void m1()
	{
		System.out.println("HELLO FROM PARENT M1()");
	}
	static void m3()
	{
		System.out.println("HELLO FROM M3() STATIC PARENT");
	}
}

class Child extends Parent
{
	String str = "HI FROM CHILD CLASS";
	void m2()
	{
		System.out.println("HELLO FROM CHILD M2()");
		System.out.println(super.str);
	}
	static void m4()
	{
		System.out.println("HELLO FROM M4() STATIC CHILD");
	}
}

class InheritanceDriver
{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
		//System.out.println(obj.str1);
		obj.m3();

	}
}