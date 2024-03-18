class SwitchPrac6{
	public static void main(String[] args) {
		byte a=1;
		switch(a+0)
		{
		case 1: System.out.println("Case 1");break;
		case 2: System.out.println("Case 2");break;
		case 'A': System.out.println("Case A");break;
		case 65: System.out.println("Case 65");break;
		case 128: System.out.println("Case 128");break;
		default : System.out.println("Default block");break;
		}
	}
}