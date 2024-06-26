import java.util.Arrays;

class ArrayEx7
{
	public static void main(String[] args) {
		int [][]a = new int [2][];
		a[0] = new int [2];
		a[1] = new int [4];
		a[0][0] = 10 ;
		a[0][1] = 20 ;
		a[1][0] = 30;
		a[1][1] = 40;
		a[1][2] =50;
		a[1][3] = 60;
		System.out.println(Arrays.deepToString(a));
	}
}