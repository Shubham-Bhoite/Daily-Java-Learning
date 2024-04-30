class Student
{
	String name;
	String branch;

	private Student(String name, String branch)
	{
		this.name = name;
		this.branch = branch;
	}

	public static void main(String[] args) 
	{
		System.out.println("HELLO FROM STUDENT MAIN");
		Student obj = new Student("RAMESH", "MECH");
		System.out.println(obj);
		Student obj1 = new Student("SURESH", "MECH");
		System.out.println(obj1);

		if(obj==null)
		{
			System.out.println("created");
		}else{
			System.out.println(obj);
		}
	}
}