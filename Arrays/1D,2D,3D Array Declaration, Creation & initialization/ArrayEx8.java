import java.util.Arrays;

class ArrayEx8
{
	public static void main(String[] args) {
		int [][][]a = new int [1][][];
		a[0] = new int [2][2];
		
		a[0][0][0] = 10 ;
		a[0][0][1] = 20 ;
		a[0][1][0] = 30;
		a[0][1][1] = 40;
		
		System.out.println(Arrays.deepToString(a));
	}
}