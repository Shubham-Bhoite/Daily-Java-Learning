import java.util.Arrays;

class ArrayEx10
{
	public static void main(String[] args) {
		int [][][]a = new int [2][][];
		a[0] = new int [1][2];
		a[1] = new int [1][4];
		a[0][0][0] = 10 ;
		a[0][0][1] = 20 ;
		a[1][0][0] = 30;
		a[1][0][1] = 40;
		a[1][0][2] =50;
		a[1][0][3] = 60;
		System.out.println(Arrays.deepToString(a));
	}
}