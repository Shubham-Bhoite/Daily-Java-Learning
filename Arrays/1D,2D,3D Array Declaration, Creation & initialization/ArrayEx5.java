import java.util.Arrays;

class ArrayEx5
{
	public static void main(String[] args) {
		int [][][]a = new int [2][][];
		a[0] = new int [1][3];
		a[1] = new int [2][2];
		a[0][0][0] = 10 ;
		a[0][0][1] = 20 ;
		a[0][0][2] = 30;
		a[1][0][0] = 40;
		a[1][0][1] =50;
		a[1][1][0] = 60;
		System.out.println(Arrays.deepToString(a));
	}
}