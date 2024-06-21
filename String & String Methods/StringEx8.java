class StringEx8
{
	public static void main(String[] args) {
	String name1= new String("java");
	String name2= new String("java");

	StringBuffer sb1 = new StringBuffer("python");
	StringBuffer sb2 = new StringBuffer("python");

	int a = 4;
	int b = 4;

	System.out.println(name1==name2);//false
	System.out.println(name1.equals(name2));//true

	System.out.println(sb1==sb2);//false
	System.out.println(sb1.equals(sb2));
	System.out.println(a==b);//true

	}
	
}

