import java.util.Arrays;
class ZigZagMerging
{
	public static void main(String[] args) {
		int [] a = {1,2,3};
		int [] b = {4,5,6,7,8};

		//creating new array using both arrays length
		int [] narr = new int[(a.length)+(b.length)];

		//creating loop which will iterate till largest arrays length
		for (int i=0,j=0;i<b.length ;i++ ) {
			//check if index is less than index  or else AIOOBE
			if(i<a.length)
				narr[j++]=a[i];
			//storing element directly from bigger length array
			narr[j++]= b[i];
		}
		System.out.println(Arrays.toString(narr));
	}
}