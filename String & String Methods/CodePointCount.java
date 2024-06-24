class CodePointCount
{
	static String str= new String("ABCDEFGH");
	public static void main(String[] args) {

		int indx = userCodePointCount(3,4);
		System.out.println(str+" : " + indx);
	}
	public static int userCodePointCount(int startIndx, int endIndx)
	{
		if(startIndx>endIndx)
		{
			throw new StringIndexOutOfBoundsException("Wrong index :" + startIndx);
		}
		return endIndx-startIndx;
	}
}