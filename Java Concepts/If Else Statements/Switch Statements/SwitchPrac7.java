class SwitchPrac7{
	public static void main(String[] args) {
		byte a=1;
		switch(a+0)
		{
		case 1: System.out.println("Case 1");break;
		case 'b' : System.out.println("Case b");break;
		case "B" : System.out.println("Case B");break;
		default : System.out.println("Default block");break;
		}
	}
}