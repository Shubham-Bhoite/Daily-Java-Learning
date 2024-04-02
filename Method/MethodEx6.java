class MethodEx6
{
	public static void main(String[] args) {
		String name = "SHUBHAM";
		char ch = demo(name, 3);
		System.out.println(name + " has a character " + ch + " at 3 index");
	}
	public static char demo(String name, int index)
	{
		char ch = name.charAt(index);
		return ch;
	}
}