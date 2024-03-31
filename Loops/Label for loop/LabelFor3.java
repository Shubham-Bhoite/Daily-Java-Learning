class LabelFor3
{
	public static void main(String[] args) {
		evenloop:
		for(int i=1; i<=100; i++){
			if(i%2 != 0)
				continue evenloop;
				System.out.println(i);		
			}
	}
}