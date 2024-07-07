import java.util.Arrays;

class ArrayEx3_
{
	public static void main(String[] args) {
		int [][]a = new int [2][2];
		
		a[0][0] = 10 ;
		a[0][1] = 20 ;
		a[1][0] = 30;
		a[1][1] = 40;
		
		System.out.println(Arrays.deepToString(a));
	}
}