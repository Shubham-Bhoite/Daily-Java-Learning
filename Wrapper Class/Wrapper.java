// Wrapper==> wrapper class in java means to convert primitive into non-primitive and non-primitive into primitive.

class Wrapper
{
	public static void main(String[] args) {
		Integer a = 20;
		System.out.println(a);

		Integer b = Integer.valueOf(20);
		System.out.println(b);
	}
}

class Wrapper
{
	public static void main(String[] args) {
		Integer a =127;
		Integer b = 127;
		System.out.println(a==b);

		Integer c = 128;
		Integer d =128;
		System.out.println(c==d);
	}
}