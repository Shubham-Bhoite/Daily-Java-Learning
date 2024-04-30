class MyInfo
{
	private String name, nativePlace, branch;

	MyInfo(String name, String nativePlace, String branch)
	{
		this.name=name;
		this.nativePlace=nativePlace;
		this.branch=branch;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String updateName)
	{
		this.name=updateName;
	}

	public String getNativePlace()
	{
		return nativePlace;
	}
	public void setNativePlace(String updateNativePlace)
	{
		this.nativePlace=updateNativePlace;
	}

	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String updateBranch)
	{
		this.branch=updateBranch;
	}
}

class Encapsulation
	{
		public static void main(String[] args) {
			MyInfo obj = new MyInfo("Shubham", "Pune", "Computer");
			System.out.println(obj.getName());
			obj.setName("SHUBHAM");
			System.out.println(obj.getName());
		
			
		}
	}