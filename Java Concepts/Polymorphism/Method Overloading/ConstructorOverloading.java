class ConstructorOverloading
{
	public static void main(String[] args) {
		
	}
}

class Ramesh
{
	Ramesh()
	{
		System.out.println("Hello");
	}
	public static void m1(int a) {
		System.out.println("m1");
	}
}

class Suresh extends Ramesh
{
	Suresh()
	{
		System.out.println("Hello Suresh");
	}
	void Ramesh(int a)
	{
		System.out.println("Hello");
	}
	public static void m1() {
		System.out.println("Byee");
	}
}