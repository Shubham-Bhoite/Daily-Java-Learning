import java.util.Arrays;
class Merging
{
	public static void main(String[] args) {
		int [] a={1,2,4,5};
		int [] b={7,8,6,9,3};
		int [] c=new int[(a.length)+(b.length)];

		int indx=0;
		for (int i :a ) 
			c[indx++]=i;

		for (int i :b ) 
			c[indx++]=i;
		
		System.out.println(Arrays.toString(c));
	}
}