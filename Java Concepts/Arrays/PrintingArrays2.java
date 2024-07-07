class PrintingArrays2
{
	public static void main(String[] args) {
		int [][] a = {{10,20,30}, {40,50,60}};

		// 1.used when only index required 
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}

		// 2.used when only data store, don't require index
		for(int[] i :a)
		{
			for(int j : i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}