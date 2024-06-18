class StringEx3
{
	public static void main(String[] args) {
		String MayurGf = "";
		String MayurWife = "Simran";

		if(MayurGf.isEmpty())
		{
			try
			{
				throw new MayurGirlFriendException("Mayur does not have any GF");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				if(MayurWife.isEmpty())
				{
					System.out.println("Mayur does not have wife");
				}
				else
				{
					System.out.println("Wife name :" + MayurWife);
				}
			}
		}
	}
}

class MayurGirlFriendException extends Exception
{
	String message;
	MayurGirlFriendException(String message)
	{
		super(message);
	}
}