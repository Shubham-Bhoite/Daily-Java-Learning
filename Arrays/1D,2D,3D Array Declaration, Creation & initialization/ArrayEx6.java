import java.util.Arrays;

class ArrayEx6
{
	public static void main(String[] args) {
		int [][][]a = new int [3][][];
		a[0] = new int [2][1];
		a[1] = new int [3][2];
		a[0][0][0] = 10 ;
		a[0][0][1] = 20 ;
		a[0][1][0] = 30;
		a[1][0][0] = 40;
		a[1][1][0] = 50;
		a[1][1][1] = 60;
		a[1][2][0] = 70;
		a[1][2][1] = 80;
		a[1][2][2] = 90;
		System.out.println(Arrays.deepToString(a));
	}
}