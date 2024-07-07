class SwitchPrac4{
	public static void main(String[] args) {
		byte a =1;
		switch(a+0)
		{
			case 1: System.out.println("Case 1");break;
			case 2: System.out.println("Case 2");break;
			case 3: System.out.println("Case 3");break;
			case 4: System.out.println("Case 4");break;
			case 128: System.out.println("Case 128");break;
			default : System.out.println("Default block");break;
		}
	}
}