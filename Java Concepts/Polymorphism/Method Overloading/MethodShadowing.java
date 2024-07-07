class Ramesh
{
	public static void greeting()
	{
		System.out.println("Good Morning");
	}
}

class Suresh extends Ramesh
{
	public static void greeting()
	{
		System.out.println("Good Afternoon");
	}
}

class MethodShadowing
{
	public static void main(String[] args) {
		Suresh obj = new Suresh();
		obj.greeting();
	}
}